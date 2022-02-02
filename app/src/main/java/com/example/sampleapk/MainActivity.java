package com.example.sampleapk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int i=0;

    public void buttonPressed(View view){
        EditText nameEntered=(EditText)findViewById(R.id.nameEditText);
        String name =nameEntered.getEditableText().toString();

        EditText passwordEntered=(EditText)findViewById(R.id.passwordEditText);
        Toast.makeText(this,"The Name is : "+name+" Singh",Toast.LENGTH_LONG).show();
        Log.i("password - ",passwordEntered.toString());
        nameEntered.setText("");
        passwordEntered.setText((""));
        ImageView image=(ImageView)findViewById(R.id.imageView);
        if(i%2==0){
            image.setImageResource(R.drawable.cat2);
        }
        else{
            image.setImageResource((R.drawable.cat1));
        }
        i++;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submitButton=(Button) findViewById((R.id.submitButton));

    }
}