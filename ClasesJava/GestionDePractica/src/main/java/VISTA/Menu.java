
package VISTA;

import java.util.Scanner;

/**
 *
 * @author ANGEL
 */
public class Menu {
    public void Menu_Principal() {
        int op = 0;
        do {
            System.out.println("""
                           ******************************
                           1.   Gestionar Area.
                           2.   Gestionar Empleado.
                           3.   Salir.
                           """);
            op = new Scanner(System.in).nextInt();
            while (op < 1 || op > 3) {
                System.out.println("Error, opcion no valida");
                op = new Scanner(System.in).nextInt();
            }
            switch (op) {
                case 1:
                    Menu_Area a = new Menu_Area();
                    a.menu();
                    break;
                case 2:
                    Menu_Empleado e=new Menu_Empleado();
                    e.menu();
                    break;
                case 3:
                    System.out.println("Gracias por usar nuestro sistema!");
                    break;
            }
        } while (op != 3);
    }

}
