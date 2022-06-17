package com.sofka.reto;

import com.sofka.reto.controller.CTRLTipoNave;
import com.sofka.reto.interfaces.i.INave;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static  void  generarPantalla(){
        System.out.println("Naves Espaciales!!");
        System.out.println("======================");
        System.out.println("1) Naves Tripuladas");
        System.out.println("2) Naves no tripuladas");
        System.out.println("3) Crear Nave");
        System.out.println("Seleccione opción");
    }

    public static void ingresarOpcion(){
        int opcion;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        generarPantalla();
        try {
            opcion = Integer.parseInt(in.readLine());
            mostrarDataNaves(CTRLTipoNave.getTipoNave(opcion));
            mostrarDataNaves(CTRLTipoNave.getTipoNave(opcion));

        }catch (Exception e){

        }
    }

    public static void mostrarDataNaves (ArrayList<INave> naves){
        for (INave objNave : naves){
            System.out.println(objNave.getNombre());
            System.out.println(objNave.getPais());
            System.out.println(objNave.getAño_creacion());
            System.out.println("");

        }
    }

    public static void main(String[] args) {
        ingresarOpcion();
    }
}
