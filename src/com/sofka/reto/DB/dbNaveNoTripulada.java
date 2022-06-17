package com.sofka.reto.DB;

import com.sofka.reto.domain.NaveNoTripulada;


import java.util.ArrayList;

public class dbNaveNoTripulada {

    public ArrayList simulaDataNaveNoTripulada(){
        ArrayList<NaveNoTripulada> naveNoTripuladas = new ArrayList<NaveNoTripulada>();
        NaveNoTripulada naveNoTripulada = new NaveNoTripulada("EEUU","Explorer","1958");
        NaveNoTripulada naveNoTripulada2 = new NaveNoTripulada("Europea ESA","Soho","1995");
        naveNoTripuladas.add(naveNoTripulada);
        naveNoTripuladas.add(naveNoTripulada2);
        return naveNoTripuladas;
    }
}
