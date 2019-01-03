/*******************************************
 * Projeto Android   < Restaurante >
 * Tipo de classe: Activity.class
 * Nome da classe = DetalhesPedidoActivity
 * Grupo: Ricardo, Ihor e Ruan
 * por: RUAN WAGNER
 * data: 17/dec/2018  Seg

 *Obs.:  a activity tem o objetivo de mostrar
 os detalhes do pedido realizado:
    - comidas
    - bebidas (se houver)
    - sobremesas (se houver)
    - data da realizacao do pedido
    - comentário
    - avaliação se houver
    - botao para avaliar
 *********************************************/

package com.example.ruanw.restaurante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetalhesPedidoActivity extends AppCompatActivity {

    //criacao das propriedades a serem usadas
    Button btAvaliar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_pedido);

        //referenciando view as propriedades
        btAvaliar = findViewById(R.id.btnAvaliarPedido);

    }//fim oncreate

    public void onClickAvaliarPedido(View view) {

        Intent intent = new Intent(getApplicationContext(), AvaliacaoActivity.class);
        startActivity(intent);

    }//fim onclickavaliarpedido

}//fim activity

