/*******************************************
 * Projeto Android   < Restaurante >
 * Tipo de classe: Activity.class
 * Nome da classe = MoradaActivity
 * Grupo: Ricardo, Ihor e Ruan
 * por: RUAN WAGNER
 * data: 15/dec/2018  Sab

 *Obs.:  a activity tem o objetivo de
 *********************************************/

package com.example.ruanw.restaurante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoradaActivity extends AppCompatActivity {

    //criação dos atributos
    Button btAdd, btLimpar, btRecuperar, btFinalizarPedido;
    EditText etRua, etCodPostal, etAndar, etCidade, etPorta;
    ListView listViewMoradas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morada);

        //referenciando views aos atributos
        btAdd = findViewById(R.id.btnAddMorada);
        btLimpar = findViewById(R.id.btnLimparDadosMorada);
        btRecuperar = findViewById(R.id.btnRefazerDadosMorada);
        btFinalizarPedido = findViewById(R.id.btnFinalizarPedido);
        etRua = findViewById(R.id.edtRuaMorada);
        etCodPostal = findViewById(R.id.edtCodigoPostalMorada);
        etAndar = findViewById(R.id.edtAndarMorada);
        etCidade = findViewById(R.id.edtCidadeMorada);
        etPorta = findViewById(R.id.edtPortaMorada);
        listViewMoradas = findViewById(R.id.lvMoradas);

    }//fim oncreate

}//fim moradaactivity