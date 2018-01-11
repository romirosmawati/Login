package com.ngodingcoding.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username = (EditText) findViewById(R.id.inuser);
        final EditText password = (EditText) findViewById(R.id.inpass);
        Button login = (Button) findViewById(R.id.btnlgn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_name = username.getText().toString();
                String pass_ =  password.getText().toString();
                if (user_name.equals("admin")&&pass_.equals("admin")){
                    Toast.makeText(getApplicationContext(),"Username dan Password benar Anda berhasil Login",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Username dan Pssword tidak sesuai Anda gagal Login",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
