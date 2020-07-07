package com.dx.admindx;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class unidadFragment extends Fragment {

    private AutoCompleteTextView autocomplete ;
    private ImageView imageView ;
    private String user , password , nombreRemolque ;
    private DxApi dxApi;
    private int idRemolque;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences preferences = this.getActivity().getSharedPreferences ("credenciales", Context.MODE_PRIVATE);

        user = preferences.getString("user","");
        password = preferences.getString("pass","");




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_unidad, container, false);

        autocomplete = (AutoCompleteTextView) view.findViewById(R.id.autoCompleteTextView);
        imageView = (ImageView)  view.findViewById(R.id.imageView5);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://dxxpress.net/API/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();



        dxApi = retrofit.create(DxApi.class);

        Post2 post2 = new Post2(user,password,1);

        Call<List<CRemolque>> callRemolque = dxApi.getRemolque(post2);


        callRemolque.enqueue(new Callback<List<CRemolque>>() {
            @Override
            public void onResponse(Call<List<CRemolque>> call, Response<List<CRemolque>> response) {
                if(!response.isSuccessful()){
                    //Toast.makeText(envioActivity.this, "Error 404F", Toast.LENGTH_LONG).show();
                }

                List<CRemolque> cRemolques = response.body();

                ArrayAdapter<CRemolque> adapter = new ArrayAdapter<CRemolque>(getActivity() , R.layout.mspinner_item, cRemolques);
                autocomplete.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<List<CRemolque>> call, Throwable t) {
                    Toast.makeText(getActivity(), "Error 404F", Toast.LENGTH_LONG).show();
            }
        });


        autocomplete.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                CRemolque cRemolque = (CRemolque) autocomplete.getAdapter().getItem(i);
                idRemolque = Integer.parseInt(cRemolque.getId());
                nombreRemolque = cRemolque.getRemolque();
            }
        });


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //System.out.println("IMPRE: " + idRemolque);

            Intent i = new Intent(getActivity(), viajeActivity.class);
                i.putExtra("idRemolque", idRemolque);
                i.putExtra("nombreRemolque", nombreRemolque);
                startActivity(i);

            }
        });

        return view ;
    }

    @Override
    public void onStart() {
        super.onStart();



    }
}
