package com.example.cabina10.latinoapp.activities;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cabina10.latinoapp.AdminSQLiteOpenHelper;
import com.example.cabina10.latinoapp.R;

public class AdministratorUsers extends AppCompatActivity {

    private EditText et_codigo, et_correo, et_username, et_contrasenia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrator_users);

        et_codigo = (EditText)findViewById(R.id.txt_code);
        et_correo = (EditText)findViewById(R.id.txt_email);
        et_username = (EditText)findViewById(R.id.txt_username);
        et_contrasenia = (EditText)findViewById(R.id.txtpassword);
    }

    public void Buscar(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"Latino", null, 1);
        SQLiteDatabase BaseDeDatabase = admin.getWritableDatabase();

        String codigo = et_codigo.getText().toString();

        if (!codigo.isEmpty()){
            Cursor fila = BaseDeDatabase.rawQuery("select usuario, correo, contrasenia from users where codigo =" + codigo, null);
            if (fila.moveToFirst()){
                et_correo.setText(fila.getString(0));
                et_username.setText(fila.getString(1));
                et_contrasenia.setText(fila.getString(2));
                BaseDeDatabase.close();
            }else{
                Toast.makeText(this, "No existe el Usuario", Toast.LENGTH_SHORT).show();
                BaseDeDatabase.close();
            }
        }else {
            Toast.makeText(this, "Ingresar un codigo", Toast.LENGTH_SHORT).show();
        }
    }

}
