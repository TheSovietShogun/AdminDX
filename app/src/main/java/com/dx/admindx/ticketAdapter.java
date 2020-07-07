package com.dx.admindx;

import android.content.Context;

import android.widget.ArrayAdapter;

import java.util.List;

public class ticketAdapter extends ArrayAdapter<CTicket> {
    public ticketAdapter(Context context, int resource) {
        super(context, resource);
    }

    public ticketAdapter(Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public ticketAdapter(Context context, int resource, CTicket[] objects) {
        super(context, resource, objects);
    }

    public ticketAdapter(Context context, int resource, int textViewResourceId, CTicket[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public ticketAdapter(Context context, int resource, List<CTicket> objects) {
        super(context, resource, objects);
    }

    public ticketAdapter(Context context, int resource, int textViewResourceId, List<CTicket> objects) {
        super(context, resource, textViewResourceId, objects);
    }

/*
    public ticketAdapter(FragmentActivity fragmentActivity, List<CTicket> chat) {
        super(fragmentActivity, 0,chat);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        CChat currentMen = getItem(position);

        final ViewHolder mholder;

        if (convertView == null) {

            //convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_message_sent, parent, false);

            mholder = new ViewHolder();

            String str1 = currentMen.getUsuario();
            String str2 = "-";


        if (str1.toLowerCase().contains(str2.toLowerCase()) ){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_message_sent, parent, false);

            mholder.mensaje1 = (TextView) convertView.findViewById(R.id.mensajeEnviadoTxt);
            mholder.hora1= (TextView) convertView.findViewById(R.id.mensajeEnviadoTime);

            mholder.mensaje1.setText(currentMen.getMensaje());
            mholder.hora1.setText(currentMen.getFecha());



        }
            else {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_message_received, parent, false);

            mholder.nombre = (TextView) convertView.findViewById(R.id.text_message_name);
            mholder.mensaje2 = (TextView) convertView.findViewById(R.id.mensajeRecibidotxt);
            mholder.hora2 = (TextView) convertView.findViewById(R.id.mensajeRecibidoTime);

            mholder.mensaje2.setText(currentMen.getMensaje());
            mholder.hora2.setText(currentMen.getFecha());
            mholder.nombre.setText(currentMen.getUsuario());



            }

            convertView.setTag(mholder);
        }else {



            mholder = new ViewHolder();

            String str1 = currentMen.getUsuario();
            String str2 = "-";


            if (str1.toLowerCase().contains(str2.toLowerCase()) ){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_message_sent, parent, false);

                mholder.mensaje1 = (TextView) convertView.findViewById(R.id.mensajeEnviadoTxt);
                mholder.hora1= (TextView) convertView.findViewById(R.id.mensajeEnviadoTime);

                mholder.mensaje1.setText(currentMen.getMensaje());
                mholder.hora1.setText(currentMen.getFecha());



            }
            else {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_message_received, parent, false);

                mholder.nombre = (TextView) convertView.findViewById(R.id.text_message_name);
                mholder.mensaje2 = (TextView) convertView.findViewById(R.id.mensajeRecibidotxt);
                mholder.hora2 = (TextView) convertView.findViewById(R.id.mensajeRecibidoTime);

                mholder.mensaje2.setText(currentMen.getMensaje());
                mholder.hora2.setText(currentMen.getFecha());
                mholder.nombre.setText(currentMen.getUsuario());



            }

        }


        return convertView;
    }

    static class ViewHolder {
        TextView mensaje1;
        TextView hora1;

        TextView nombre;
        TextView mensaje2;
        TextView hora2;
    }

   @Override
    public int getItemViewType(int position) {
        CChat currentMen = getItem(position);
        String str1 = currentMen.getUsuario();
        String str2 = "d-";
        String str3 = "mk";
        if (str1.toLowerCase().contains(str2.toLowerCase()) || str1.toLowerCase().contains(str3.toLowerCase())){
            return 0;
        }
        else {
            return 1;
        }
    }*/

    @Override
    public int getViewTypeCount() {
        return 2;
    }
}
