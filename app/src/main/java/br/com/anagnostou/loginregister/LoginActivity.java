package br.com.anagnostou.loginregister;

import android.content.Intent;
import android.content.ReceiverCallNotAllowedException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bLogin = (Button) findViewById(R.id.bLogin);
        final TextView registerLink = (TextView) findViewById(R.id.tvRegisterHere);

        registerLink.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view) {
                    L.m(" registerLink.setOnClickListener(new View.OnClickListener()");
                    L.s(getApplicationContext(), " registerLink.setOnClickListener(new View.OnClickListener()");
                    startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                }
            }
        );

    }//onCreate


}
