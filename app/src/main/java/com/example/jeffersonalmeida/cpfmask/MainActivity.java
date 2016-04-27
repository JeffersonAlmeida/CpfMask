package com.example.jeffersonalmeida.cpfmask;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText cpf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cpf = (EditText) findViewById(R.id.et);
        MaskEditTextChangedListener maskCPF = new MaskEditTextChangedListener("###.###.###-##", cpf);
        cpf.addTextChangedListener(maskCPF);


    }

    public void onClick(View view){

        cpf.setFocusableInTouchMode(true);

    }

}
