/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoid.ejemploprimefaces.model.converter;

import com.grupoid.ejemploprimefaces.model.domain.Pelicula;
import com.grupoid.ejemploprimefaces.model.repository.PeliculasRepository;
import java.util.List;
import javax.enterprise.inject.spi.CDI;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.inject.Named;


@Named(value="PelisConverter")
public class PelisConverter implements Converter{

    
    private PeliculasRepository repo;
    
    public PelisConverter(){
        repo=CDI.current().select(PeliculasRepository.class).get();
    }
        
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
            Object result=null;
            List<Pelicula> peliculas=repo.getAll();
            for(Pelicula p:peliculas){
                if(p.getTitulo().equals(value)){
                    result=p;
                    break;
                }
            }
            return result;
    }

        @Override
        public String getAsString(FacesContext context, UIComponent component, Object value) {
            return ((Pelicula)value).getTitulo();
        }
    
    }