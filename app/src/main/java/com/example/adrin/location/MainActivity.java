package com.example.adrin.location;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.special.ResideMenu.ResideMenu;
import com.special.ResideMenu.ResideMenuItem;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ResideMenu resideMenu;
    private Context mContext;
    private ResideMenuItem itemHome;
    private ResideMenuItem itemProfile;
    private ResideMenuItem itemCalendar;
    private ResideMenuItem itemSettings;
    private ResideMenuItem itemBus;
    private ResideMenuItem itemLogOut;
    private ResideMenuItem itemDepartamentos;
    private ResideMenuItem itemNoticias;
    private ResideMenuItem itemEnlaces;

    private ResideMenuItem itemAsignaturas;
    private ResideMenuItem itemAvisos;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        setUpMenu();
        if( savedInstanceState == null )
            changeFragment(new selectWhere());
    }

    private void setUpMenu() {

        // attach to current activity;
        resideMenu = new ResideMenu(this);

        resideMenu.setBackground(R.drawable.menu_background);
        resideMenu.attachToActivity(this);
        // resideMenu.setMenuListener(menuListener);
        //valid scale factor is between 0.0f and 1.0f. leftmenu'width is 150dip.
        resideMenu.setScaleValue(0.6f);

        // create menu items;
        itemHome     = new ResideMenuItem(this, R.drawable.icon_home,     "Home");
        itemProfile  = new ResideMenuItem(this, R.drawable.icon_profile,  "Profile");
        itemCalendar = new ResideMenuItem(this, R.drawable.icon_calendar, "Servicios");
        itemSettings = new ResideMenuItem(this, R.drawable.icon_settings, "Settings");
        itemBus = new ResideMenuItem(this, R.drawable.icon_bus, "Bus");
        itemLogOut = new ResideMenuItem(this, R.drawable.icon_logout, "Logout");
        itemDepartamentos = new ResideMenuItem(this, R.drawable.icon_departamentos, "Departamentos");
        itemNoticias = new ResideMenuItem(this, R.drawable.ic_news_2, "Noticias");
        itemEnlaces = new ResideMenuItem(this, R.drawable.ic_link_icon_2, "Enlaces");

        itemAsignaturas = new ResideMenuItem(this, R.drawable.ic_subjects_2, "Asignaturas");
        itemAvisos = new ResideMenuItem(this, R.drawable.ic_notices_2, "Avisos");

        itemHome.setOnClickListener(this);
        itemProfile.setOnClickListener(this);
        itemCalendar.setOnClickListener(this);
        itemSettings.setOnClickListener(this);
        itemBus.setOnClickListener(this);
        itemLogOut.setOnClickListener(this);
        itemDepartamentos.setOnClickListener(this);
        itemAvisos.setOnClickListener(this);
        itemNoticias.setOnClickListener(this);
        itemEnlaces.setOnClickListener(this);
        itemAsignaturas.setOnClickListener(this);


        resideMenu.addMenuItem(itemHome, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemProfile, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemCalendar, ResideMenu.DIRECTION_RIGHT);
        resideMenu.addMenuItem(itemDepartamentos, ResideMenu.DIRECTION_RIGHT);
        resideMenu.addMenuItem(itemBus,ResideMenu.DIRECTION_RIGHT);
        resideMenu.addMenuItem(itemNoticias, ResideMenu.DIRECTION_RIGHT);
        resideMenu.addMenuItem(itemEnlaces, ResideMenu.DIRECTION_RIGHT);
        resideMenu.addMenuItem(itemAsignaturas, ResideMenu.DIRECTION_RIGHT);
        resideMenu.addMenuItem(itemAvisos, ResideMenu.DIRECTION_RIGHT);
        resideMenu.addMenuItem(itemSettings, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemLogOut, ResideMenu.DIRECTION_LEFT);



        // You can disable a direction by setting ->
        // resideMenu.setSwipeDirectionDisable(ResideMenu.DIRECTION_RIGHT);

        findViewById(R.id.title_bar_left_menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resideMenu.openMenu(ResideMenu.DIRECTION_LEFT);
            }
        });
//        findViewById(R.id.title_bar_right_menu).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                resideMenu.openMenu(ResideMenu.DIRECTION_RIGHT);
//            }
//        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return resideMenu.dispatchTouchEvent(ev);
    }

    @Override
    public void onClick(View view) {

        if (view == itemHome){
            changeFragment(new HomeFragment());
        }else if (view == itemProfile){
            changeFragment(new ProfileFragment());
        }else if (view == itemCalendar){
            changeFragment(new ServiciosFragment());
        }else if (view == itemSettings){
            changeFragment(new SettingsFragment());
        }else if (view == itemBus){
            changeFragment(new Bus91Fragment());
        }else if (view == itemDepartamentos) {
            changeFragment(new DepartamentosFragment());
        }else if (view == itemNoticias) {
            changeFragment(new NoticiasFragment());
        }else if (view == itemEnlaces) {
            changeFragment(new enlaces_fragment());
        }else if (view == itemEnlaces) {
            changeFragment(new enlaces_fragment());
        }else if (view == itemAsignaturas) {
            changeFragment(new asigFragment());
        }else if (view == itemAvisos) {
            changeFragment(new NoticiasFragment());
        }
        resideMenu.closeMenu();
    }

    /** private ResideMenu.OnMenuListener menuListener = new ResideMenu.OnMenuListener() {
    @Override
    public void openMenu() {
    Toast.makeText(mContext, "Menu is opened!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void closeMenu() {
    Toast.makeText(mContext, "Menu is closed!", Toast.LENGTH_SHORT).show();
    }
    };**/

    private void changeFragment(Fragment targetFragment){
        resideMenu.clearIgnoredViewList();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_fragment, targetFragment, "fragment")
                .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }

    // What good method is to access resideMenu？
    public ResideMenu getResideMenu(){
        return resideMenu;
    }
}


