package com.example.android.fragments.Activity;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.fragments.Fragment.ContatosFragment;
import com.example.android.fragments.Fragment.ConversasFragment;
import com.example.android.fragments.R;

public class MainActivity extends AppCompatActivity {

    private Button buttonConversa, buttonContato;
    private ConversasFragment conversasFragment;
    private  ContatosFragment contatosFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonContato = findViewById(R.id.buttonContato);
        buttonConversa = findViewById(R.id.buttonConversa);

        getSupportActionBar().setElevation(0);

        conversasFragment = new ConversasFragment();

        // configurar objeto para o fragmento

//        final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//
//        transaction.replace(R.id.frameConteudo, conversasFragment);
//        transaction.commit(); // finaliza transação


        buttonContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contatosFragment = new ContatosFragment();

                FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                transaction1.replace(R.id.frameConteudo,contatosFragment);
                transaction1.commit();
            }
        });

        buttonConversa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                conversasFragment = new ConversasFragment();

                FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                transaction1.replace(R.id.frameConteudo,conversasFragment);
                transaction1.commit();
            }
        });


    }
}
