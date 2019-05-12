package com.example.enviardatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText a,b,c,d;
    Button bt;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a=findViewById(R.id.editText);
        b=findViewById(R.id.editText2);
        c=findViewById(R.id.editText3);
        d=findViewById(R.id.editText4);


        bt=findViewById(R.id.button);

        bt.setOnClickListener(new View.OnClickListener() {



            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,datos.class);

                if(b.getText().toString().equalsIgnoreCase("contraseña")){


                    in.putExtra("nombre", a.getText().toString());
                    in.putExtra("correo", c.getText().toString());
                    in.putExtra("telefono", d.getText().toString());

                    startActivity(in);
                }
                else{
                    Toast.makeText(MainActivity.this,"contraseña incorrecta",Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}
