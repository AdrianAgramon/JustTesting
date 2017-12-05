package com.example.adrin.location;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.adrin.location.EuropaPartida;
import com.example.adrin.location.R;
import com.example.adrin.location.ResideMenu.MainActivity;
import com.example.adrin.location.selectWhere;
import com.special.ResideMenu.ResideMenu;

import java.util.Random;

/**
 * Created by agram on 05/12/2017.
 */

@SuppressLint("ValidFragment")
public class selectWhereFragment extends Fragment {

    private View parentView;
    private ResideMenu resideMenu;

    public selectWhereFragment() {
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        parentView = inflater.inflate(R.layout.activity_select_where, container, false);
        setUpViews();


        final Button botonEuropa = (Button) parentView.findViewById(R.id.europeButton2);

        botonEuropa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int score = 0;

                int min = 1;
                int max = 12;

                Random r = new Random();
                int number = r.nextInt(max - min + 1) + min;
                final String result = String.valueOf(number);

                final int partidas =5;

                switch (result) {
                    case "1": {


                        Intent reg = new Intent(getActivity(), EuropaPartida.class);
                        reg.putExtra("Ciudad", "Madrid");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);
                        break;
                    }
                    case "2": {

                        Intent reg = new Intent(getActivity(), EuropaPartida.class);
                        reg.putExtra("Ciudad", "Paris");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);

                        break;
                    }
                    case "3": {

                        Intent reg = new Intent(getActivity(), EuropaPartida.class);
                        reg.putExtra("Ciudad", "Basilea");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);

                        break;
                    }
                    case "4": {

                        Intent reg = new Intent(getActivity(), EuropaPartida.class);
                        reg.putExtra("Ciudad", "Barcelona");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);

                        break;
                    }
                    case "5": {

                        Intent reg = new Intent(getActivity(), EuropaPartida.class);
                        reg.putExtra("Ciudad", "Berlin");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);

                        break;
                    }
                    case "6": {

                        Intent reg = new Intent(getActivity(), EuropaPartida.class);
                        reg.putExtra("Ciudad", "Dublin");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);


                        break;
                    }
                    case "7": {

                        Intent reg = new Intent(getActivity(), EuropaPartida.class);
                        reg.putExtra("Ciudad", "Roma");
                        //  reg.putExtra("Score", score);
                        startActivity(reg);

                        break;
                    }
                    case "8": {

                        Intent reg = new Intent(getActivity(), EuropaPartida.class);
                        reg.putExtra("Ciudad", "Pompeya");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);
                        break;
                    }
                    case "9": {

                        Intent reg = new Intent(getActivity(), EuropaPartida.class);
                        reg.putExtra("Ciudad", "Praga");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);
                        break;
                    }
                    case "10": {

                        Intent reg = new Intent(getActivity(), EuropaPartida.class);
                        reg.putExtra("Cuidad", "Valencia");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);
                        break;
                    }
                    case "11": {

                        Intent reg = new Intent(getActivity(), EuropaPartida.class);
                        reg.putExtra("Ciudad", "Venecia");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);
                        break;
                    }
                    case "12": {

                        Intent reg = new Intent(getActivity(), EuropaPartida.class);
                        reg.putExtra("Ciudad", "Londres");
                        reg.putExtra("Partidas", partidas);
                        startActivity(reg);

                        break;
                    }
                    default:
                        System.out.println("ERROR");
                        break;
                }

//                Intent reg = new Intent(getActivity(), EuropeActivity.class);
//                startActivity(reg);
            }
        });

        return parentView;

    }

    private void setUpViews() {
        MainActivity parentActivity = (MainActivity) getActivity();
        resideMenu = parentActivity.getResideMenu();
        //  resideMenu.setSwipeDirectionDisable(ResideMenu.DIRECTION_RIGHT);
        //    resideMenu.setSwipeDirectionDisable(ResideMenu.DIRECTION_RIGHT);
//        parentView.findViewById(R.id.btn_open_menu).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                resideMenu.openMenu(ResideMenu.DIRECTION_LEFT);
//            }
//        });

        // add gesture operation's ignored views
        // FrameLayout ignored_view = (FrameLayout) parentView.findViewById(R.id.ignored_view);
        // resideMenu.addIgnoredView(ignored_view);
    }




}

