/*******************************************
 * Projeto Android   < Restaurante >
 * Tipo de classe: Activity.class
 * Nome da classe = PedidoActivity
 * Grupo: Ricardo, Ihor e Ruan
 * por: RUAN WAGNER
 * data: 15/dec/2018  Sab


 *Obs.:  a activity tem o objetivo de
 *********************************************/

package com.example.ruanw.restaurante;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class PedidoActivity extends AppCompatActivity {

    //criacao dos atributos a serem usados na classe
    Button btSobremesa, btBebida, btComida, btConfirmarPedido;
    TextView tvValor;
    ListView lvMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setTitle("Restaurante > Pedido");

        //referenciando as views dos botoes
        btSobremesa = findViewById(R.id.btnSobremesa);
        btBebida = findViewById(R.id.btnBebida);
        btComida = findViewById(R.id.btnComida);
        btConfirmarPedido = findViewById(R.id.btnConfirmarPedido);




    }//fim oncreate

    public void onClickBtnConfirmarPedido(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Deseja confirmar o pedido?")
                .setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(getApplicationContext(), MoradaActivity.class);
                        startActivity(intent);
                        finish();

                    }//fim onclick remover
                })//fim setpositive
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }//fim onclick cance
                }).show(); //fim setnegative e .show() indica para mostrar o alertdialog

    }//fim onclickbtnconfirmarpedido

}//fim activity