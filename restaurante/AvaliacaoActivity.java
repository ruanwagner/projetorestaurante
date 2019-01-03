/*******************************************
 * Projeto Android   < Restaurante >
 * Tipo de classe: Activity.class
 * Nome da classe = AvaliacaoActivity
 * Grupo: Ricardo, Ihor e Ruan
 * por: RUAN WAGNER
 * data: 17/dec/2018  Seg

 *Obs.:  a activity tem o objetivo de
 *********************************************/

package com.example.ruanw.restaurante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class AvaliacaoActivity extends AppCompatActivity {

    //criacao das propriedades a serem usadas
    Button btSubmeter;
    RatingBar rtAvaliacao;
    TextView tvNomePedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliacao);

        //referenciando view as propriedades
        btSubmeter = findViewById(R.id.btnSubmeterAvaliacao);
        rtAvaliacao = findViewById(R.id.ratingBarAvaliacao);
        tvNomePedido = findViewById(R.id.txvNomePedido);

    }//fim oncreate

    public void onClickBtnSubmeterAvaliacao(View view) {

        Intent intent = new Intent(getApplicationContext(), PerfilActivity.class);
        startActivity(intent);

    }//fim onclicksubmeteravaliacao

} //fim avaliacaoactivity
