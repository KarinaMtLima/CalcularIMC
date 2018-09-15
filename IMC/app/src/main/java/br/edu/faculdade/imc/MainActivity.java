package br.edu.faculdade.imc;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editPeso;
    EditText editAltura;
    EditText editResult;
    Button buttonCalcularIMC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        editResult = findViewById(R.id.editResult);
        buttonCalcularIMC = findViewById(R.id.buttonCalcularIMC);

        buttonCalcularIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            double peso = Double.parseDouble(editPeso.getText().toString());
            double altura = Double.parseDouble(editAltura.getText().toString());
            double resultado = peso / (altura * altura);
            if (resultado <= 18.5) {
                System.out.println("Abaixo do peso normal");
            }
            if (resultado > 18.5 && resultado <= 24.9){
            System.out.println(" Peso normal");
                }
                if (resultado > 24.9 && resultado<= 29.9){
                    System.out.println("Acima do peso");
                }
                if (resultado > 29.9 && resultado <= 34.9){
                    System.out.println("Obesidade grau |");
                }
                if (resultado > 34.9 && resultado <= 39.9){
                    System.out.println("Obesidade grau ||");
                }*/
            });

    }
}
