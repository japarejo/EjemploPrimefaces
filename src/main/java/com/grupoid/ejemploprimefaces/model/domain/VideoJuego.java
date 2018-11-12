/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoid.ejemploprimefaces.model.domain;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author japarejo
 */
public class VideoJuego implements Serializable {
    private String nombre;
    private String estudio;
    private List<String> plataformas;

    public VideoJuego(String nombre, String estudio, List<String> plataformas) {
        this.nombre = nombre;
        this.estudio = estudio;
        this.plataformas = plataformas;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPlataformas(List<String> plataformas) {
        this.plataformas = plataformas;
    }

    public String getEstudio() {
        return estudio;
    }

    public List<String> getPlataformas() {
        return plataformas;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
