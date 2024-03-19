package net.youtics.app;

import net.youtics.app.entity.Automovil;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Automovil> lista = new ArrayList<Automovil>();
        Scanner scanner = new Scanner(System.in);

        Automovil automovil1 = new Automovil("ford");
        Automovil automovil2 = new Automovil("fiat");
        Automovil automovil3 = new Automovil("renault");
        Automovil automovil4 = new Automovil("mercedes");

        lista.add(automovil1);
        lista.add(automovil2);
        lista.add(automovil3);
        lista.add(automovil4);

        /*System.out.println("lista = " + lista);
        System.out.println();
        System.out.println();

        lista.remove(automovil2);

        System.out.println("lista = " + lista);*/

        Integer pos = -1;
        System.out.println("Ingrese el modelo a buscar");
        String modelo = scanner.nextLine();

        for(int i=0; i<lista.size() && pos==-1;i++){
            if(lista.get(i).getModelo().equals(modelo)){
                pos=i;
            }
        }
        Automovil update = new Automovil("UTN");
        lista.set(pos, update);

        System.out.println("lista = " + lista);

    }
}
