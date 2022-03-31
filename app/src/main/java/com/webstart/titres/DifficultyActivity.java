package com.webstart.titres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class DifficultyActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.difficulty_activity);

        Button btnPlayGameFacile = (Button)findViewById(R.id.btnFacile);
        Button btnPlayGameNormal = (Button)findViewById(R.id.btnNormal);
        Button btnPlayGameDifficile = (Button)findViewById(R.id.btnDifficile);
        Button btnSon = (Button)findViewById(R.id.btnSon);

        btnPlayGameFacile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DifficultyActivity.this, TitresActivity.class));
            }
        });

    }

}
