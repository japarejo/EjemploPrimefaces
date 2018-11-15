/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoid.ejemploprimefaces.model.repository;

import com.grupoid.ejemploprimefaces.model.domain.Pelicula;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

@ManagedBean(name = "peliculasRepository", eager = true)
@SessionScoped
public class PeliculasRepository {
    private List<Pelicula> peliculas;
    
    public PeliculasRepository()
    {
        init();
    }
    
    private void init(){
        peliculas=new ArrayList<Pelicula>();
        peliculas.add(new Pelicula("Ciudadano Kane","RKO",1941));
        peliculas.add(new Pelicula("2001 Una odisea en el espacio","Metro-Goldwyn-Mayer (MGM) ",1968));
        peliculas.add(new Pelicula("La naranja mecánlica","Warner Bros",1971));        
        peliculas.add(new Pelicula("Braveheart","",1995));
        peliculas.add(new Pelicula("La vida es bella","Miramax",1997));        
    }
    
    
    public List<Pelicula> getAll(){
        return peliculas;
    }
    
    public Pelicula getByTitulo(String titulo){
        Pelicula result=null;
        for(Pelicula candidata:peliculas){
            if(candidata.getTitulo()==titulo){
                result=candidata;
                break;
            }
        }
        return result;
    }
    
    
    public void add(Pelicula p){
        peliculas.add(p);
    }
    public boolean remove(Pelicula p){
        return peliculas.remove(p);
    }
    
    public boolean remove(String titulo){
        return peliculas.remove(getByTitulo(titulo));
    }
    
    public boolean update(Pelicula p){
        boolean result=false;
        if(getByTitulo(p.getTitulo())!=null){
            remove(p.getTitulo());
            add(p);
            result=true;
        }
        return result;
    } 
}
