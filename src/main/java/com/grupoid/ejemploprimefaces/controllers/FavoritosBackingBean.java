/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoid.ejemploprimefaces.controllers;

import com.grupoid.ejemploprimefaces.model.domain.Libro;
import com.grupoid.ejemploprimefaces.model.domain.Pelicula;
import com.grupoid.ejemploprimefaces.model.domain.Plato;
import com.grupoid.ejemploprimefaces.model.domain.VideoJuego;
import com.grupoid.ejemploprimefaces.model.repository.PeliculasRepository;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@ManagedBean(name = "favoritosBackingBean", eager = true)
@SessionScoped
public class FavoritosBackingBean implements Serializable{                
        
    Libro libroFavorito;
    Pelicula peliculaFavorita;
    Plato platoFavorito;
    VideoJuego videoJuegoFavorito;
    
    @Inject
    private PeliculasRepository pelisRepo;
    
    public FavoritosBackingBean()
    {
        libroFavorito=new Libro("","");
        peliculaFavorita=new Pelicula("","",2000);
        platoFavorito=new Plato("");
        videoJuegoFavorito=new VideoJuego("","",new ArrayList<String>());
    }
    
    
    public List<Libro> opcionesLibro(){
        List<Libro> result=new ArrayList<Libro>();
        result.add(new Libro("20000 Leguas de viaje Submarino","Julio Verne"));
        result.add(new Libro("Los pilares de la tierra","Ken Follet"));
        result.add(new Libro("El señor de los anillos","J. R. R. Tolkien"));
        result.add(new Libro("El ingenioso hidalgo Don Quijote de la Mancha","Miguel de Cervantes"));
        return result;
    }
    
    public List<Plato> opcionesPlato(){
        List<Plato> result=new ArrayList<Plato>();
        result.add(new Plato("Huevos fritos con patatass"));
        result.add(new Plato("Dorada al horno"));
        result.add(new Plato("Moloja de ahumados"));
        result.add(new Plato("Solomillo de cerdo ibérico al Pedro Ximenez"));
        return result;
    }
    
    public List<Pelicula> opcionesPelicula(String tituloActual){
        return pelisRepo.getAll();
    }
    
    
    public List<VideoJuego> opcionesVideoJuego(){
        List<VideoJuego> result=new ArrayList<VideoJuego>();
        result.add(new VideoJuego("The legend of Zelda: Breath of the wild","Nintendo",Arrays.asList("Switch","Wii-U")));
        result.add(new VideoJuego("Red dead redemption II","Rockstar",Arrays.asList("PS4","XBox One")));
        result.add(new VideoJuego("Shadow of the Colosus","Team ICO|Sony Interactive",Arrays.asList("PS2","PS3","PS4")));
        result.add(new VideoJuego("The legend of Zelda: Ocarina of Time","Nintendo",Arrays.asList("N64","3DS","2DS")));
        return result;
    }

    public Libro getLibroFavorito() {
        return libroFavorito;
    }

    public void setLibroFavorito(Libro libroFavorito) {
        this.libroFavorito = libroFavorito;
    }
    
    
    public Pelicula getPeliculaFavorita() {
        return peliculaFavorita;
    }

    public void setPeliculaFavorita(Pelicula peliculaFavorita) {
        this.peliculaFavorita = peliculaFavorita;
    }
    
    
    public Plato getPlatoFavorito() {
        return platoFavorito;
    }

    public void setPlatoFavorito(Plato platoFavorito) {
        this.platoFavorito = platoFavorito;
    }

    public VideoJuego getVideoJuegoFavorito() {
        return videoJuegoFavorito;
    }

    public void setVideoJuegoFavorito(VideoJuego videoJuegoFavorito) {
        this.videoJuegoFavorito = videoJuegoFavorito;
    }    
    
}
