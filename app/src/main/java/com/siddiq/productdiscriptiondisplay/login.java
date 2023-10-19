package com.siddiq.productdiscriptiondisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
  Button baig;
   EditText username;
   EditText password;

   String username_="team@000";
   String password_="team@000";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        baig = findViewById(R.id.button);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);

        baig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(login.this,"button clicked" ,Toast.LENGTH_SHORT).show();


            if(username.getText().toString().length()<=0){
                Toast.makeText(login.this, "username is missing", Toast.LENGTH_SHORT).show();
                return;
            }

                if(password.getText().toString().length()<=0){
                Toast.makeText(login.this, "password is missing", Toast.LENGTH_SHORT).show();
                return;
            }

                if(username.getText().toString().trim().matches (username_)){

                if(password.getText().toString().trim().matches(password_)){
                    // Initialize SharedPreferences
                    SharedPreferences sharedPreferences = getSharedPreferences("auth", Context.MODE_PRIVATE);
// Store data
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("username", username.getText().toString().trim());
                    editor.apply();

                    Intent mint = new Intent(login.this, MainActivity.class);
                    startActivity(mint);
                }else{
                    Toast.makeText(login.this, "wrong password", Toast.LENGTH_SHORT).show();
                }

            }else{
                Toast.makeText(login.this, "wrong user name", Toast.LENGTH_SHORT).show();
            }
        }
        });

    }
}