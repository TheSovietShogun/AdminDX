package com.dx.admindx;


import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;


public class ticketFragment extends Fragment {

    String id;
    String idViaje;
    String idUnidad;
    String responseString = "";
    EditText etcht;
    Button btn;
    String mensaje;
    String idUsuario;
    SoapPrimitive resultString;
    String respuesta;
    String JsonMen;
    SoapObject resultString2;
    String respuesta2;
    String JsonMen2;
    ListView lista2 ;
    ImageButton refresh ;
    SoapPrimitive resultString3;
    String respuesta3;
    String mensaje3;
    String tran3 ;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent get = getActivity().getIntent();
        idUsuario = get.getStringExtra("idUsuario");
        idUnidad = get.getStringExtra("idUnidad");




    }

    @Override
    public void onStart() {
        super.onStart();


        /*try {
            ConnectivityManager manager =(ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetwork = manager.getActiveNetworkInfo();
            if (null != activeNetwork) {
                if(activeNetwork.getType() == ConnectivityManager.TYPE_WIFI || activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE){

                }
            } else{
                Toast.makeText(getActivity(), "Sin Red", Toast.LENGTH_LONG).show();
            }
        }catch (Exception e ){
            Toast.makeText(getActivity(), "Error 500EA", Toast.LENGTH_LONG).show();
        }*/


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ticket, container, false);


        lista2 = (ListView) view.findViewById(R.id.listachat);
        btn = (Button) view.findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getActivity(), solicitarTicketActivity.class);
                startActivity(i);

            }
        });




        return view;
    }


    private class CargaMensajesWS extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {

            String SOAP_ACTION = "http://dxxpress.net/wsInspeccion/Version_20171221_1212";
            String METHOD_NAME = "ChatSelect";
            String NAMESPACE = "http://dxxpress.net/wsInspeccion/";
            String URL = "http://dxxpress.net/wsInspeccion/interfaceOperadores3.asmx";



           /* try {
                //SE CREA UN OBJETO SOAP Y SE LE AGREGAN LOS PARAMETROS DE ENTRADA
                SoapObject Request = new SoapObject(NAMESPACE, METHOD_NAME);
                Request.addProperty("idViaje", idViaje);
                Request.addProperty("idUsuario", idUsuario);
                Request.addProperty("idUnidad", idUnidad);


                //SE EMPAQUETA EL OBJETO ,SE LE ASIGNA UNA VERSION (V11,V12) Y SE ESCRIBE EL LENGUAJE DONDE FUE CREADO EL WS
                SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER12);
                soapEnvelope.dotNet = true;
                soapEnvelope.setOutputSoapObject(Request);

                HttpTransportSE transport = new HttpTransportSE(URL);
                transport.call(SOAP_ACTION, soapEnvelope);


                //SE OBTIENE LA RESPUESTA Y SE LE ASIGNA UNA VARIABLE

                resultString = (SoapPrimitive) soapEnvelope.getResponse();


                respuesta = "OK";

            } catch (Exception ex) {

                respuesta = "ERROR: " + ex.getMessage();
            }*/
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            /*JsonMen = resultString.toString();
            try {


                    Gson gson = new Gson();
                    String reusu = JsonMen.replace("{\"Chat\":[{", "[{");
                    String reusu2 = reusu.replace("}] }", "}]");


                        Type chatListType = new TypeToken<ArrayList<CTicket>>() {
                        }.getType();
                        List<CTicket> chats = new Gson().fromJson(reusu2, chatListType);

                        ArrayAdapter adapter2 = new ticketAdapter(getActivity(), chats);

                        lista2.setAdapter(adapter2);





            } catch (Exception e) {
                //.Toast.makeText(getActivity(), "Error 404C", Toast.LENGTH_SHORT).show();
                System.out.println("ERROR : " + e);
            }*/
        }

    }


}







