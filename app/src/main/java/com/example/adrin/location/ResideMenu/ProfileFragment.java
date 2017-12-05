package com.example.adrin.location.ResideMenu;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adrin.location.R;
import com.special.ResideMenu.ResideMenu;

/**
 * Created by agram on 05/12/2017.
 */

@SuppressLint("ValidFragment")
class ProfileFragment extends Fragment {

    private View parentView;
    private ResideMenu resideMenu;

    public ProfileFragment() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        parentView = inflater.inflate(R.layout.activity_perfil, container, false);



        return parentView;
    }



}
