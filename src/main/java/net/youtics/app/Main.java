package net.youtics.app;


import net.youtics.app.entity.Automovil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Object auto = new Automovil("Meriva", "Azul", 1500);
        System.out.println("auto.getModelo() = " + ((Automovil)auto).getModelo());

        Automovil[] listaAutomovil = new Automovil[10];

        Automovil a = new Automovil("rojo");
        Automovil b = new Automovil("verde");
        Automovil c = new Automovil("azul");
        Automovil d = new Automovil("blanco");


        listaAutomovil[0] = a;
        listaAutomovil[1] = b;
        listaAutomovil[2] = c;
        listaAutomovil[3] = d;

        System.out.println("listaAutomovil = " + listaAutomovil[0]);

        for(int i=0; i<listaAutomovil.length; i++){
            if(listaAutomovil[i]!=null){
                System.out.println("listaAutomovil = " + listaAutomovil[i]);
            }
        }

        double flag=0;
        System.out.println("ingrese el modelo a eliminar");
        Scanner scanner = new Scanner(System.in);
        String m = scanner.nextLine();

        for (int i=0; i<listaAutomovil.length && flag==0; i++ ){
            if( listaAutomovil[i] != null && listaAutomovil[i].getModelo().equals(m)){
                for (int y = i; y<listaAutomovil.length-1;y++){
                    listaAutomovil[y] = listaAutomovil[y+1];
                    System.out.println(y);
                }
                flag=1;
            }
        }
        for(int i=0; i<listaAutomovil.length; i++){
            if(listaAutomovil[i]!=null){
                System.out.println("listaAutomovil = " + listaAutomovil[i]);
            }
        }
    }
}