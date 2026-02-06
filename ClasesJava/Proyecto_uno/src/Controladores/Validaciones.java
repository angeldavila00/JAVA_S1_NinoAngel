
package Controladores;

import java.util.Scanner;

public class Validaciones {

    public int validacion_entero(String mensaje, int minimo, int maximo) {
        int op=0;
        try {
            System.out.println(mensaje);
            op = new Scanner(System.in).nextInt();
            while (op < minimo || op > maximo) {
                System.out.println("Error, opcion no valida");
                op = new Scanner(System.in).nextInt();
            }
            return op;
        } catch (Exception e) {
            System.out.println("Error , solo se aceptan numeros");
            
        }
        return op;
    }

    public String VerificarTipoPaciente(int edadV) {
        
        int edad = edadV;
        if (edad < 18) {
            String setTipoPaciente = "Menor";
            
            return setTipoPaciente;
        } else {
            String setTipoPaciente = "Adulto";
            return setTipoPaciente;
        }
    }
}