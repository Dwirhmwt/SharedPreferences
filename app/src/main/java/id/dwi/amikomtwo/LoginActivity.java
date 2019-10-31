package id.dwi.amikomtwo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText edtNamaDepan, edtNamaBelakang;
    Button btnLogin, btnRegister, btnForgot;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtNamaDepan = findViewById(R.id.edtNamaDepan);
        edtNamaBelakang = findViewById(R.id.edtNamaBelakang);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);
        btnForgot = findViewById(R.id.btnForgot);
        sharedPreferences = getSharedPreferences("username", MODE_PRIVATE);
        //sharedPreferences = getSharedPreferences("password", MODE_PRIVATE);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
                final String namaDepan = edtNamaDepan.getText().toString();
                final String namaBelakang = edtNamaBelakang.getText().toString();
                final SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("nama_depan", namaDepan);
                editor.putString("nama_belakang", namaBelakang);
                editor.commit();
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
                final String namaDepan = edtNamaDepan.getText().toString();
                final String namaBelakang = edtNamaBelakang.getText().toString();
                final SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("nama_depan", namaDepan);
                editor.putString("nama_belakang", namaBelakang);
                editor.commit();
            }
        });

        btnForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, ForgetPasswordActivity.class);
                startActivity(i);
            }
        });
    }
}
