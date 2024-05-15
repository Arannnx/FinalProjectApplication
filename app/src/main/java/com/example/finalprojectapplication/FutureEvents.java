package com.example.finalprojectapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class FutureEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future_events);

        CardView certiCard = findViewById(R.id.certification);
        CardView exhibitCard = findViewById(R.id.exhibit);
        CardView DatabaseCard = findViewById(R.id.database);

        certiCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencerti();
            }
        });

        exhibitCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openexhibitCard();
            }
        });

        DatabaseCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDatabaseCard();
            }
        });


    }

    public void opencerti() {
        Intent intent = new Intent(this, Certification.class);
        startActivity(intent);
    }

    public void openexhibitCard() {
        Intent intent = new Intent(this, Certification.class);
        startActivity(intent);
    }

    public void openDatabaseCard() {
        Intent intent = new Intent(this, Database.class);
        startActivity(intent);
    }

}
