package com.dx.admindx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class solicitarTicketActivity extends AppCompatActivity {

    private EditText asunto,desc ;
    private Spinner tema , patio ;
    private Button btn ;
    private String [] motivos;
    private String [] patios;

    @Override
    protected void onStart() {

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, motivos);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        tema.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, patios);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        patio.setAdapter(adapter2);

        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitar_ticket);

        motivos = new String[]{"Falla de Correo Electronico","Falla de Computadora","Falla Electrica","Hardware (mouse,taclado,monitor,etc)","Red/Internet",
        "Software(configuracion,office,etc)","Sistema DX","Soporte", "Otro"};

        patios = new String[]{"Monterrey","Silao","Nuevo Laredo","San Luis","Ramos","Laredo TX","Otro"};

        asunto = (EditText) findViewById(R.id.editText);
        desc = (EditText)findViewById(R.id.editText2);
        tema = (Spinner) findViewById(R.id.spinner2);
        patio = (Spinner)findViewById(R.id.spinner);
        btn = (Button) findViewById(R.id.button2);





    }
}
