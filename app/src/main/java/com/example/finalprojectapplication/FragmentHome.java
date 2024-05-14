package com.example.finalprojectapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;

public class FragmentHome extends Fragment {

    public FragmentHome() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        CardView ongoingCard = view.findViewById(R.id.ongoing);
        CardView futureCard = view.findViewById(R.id.future);
        CardView pastCard = view.findViewById(R.id.past);

        ongoingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOngoing();
            }

        });

        futureCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFuture();
            }
        });

        pastCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPast();
            }
        });

        return view;
    }

    public void openOngoing() {
        Intent intent = new Intent(getActivity(), OngoingEvents.class);
        startActivity(intent);
    }

    public void openFuture() {
        Intent intent = new Intent(getActivity(), FutureEvents.class);
        startActivity(intent);
    }

    public void openPast() {
        Intent intent = new Intent(getActivity(), PastEvents.class);
        startActivity(intent);
    }
}
