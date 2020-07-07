package com.dx.admindx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class viajeActivity extends AppCompatActivity {

    private int idRemolque ;
    private TextView caja,folio,cliente,unidad,carga,ruta,tipo,operador,origen,destino,fechaVentanaD,fechaSalidaO,eta ;
    private String user , password , Nremolque;
    private DxApi dxApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viaje);

        caja = (TextView)  findViewById(R.id.tV_desc);
        folio = (TextView)  findViewById(R.id.text_folio);
        cliente = (TextView)  findViewById(R.id.text_cliente);
        unidad = (TextView)  findViewById(R.id.text_unidad);
        carga = (TextView)  findViewById(R.id.text_carga);
        ruta = (TextView)  findViewById(R.id.text_ruta);
        tipo = (TextView)  findViewById(R.id.text_tipo);
        operador = (TextView)  findViewById(R.id.text_operador);
        origen = (TextView)  findViewById(R.id.text_origen);
        destino = (TextView)  findViewById(R.id.text_destino);
        fechaVentanaD = (TextView)  findViewById(R.id.text_fechaVDestino);
        fechaSalidaO = (TextView)  findViewById(R.id.text_fechaSOrigen);
        eta = (TextView)  findViewById(R.id.text_eta);


        idRemolque = (int) getIntent().getIntExtra("idRemolque",0);
        Nremolque = getIntent().getStringExtra("nombreRemolque");
        SharedPreferences preferences = viajeActivity.this.getSharedPreferences ("credenciales", Context.MODE_PRIVATE);
        user = preferences.getString("user","");
        password = preferences.getString("pass","");

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://dxxpress.net/API/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        dxApi = retrofit.create(DxApi.class);

        Post3 post3 = new Post3(user,password,idRemolque);

        Call<List<CViaje>> callViaje = dxApi.getRemolque(post3);

        callViaje.enqueue(new Callback<List<CViaje>>() {
            @Override
            public void onResponse(Call<List<CViaje>> call, Response<List<CViaje>> response) {
                if(!response.isSuccessful()){
                    Toast.makeText(viajeActivity.this, "Error 404F", Toast.LENGTH_LONG).show();
                }
                List<CViaje> cViajes = response.body();

                for(CViaje t : cViajes){

                    String Sfolio = t.getFolioViaje() ;
                    String Sunidad = t.getClaveUnidad(); //
                    String Scliente= t.getIdCliente() ;
                    String Scarga= t.getDescripcionCarga() ;
                    String Sruta = t.getNombreRuta();
                    String Stipo= t.getDescripcionTipoMovimiento() ;
                    String Soperador = t.getNombreOperador() ; //
                    String Sorigen = t.getNombreOrigen() ;
                    String Sdestino = t.getNombreDestino() ;
                    String SfechaVentanaD =t.getFechaVentanaDestino() ; //
                    String SfechaSalidaO = t.getFechaSalidaOrigen() ;//
                    String Seta = t.getEtaCalculado();

                    if (Sunidad.isEmpty())
                    {Sunidad = "No asginada" ;}

                    if (Soperador.isEmpty())
                    {Soperador = "No asginado" ;}

                    if (SfechaVentanaD.isEmpty())
                    {SfechaVentanaD = "No asginada" ;}

                    if (SfechaSalidaO.isEmpty())
                    {SfechaSalidaO = "No asginada" ;}

                    folio.setText(Sfolio);
                    unidad.setText(Sunidad);
                    cliente.setText(Scliente);
                    carga.setText(Scarga);
                    ruta.setText(Sruta);
                    tipo.setText(Stipo);
                    operador.setText(Soperador);
                    origen.setText(Sorigen);
                    destino.setText(Sdestino);
                    fechaVentanaD.setText(SfechaVentanaD);
                    fechaSalidaO.setText(SfechaSalidaO);
                    eta.setText(Seta);
                    caja.setText(Nremolque);

                }

            }

            @Override
            public void onFailure(Call<List<CViaje>> call, Throwable t) {
                Toast.makeText(viajeActivity.this, "Error 404F", Toast.LENGTH_LONG).show();
            }
        });

    }



}
