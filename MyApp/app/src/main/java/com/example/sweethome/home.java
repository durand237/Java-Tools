package com.example.sweethome;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavAction;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link rechercher#newInstance} factory method to
 * create an instance of this fragment.
 */
public class rechercher extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rechercher, container, false);
        /**Button contact = view.findViewById(R.id.contacts);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_rechercher_to_favoris);
            }
        });

        Button favoris = view.findViewById(R.id.favoris);
        favoris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Button info = view.findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Button moi = view.findViewById(R.id.moi);
        moi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
        return view;
    }
}