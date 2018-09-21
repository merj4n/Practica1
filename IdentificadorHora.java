package net.iesochoa.germanbelda.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IdentificadorHora extends AppCompatActivity {

    private TextView txtSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Date date = new Date();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identificador_hora);
        //Localizar los controles
        txtSaludo = (TextView)findViewById(R.id.txtSaludo);
        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
        DateFormat hora = new SimpleDateFormat("HH:mm:ss");
        //Construimos el mensaje a mostrar
        txtSaludo.setText("La hora a la que has pulsado el botón es "+ hora.format(date) + " y mi nombre es \n" + bundle.getString("NOMBRE"));
    }
}
