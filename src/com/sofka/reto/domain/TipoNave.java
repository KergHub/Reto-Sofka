package com.sofka.reto.domain;

import com.sofka.reto.interfaces.i.ITipoNave;

public class TipoNave  implements ITipoNave {
    protected String nombre;
    protected String pais;
    protected String tipo;

    public TipoNave(String nombre, String pais, String tipo){
        this.nombre = nombre;
        this.pais = pais;
        this.tipo = tipo;
    }

    @Override
    public String getNombre() {return nombre;}

    @Override
    public String getPais() {return pais;}

    @Override
    public String getTipo() {return tipo;}
}
