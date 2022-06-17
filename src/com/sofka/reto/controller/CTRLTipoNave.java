package com.sofka.reto.controller;

import com.sofka.reto.domain.NaveNoTripulada;
import com.sofka.reto.domain.NaveTripulada;
import com.sofka.reto.interfaces.i.ITipoNave;

import java.util.ArrayList;
import java.util.Scanner;

public class CTRLTipoNave {

public static ArrayList getTipoNave(int opcion){
    ArrayList<ITipoNave> naveTripulada = NaveTripulada.getNaveTripulada();
    ArrayList<ITipoNave> naveNoTripulada = NaveNoTripulada.getNaveNoTripulada();

    switch (opcion){
        case 1:
            return naveTripulada;
        case 2:
            return naveNoTripulada;
        case 3:
            System.out.println("Ingrese Nombre de la Nave : ");
            String entradaNombre = " Nave : ";
            Scanner entradaEscaner = new Scanner (System.in);
            entradaNombre = entradaEscaner.nextLine ();
            System.out.println("");
            System.out.println("Ingrese Pais al cual pertenece la Nave : ");
            String entradaPais = "";
            Scanner entradaEscaner2 = new Scanner (System.in);
            entradaPais = entradaEscaner2.nextLine ();
            System.out.println("");
            System.out.println("Ingrese Año de creacion  de la Nave : ");
            String entradaCreacion = "";
            Scanner entradaEscaner3 = new Scanner (System.in);
            entradaCreacion = entradaEscaner3.nextLine ();
            System.out.println("");
            System.out.println("Nave ingresada es:   Nave: \"" + entradaNombre +"\"\n" +
                    "           Pais:     \""  + entradaPais +"\"\n"+
                    "         Año de Creacion       \"" + entradaCreacion + "\"");
    }

    return null;
  }

}
