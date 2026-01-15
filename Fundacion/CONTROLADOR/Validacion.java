
package CONTROLADOR;

import java.util.Scanner;

public class Validacion {
     public static int validacion(int valorMinimo, int valorMaximo, String mensaje) {
        boolean validar = false;
        int opc = 0;
        do {
            try {
                System.out.println(mensaje);
                opc = new Scanner(System.in).nextInt();
                while (opc < valorMinimo || opc > valorMaximo) {
                    System.out.println("Opcion no valida, Ingresa Nuevamente ");
                    opc = new Scanner(System.in).nextInt();
                }
                validar = true;
            } catch (Exception e) {
                System.out.println("ERROR, SOLO INGRESAR NUMEROS");
            }
        } while (validar == false);
        return opc;
    }
}
