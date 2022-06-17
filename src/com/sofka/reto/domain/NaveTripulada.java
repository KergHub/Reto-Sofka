package com.sofka.reto.domain;

import com.sofka.reto.DB.dbNaveTripulada;
import com.sofka.reto.abstracs.Naves;
import com.sofka.reto.interfaces.i.INave;
import com.sofka.reto.interfaces.i.ITipoNave;

import java.util.ArrayList;


public class NaveTripulada extends Naves implements INave {

    public NaveTripulada(String pais, String nombre, String año_creacion){
         super(pais, nombre, año_creacion);
    }

    @Override
    public void exploracion() {
        logger.info("Al infinito y mas alla!!");
    }

    @Override
    public void tripulante() {
         logger.info("Todos a Bordo!");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static ArrayList<ITipoNave> getNaveTripulada(){
        dbNaveTripulada naveTripulada = new dbNaveTripulada();
     return naveTripulada.simulaDataNaveTripulada();
    }


}
