package com.example.enviardatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class datos extends AppCompatActivity {



    TextView a,b,c;





    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
    a=findViewById(R.id.a);
        b=findViewById(R.id.b);
        c=findViewById(R.id.c);

Bundle bd =getIntent().getExtras();
a.setText(bd.getString("nombre"));
        b.setText(bd.getString("correo"));
        c.setText(bd.getString("telefono"));



    }
}
