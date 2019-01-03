/*******************************************
 * Projeto Android   < Restaurante >
 * Tipo de classe: Activity.class
 * Nome da classe = RestauranteActivity
 * Grupo: Ricardo, Ihor e Ruan
 * por: RUAN WAGNER
 * data: 15/dec/2018  Sab


 *Obs.:  a activity tem o objetivo de
*********************************************/

package com.example.ruanw.restaurante;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RestauranteActivity extends AppCompatActivity {

    //criacao dos atributos a serem usados na classe
    Button btPedido, btChamadaEmpregado;
    Snackbar snackbar;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);

        //referenciando as views botoes e layout
        layout = findViewById(R.id.layoutRestaurante);
        btChamadaEmpregado = findViewById(R.id.btnChamadaEmpregado);
        btPedido = findViewById(R.id.btnPedidoRestaurante);

    }//fim oncreate

    //fara
    public void onClickBtnPedido(View view) {

        Intent intent = new Intent(getApplicationContext(), PedidoActivity.class);
        startActivity(intent);

    }//fim onclickbtnpedido

    //botao fara chamada de empregado no servico interno
    public void onClickBtnChamadaEmpregado(View view) {

        snackbar = Snackbar.make(layout,
                "=============================\n"+
                        " > Empregado de mesa à caminho!\n > Aguarde, por favor..", Snackbar.LENGTH_LONG);
        snackbar.show();

    }//fim onclickbtnchamadaempregado

}//fim activity