package com.example.jorge.controlbt;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class page_3  extends Fragment {

    //Constructor default
    public page_3(){};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View PageTree = inflater.inflate(R.layout.page3, container, false);

        return PageTree;
    }
}
