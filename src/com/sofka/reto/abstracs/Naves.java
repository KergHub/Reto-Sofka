package com.sofka.reto.abstracs;

import com.sofka.reto.interfaces.i.INave;

import java.util.logging.Logger;

public abstract class Naves implements INave {

    protected Logger logger = Logger.getLogger("logger");

    private String pais;
    private String nombre;
    private String año_creacion;


    protected Naves(String pais, String nombre, String año_creacion){
        this.pais = pais;
        this.nombre = nombre;
        this.año_creacion = año_creacion;
    }


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAño_creacion() {
        return año_creacion;
    }

    public void setAño_creacion(String año_creacion) {
        this.año_creacion = año_creacion;
    }

    @Override
    public  String toString(){
        return "Nave{" +
                "Pais='" + pais + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Año de Creacion ='" + año_creacion + '\'' +
                '}';
    }




}
