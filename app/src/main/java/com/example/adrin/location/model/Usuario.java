package com.example.adrin.location.model;

/**
 * Created by agram on 08/11/2017.
 */

public class Usuario {

    private String username, contrasenna, pais, email, nombre, nivel;
    private double puntuacion;



    public Usuario(){

    }
    public Usuario(String username, String contrasenna, String pais, String email, String nombre, String nivel, double puntuacion) {
        this.username = username;
        this.contrasenna = contrasenna;
        this.pais = pais;
        this.email = email;
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntuacion = puntuacion;
    }


}
