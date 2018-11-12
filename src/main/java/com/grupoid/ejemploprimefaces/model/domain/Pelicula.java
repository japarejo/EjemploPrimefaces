/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoid.ejemploprimefaces.model.domain;

import java.io.Serializable;

/**
 *
 * @author japarejo
 */
public class Pelicula implements Serializable{
    private String titulo;
    private String Director;
    private int anio;

    public Pelicula(String titulo, String Director, int anio) {
        this.titulo = titulo;
        this.Director = Director;
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public String getDirector() {
        return Director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
}
