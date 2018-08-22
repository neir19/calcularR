package com.example.nei.calcularr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner, spinner2, spinner3, spinner4;
    private Button bmostrar;
    private TextView textView;
    String bande1, bande2, multiplicador, tole;
    int x, n,to;
    String m="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);
        spinner3 = findViewById(R.id.spinner3);
        spinner4 = findViewById(R.id.spinner4);
        bmostrar = findViewById(R.id.bmostrar);
        textView = findViewById(R.id.textView);

        //muestra en es spinner
        final ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.band1, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        final ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.band2, android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        final ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.band3, android.R.layout.simple_spinner_dropdown_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        final ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this, R.array.tolerance, android.R.layout.simple_spinner_dropdown_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);
        //selecciona
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                bande1 = adapterView.getItemAtPosition(i).toString();
                if (bande1.equals( "cafe")) {
                    x = 1;
                } else if (bande1.equals( "rojo")) {
                    x = 2;
                } else if (bande1.equals( "naranja")) {
                    x = 3;
                } else if (bande1.equals( "amarillo")) {
                    x = 4;
                } else if (bande1.equals("verde")) {
                    x = 5;
                } else if (bande1.equals( "azul")) {
                    x = 6;
                } else if (bande1.equals( "purpura")) {
                    x = 7;
                } else if (bande1.equals( "gris")) {
                    x = 8;
                } else if (bande1.equals( "blanco")) {
                    x = 9;
                }
                Log.d("mostrar","x "+x+" "+bande1);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                bande2 = adapterView.getItemAtPosition(i).toString();
                if (bande2.equals( "negro")) {
                    n = 0;
                } else if (bande2.equals( "cafe")) {
                    n = 1;
                } else if (bande2.equals( "rojo")) {
                    n = 2;
                } else if (bande2.equals("naranja")) {
                    n = 3;
                } else if (bande2.equals( "amarillo") ){
                    n = 4;
                } else if (bande2.equals("verde")) {
                    n = 5;
                } else if (bande2.equals("azul")) {
                    n = 6;
                } else if (bande2.equals("purpura") ) {
                    n = 7;
                } else if (bande2.equals("gris")) {
                    n = 8;
                } else if (bande2.equals( "blanco")) {
                    n = 9;
                }
                Log.d("motrar","n "+n+" "+bande2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                multiplicador = adapterView.getItemAtPosition(i).toString();
                if (multiplicador.equals( "negro")) {
                    m = "10^0";
                }else if (multiplicador.equals( "cafe")) {
                    m = "10";
                } else if (multiplicador.equals( "rojo")) {
                    m = "10^2";
                } else if (multiplicador.equals( "naranja")) {
                    m = "10^3";
                } else if (multiplicador.equals( "amarillo")) {
                    m="10^4";
                } else if (multiplicador.equals("verde")) {
                    m="10^5";
                } else if (multiplicador.equals( "azul")) {
                    m="10^6";
                } else if (multiplicador.equals( "purpura")) {
                    m="10^7";
                } else if (multiplicador.equals( "gris")) {
                    m="10^8";
                } else if (multiplicador.equals( "blanco")) {
                    m="10^9";
                }
                Log.d("mostrar","x "+x+" "+bande1);
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                tole = adapterView.getItemAtPosition(i).toString();
                if (tole.equals("cafe")) {
                    to = 1;
                } else if (tole.equals("rojo")) {
                    to = 2;
                } else if (tole.equals("dorado")) {
                    to = 5;
                } else if (tole.equals("plateado")) {
                    to=10;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        bmostrar.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            if (bande1.equals("1st")) {
                                                Toast.makeText(getApplicationContext(), " te falta seleccionar algo", Toast.LENGTH_SHORT).show();
                                                textView.setText("");
                                            } else if (bande2.equals("2nd")) {
                                                Toast.makeText(getApplicationContext(), " te falta seleccionar algo", Toast.LENGTH_SHORT).show();
                                                textView.setText("");
                                            } else if (multiplicador.equals("multiplier")) {
                                                Toast.makeText(getApplicationContext(), " te falta seleccionar algo", Toast.LENGTH_SHORT).show();
                                                textView.setText("");
                                            } else if (tole.equals("tolerance")) {
                                                Toast.makeText(getApplicationContext(), " te falta seleccionar algo", Toast.LENGTH_SHORT).show();
                                                textView.setText("");
                                            } else {
                                                Log.d("mostrar","x"+x+"n"+n);
                                                textView.setText(x+""+n+"x"+m+"ohnios +- "+to );


                                            }

                                            }

                                    });
    }
}


//        public void mostrar (View view){
//            if (bande1.equals("1st")) {
//                Toast.makeText(getApplicationContext(), " te falta seleccionar algo", Toast.LENGTH_SHORT).show();
//            } else if (bande2.equals("2nd")) {
//                Toast.makeText(getApplicationContext(), " te falta seleccionar algo", Toast.LENGTH_SHORT).show();
//            } else if (multiplicador.equals("multiplier")) {
//                Toast.makeText(getApplicationContext(), " te falta seleccionar algo", Toast.LENGTH_SHORT).show();
//            } else if (tole.equals("tolerance")) {
//                Toast.makeText(getApplicationContext(), " te falta seleccionar algo", Toast.LENGTH_SHORT).show();
//            } else {
//                if (bande1 == "cafe") {
//                    x = 1;
//                } else if (bande1 == "rojo") {
//                    x = 2;
//                } else if (bande1 == "naranja") {
//                    x = 3;
//                } else if (bande1 == "amarillo") {
//                    x = 4;
//                } else if (bande1 == "verde") {
//                    x = 5;
//                } else if (bande1 == "azul") {
//                    x = 6;
//                } else if (bande1 == "purpura") {
//                    x = 7;
//                } else if (bande1 == "gris") {
//                    x = 8;
//                } else if (bande1 == "blanco") {
//                    x = 9;
//                }
//                if (bande2 == "negro") {
//                    n = 0;
//                } else if (bande2 == "cafe") {
//                    n = 1;
//                } else if (bande2 == "rojo") {
//                    n = 2;
//                } else if (bande2 == "naranja") {
//                    n = 3;
//                } else if (bande2 == "amarillo") {
//                    n = 4;
//                } else if (bande2 == "verde") {
//                    n = 5;
//                } else if (bande2 == "azul") {
//                    n = 6;
//                } else if (bande2 == "purpura") {
//                    n = 7;
//                } else if (bande2 == "gris") {
//                    n = 8;
//                } else if (bande2 == "blanco") {
//                    n = 9;
//                }
//                total = (x * 10) + n;
//                textView.setText(total);
//
//
//            }
//
//        }
//    }
