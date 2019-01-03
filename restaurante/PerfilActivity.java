/*******************************************
 * Projeto Android   < Restaurante >
 * Tipo de classe: Activity.class
 * Nome da classe = PerfilActivity
 * Grupo: Ricardo, Ihor e Ruan
 * por: RUAN WAGNER
 * data: 10/dec/2018  Sab

 *Obs.:  a activity tem o objetivo de
 *********************************************/


package com.example.ruanw.restaurante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

    }//fim oncreate

    public void onClickBtnMorada(View view) {

        Intent intent = new Intent(getApplicationContext(), MoradaActivity.class);
        startActivity(intent);

    }//fim onclickbtnmorada


    public void onClickDetalhes(View view) {

        Intent intent = new Intent(getApplicationContext(), DetalhesPedidoActivity.class);
        startActivity(intent);

    }
}//fim perfilactivity
