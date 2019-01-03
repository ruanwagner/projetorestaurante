/*******************************************
 * Projeto Android   < Restaurante >
 * Tipo de classe: Activity.class
 * Nome da classe = MainActivity
 * Grupo: Ricardo, Ihor e Ruan
 * por: RUAN WAGNER
 * data: 9/dec/2018  Sab

 *Obs.:  a activity tem o objetivo de
 *********************************************/

package com.example.ruanw.restaurante;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //criacao dos atributos
    Button btPerfil, btPedido, btReserva, btRestaurante;
    TextView tvNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //referenciando as views dos botoes
        btPerfil = findViewById(R.id.btnPerfilMain);
        btPedido = findViewById(R.id.btnPedidoMain);
        btReserva = findViewById(R.id.btnReservaMain);
        btRestaurante = findViewById(R.id.btnRestauranteMain);
        tvNome = findViewById(R.id.txvNome);


        // setTitle("");

    }//fim oncreate

    //funcao para abrir activity perfil
    public void onClickPerfil(View view) {

        Intent intent = new Intent(getApplicationContext(), PerfilActivity.class);
        startActivity(intent);

    }//fim onclickperfil

    //funcao para abrir activity pedido
    public void onClickPedido(View view) {

        Intent intent = new Intent(getApplicationContext(), PedidoActivity.class);
        startActivity(intent);

    }//f... pedido

    //funcao para abrir activity reserva
    public void onClickReserva(View view) {

        Intent intent = new Intent(getApplicationContext(), ReservaActivity.class);
        startActivity(intent);

    }//f... reserva

    //funcao para abrir activity restaurante
    public void onClickRestaurante(View view) {

        Intent intent = new Intent(getApplicationContext(), RestauranteActivity.class);
        startActivity(intent);

    }//f... restaurante

}//fim mainactivity