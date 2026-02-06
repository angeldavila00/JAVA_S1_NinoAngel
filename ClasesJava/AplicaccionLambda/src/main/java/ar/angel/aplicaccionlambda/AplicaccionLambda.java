package ar.angel.aplicaccionlambda;

import java.util.Scanner;

public class AplicaccionLambda {

    
    public static void main(String[] args) {
        Operaciones op = new OperacionesImpl();
        op.ejecutar(5, 7);

        System.out.println("Dime un nombre");
        String nombre = new Scanner(System.in).nextLine();

        Persona persona = new Personalmpl();

            persona.saludar (nombre);
            
         Cliente cli = new Clientelmpl();
         cli.despedirse("Adios gente "+nombre);

        }
    }
