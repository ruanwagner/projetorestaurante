/*******************************************
 * Projeto Android   < Restaurante >
 * Tipo de classe: Activity.class
 * Nome da classe = RegistoActivity
 * Grupo: Ricardo, Ihor e Ruan
 * por: RUAN WAGNER
 * data: 15/dec/2018  Sab


 *Obs.:  a activity tem o objetivo de
 *********************************************/

package com.example.ruanw.restaurante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistoActivity extends AppCompatActivity {

    //criação dos atributos
    EditText etNome, etTelemovel, etSenha, etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registo);

        //referenciando views
        etNome = findViewById(R.id.edtNomeRegisto);
        etTelemovel = findViewById(R.id.edtNumeroRegisto);
        etEmail = findViewById(R.id.edtEmailRegisto);
        etSenha = findViewById(R.id.edtSenhaRegisto);

    }//fim oncreate


    public void onClickRegistar(View view) {

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        //intent.putExtra(MainActivity.class, etNome.getText());
        startActivity(intent);

    }//fim onclickbtnregisto

}//fim activity
