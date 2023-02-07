package com.example.myhomecm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*public void countDown(View button3) {
        Button button = (Button) button3;
        button.setEnabled(false);
        button.setText("goodbye see you later");
        Log.d("succes", "Button connected");
    }*/
    public void handleText(View v) {
        EditText txt = findViewById(R.id.search);
        String input = txt.getText().toString();
        ((TextView)findViewById(R.id.output)).setText(input);
        Toast.makeText(this, "attention")
    }
}