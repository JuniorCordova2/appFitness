package com.example.cabina10.latinoapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.cabina10.latinoapp.R;
import com.example.cabina10.latinoapp.activities.Login;
import com.example.cabina10.latinoapp.activities.RegisterForm;

public class StudentDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

        //Icono en el Action Bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }
    //Metodo para mostrar y ocultar Menu
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.studentmenu, menu);
        return true;
    }

    //Metodo para crear funciones a las opciones.
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.iteme1){
            //Intent siguiente = new Intent(this, StudentDetails.class);
            //startActivity(siguiente);
        }else if (id == R.id.iteme2){
            //Intent siguiente = new Intent(this, RegisterForm.class);
            //startActivity(siguiente);
        }else if (id == R.id.iteme3){
            Toast.makeText(this, "Sesion cerrada", Toast.LENGTH_SHORT).show();
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
