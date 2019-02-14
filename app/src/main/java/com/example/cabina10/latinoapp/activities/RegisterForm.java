package com.example.cabina10.latinoapp.activities;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cabina10.latinoapp.AdminSQLiteOpenHelper;
import com.example.cabina10.latinoapp.R;

public class RegisterForm extends AppCompatActivity {

    private EditText et_codigo, et_correo, et_username, et_contrasenia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_form);

        et_codigo = (EditText)findViewById(R.id.txt_code);
        et_correo = (EditText)findViewById(R.id.txt_email);
        et_username = (EditText)findViewById(R.id.txt_username);
        et_contrasenia = (EditText)findViewById(R.id.txtpassword);
    }

    //Metodo para registrar
    public void Registrar(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "Latino", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase(); //Iniciar modo lectura y escritura

        //Creacion de variables
        String codigo = et_codigo.getText().toString();
        String correo = et_correo.getText().toString();
        String usuario = et_username.getText().toString();
        String contrasenia = et_contrasenia.getText().toString();

        //Validar Campos
        if (!codigo.isEmpty() && !correo.isEmpty() && !usuario.isEmpty() && !contrasenia.isEmpty()){
            //Registro
            ContentValues registro = new ContentValues();
            registro.put("codigo", codigo);
            registro.put("correo", correo);
            registro.put("usuario", usuario);
            registro.put("precio", contrasenia);

            //Guardar valores
            BaseDeDatos.insert("users", null, registro);
            BaseDeDatos.close();

            //Limpiar
            et_codigo.setText("");
            et_contrasenia.setText("");
            et_username.setText("");
            et_correo.setText("");

            Toast.makeText(this, "Usuario Registrado", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Campos vacios", Toast.LENGTH_SHORT).show();
        }
    }
}
