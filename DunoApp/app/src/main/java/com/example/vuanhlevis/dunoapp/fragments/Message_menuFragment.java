package com.example.vuanhlevis.dunoapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vuanhlevis.dunoapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Message_menuFragment extends Fragment {


    public Message_menuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_message, container, false);
        return view;
    }

}
