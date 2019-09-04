package com.example.curencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     public void click(View view){

         EditText amt=(EditText) findViewById(R.id.editText2);


         Log.i("amount",amt.getText().toString());
         Double num;
         num = Double.parseDouble(amt.getText().toString());
         Double dollar=num*0.014;
         Toast.makeText(MainActivity.this,"$"+String.format("%.2f",dollar),Toast.LENGTH_SHORT).show();

     }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
