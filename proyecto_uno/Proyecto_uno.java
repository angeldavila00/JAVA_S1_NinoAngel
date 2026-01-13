
package proyecto_uno;

import Vistas.Main;
import java.util.Scanner;

public class Proyecto_uno {

    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("Bienvenidos al Hospital MonsalNiño");
        System.out.println("==================================");
        System.out.println("Elige una opcion numerica\n1. Iniciar\n2. Salir");
        int op = new Scanner (System.in).nextInt();
        if(op==1){
            Main main = new Main();
            main.iniciar();
            
        } else{
            System.out.println("Adios");
        }
    }

}
