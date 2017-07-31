package com.uninorte.actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AppNotas1 extends AppCompatActivity {

    EditText N1;
    EditText N2;
    EditText N3;
    EditText N4;
    TextView D1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_notas1);
        N1 = (EditText) findViewById(R.id.N1);
        N2 = (EditText) findViewById(R.id.N2);
        N3 = (EditText) findViewById(R.id.N3);
        N4 = (EditText) findViewById(R.id.N4);
        D1 = (TextView) findViewById(R.id.D1);


    }

    public void onClickCalcular(View view) {
        String Nota1 = N1.getText().toString();
        String Nota2 = N2.getText().toString();
        String Nota3 = N3.getText().toString();
        String Nota4 = N4.getText().toString();


        double Notas1= Double.parseDouble(Nota1);
        double Notas2= Double.parseDouble(Nota2);
        double Notas3= Double.parseDouble(Nota3);
        double Notas4= Double.parseDouble(Nota4);
        double Definitiva = Notas1*0.25+Notas2*0.25+Notas3*0.25+Notas4*0.25;
        String Definitiva1 = String.valueOf(Definitiva);
        D1.setText(Definitiva1);
    }
}
