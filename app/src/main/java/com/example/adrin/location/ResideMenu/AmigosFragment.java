package com.example.adrin.location.ResideMenu;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.adrin.location.R;
import com.special.ResideMenu.ResideMenu;

/**
 * Created by agram on 05/12/2017.
 */

@SuppressLint("ValidFragment")
class AmigosFragment extends Fragment {

    private View parentView;
    private ResideMenu resideMenu;
    Button buscarAmigos;

    public AmigosFragment() {

    }

    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        parentView = inflater.inflate(R.layout.activity_amigos, container, false);

        buscarAmigos = (Button) parentView.findViewById(R.id.buscarAmigos);
        buscarAmigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(getActivity());
//                LinearLayout mLayour = inflater.inflate(R.layout.amigos_dialog, container, false);

                final View mView = getLayoutInflater().inflate(R.layout.amigos_dialog, null);
                Button buscar = (Button)mView.findViewById(R.id.buscarfinal);
                EditText bucarUsername = (EditText) mView.findViewById(R.id.buscarXusername);
                //TODO TODO LO DE BUSCAR LOS AMIGOS Y TAL
                buscar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        final LinearLayout mLayout = (LinearLayout) getActivity().findViewById(R.id.amigos_dialog);

                        Button amigoR = new Button(mLayout.getContext());
                        amigoR.setText("Ronald");
                        amigoR.setBackground(getResources().getDrawable(R.drawable.button_border));

                        Button amigoV = new Button(mLayout.getContext());
                        amigoV.setText("Veronica");
                        amigoV.setBackground(getResources().getDrawable(R.drawable.button_border));

                        Button amigoA = new Button(mLayout.getContext());
                        amigoA.setText("Alex");
                        amigoA.setBackground(getResources().getDrawable(R.drawable.button_border));

                        mLayout.addView(amigoA);
                        mLayout.addView(amigoR);
                        mLayout.addView(amigoV);
                    }
                });

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();

            }
        });



        return parentView;
    }


}
