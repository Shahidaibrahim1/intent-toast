package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public  class MainActivity extends Activity implements View.OnClickListener, FirstActivity {
    EditText username;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.editText1);
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(this);

    }

       @Override
    public void onClick(View v) {
        String msg = username.getText() .toString();
        Toast.makeText(this, "Hello there!!", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("username",msg);
        startActivity(intent);
    }
}