package com.example.finalprojectapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class OngoingEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ongoing_events);

        CardView ongoingCard = findViewById(R.id.ongoings); // Assuming the ID is 'ongoings' from your XML

        ongoingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                openongoingCard();
            }
        });

    }

    private void openongoingCard() {
        Intent intent = new Intent(this, OngoingEvents.class); // Ensure Ongoing is a valid Activity class
        startActivity(intent);
    }


}
