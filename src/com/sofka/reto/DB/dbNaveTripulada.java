package com.sofka.reto.DB;

import com.sofka.reto.domain.NaveTripulada;

import java.util.ArrayList;

public class dbNaveTripulada {

    public ArrayList simulaDataNaveTripulada(){
        ArrayList<NaveTripulada> naveTripuladas = new ArrayList<NaveTripulada>();
        NaveTripulada naveTripulada = new NaveTripulada("EEUU","Apolo","1966");
        NaveTripulada naveTripulada2 = new NaveTripulada("Rusia","Vostok","1970");
        naveTripuladas.add(naveTripulada);
        naveTripuladas.add(naveTripulada2);
        return naveTripuladas;
    }
}
