package com.example.cabina10.latinoapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.cabina10.latinoapp.R;
import com.example.cabina10.latinoapp.models.Student;
import java.util.List;

public class StudentAdapter extends ArrayAdapter<Student> {

    Context context;

    private class ViewHolder {
        TextView dni;
        TextView telefono;
        TextView nombres;
        TextView appaterno;
        TextView apmaterno;
        TextView domicilio;
        TextView correo;
        TextView fechanacimiento;

        private ViewHolder() {
        }
    }

    public StudentAdapter(Context context, int resourceId, List<Student> items) {
        super(context, resourceId, items);
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        Student rowItem = (Student) getItem(position);
        LayoutInflater mInflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item_estudiantes, null);
            holder = new ViewHolder();
            holder.dni = (TextView) convertView.findViewById(R.id.dni);
            holder.telefono = (TextView) convertView.findViewById(R.id.telefono);
            holder.nombres = (TextView) convertView.findViewById(R.id.nombres);
            holder.appaterno = (TextView) convertView.findViewById(R.id.appaterno);
            holder.apmaterno= (TextView) convertView.findViewById(R.id.apmaterno);
            holder.domicilio = (TextView) convertView.findViewById(R.id.correo);
            holder.correo = (TextView) convertView.findViewById(R.id.correo);
            holder.fechanacimiento = (TextView) convertView.findViewById(R.id.fechanacimiento);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.dni.setText(rowItem.getDNI());
        holder.telefono.setText(rowItem.getTelefono());
        holder.nombres.setText(rowItem.getNombres());
        holder.appaterno.setText(rowItem.getApPaterno());
        holder.apmaterno.setText(rowItem.getApMaterno());
        holder.domicilio.setText(rowItem.getDomicilio());
        holder.correo.setText(rowItem.getCorreo());
        holder.fechanacimiento.setText(rowItem.getFechaNacimiento());
        return convertView;
    }
}
