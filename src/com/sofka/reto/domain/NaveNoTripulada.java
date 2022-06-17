package com.sofka.reto.domain;

import com.sofka.reto.DB.dbNaveNoTripulada;
import com.sofka.reto.abstracs.Naves;
import com.sofka.reto.interfaces.i.INave;
import com.sofka.reto.interfaces.i.ITipoNave;

import java.util.ArrayList;

public class NaveNoTripulada extends Naves implements INave {

    public NaveNoTripulada(String pais, String nombre, String año_creacion){
        super(pais, nombre, año_creacion);
    }

    @Override
    public void exploracion() {
     logger.info("Al infinito y mas alla!! ");
    }

    @Override
    public void tripulante() {
        logger.info("Nadie puede abordar esta Nave");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static ArrayList<ITipoNave> getNaveNoTripulada(){
        dbNaveNoTripulada naveNoTripulada = new dbNaveNoTripulada();
        return naveNoTripulada.simulaDataNaveNoTripulada();
    }
}
