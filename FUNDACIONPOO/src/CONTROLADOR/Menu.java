
package CONTROLADOR;

import MODELO.Beneficiario;
import MODELO.Colaborador;
import MODELO.Empleado;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Validacion v = new Validacion();

        Funcion f = new Funcion();


        int op;

        do {

            op =v.validacion(0, 4, """
                ===============================
                1. Registrar Empleado
                2. Registrar Beneficiario
                3. Registrar Colaborador
                4. Imprimir
                0. Salir
                ===============================
                                   """);

            switch (op) {
                case 1 -> {
                    System.out.print("Documento: ");
                    String documento =new Scanner(System.in).nextLine();
                    System.out.print("Nombre: ");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.print("Apellido: ");
                    String apellido = new Scanner(System.in).nextLine();
                    System.out.print("Edad: ");
                    int edad = new Scanner(System.in).nextInt();
                    System.out.print("Direccion: ");
                    String direccion =new Scanner(System.in).nextLine();
                    System.out.print("Salario: ");
                    double salario = new Scanner(System.in).nextDouble();
                    System.out.print("Horario: ");
                    String horario =new Scanner(System.in).nextLine();

                    f.registrar(new Empleado(salario, horario, documento, nombre, apellido, edad, direccion));
                }

                case 2 -> {
                    System.out.print("Documento: ");
                    String documento =new Scanner(System.in).nextLine();
                    System.out.print("Nombre: ");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.print("Apellido: ");
                    String apellido = new Scanner(System.in).nextLine();
                    System.out.print("Edad: ");
                    int edad = new Scanner(System.in).nextInt();
                    System.out.print("Direccion: ");
                    String direccion =new Scanner(System.in).nextLine();

                    System.out.print("Ayudas al mes: ");
                    int ayudas = new Scanner(System.in).nextInt();

                    f.registrar(new Beneficiario(ayudas, documento, nombre, apellido, edad, direccion));
                }

                case 3 -> {
                     System.out.print("Documento: ");
                    String documento =new Scanner(System.in).nextLine();
                    System.out.print("Nombre: ");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.print("Apellido: ");
                    String apellido = new Scanner(System.in).nextLine();
                    System.out.print("Edad: ");
                    int edad = new Scanner(System.in).nextInt();
                    System.out.print("Direccion: ");
                    String direccion =new Scanner(System.in).nextLine();

                    System.out.print("Horas: ");
                    int horas = new Scanner(System.in).nextInt();

                    f.registrar(new Colaborador(horas, documento, nombre, apellido, edad, direccion));
                }

                case 4 -> f.imprimir();


                case 0 -> System.out.println("Saliendo...");

                
            }

        } while (op != 0);
    }
}