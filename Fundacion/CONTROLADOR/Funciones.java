package CONTROLADOR;

import static CONTROLADOR.Validacion.validacion;

import java.util.Scanner;

public class Funciones {

   public static void registrarEmpleado() {
        System.out.println("Ingrese el documento del Empleado: ");
        String documento = new Scanner(System.in).nextLine();
        System.out.println("Ingrese el nombre del Empleado ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Ingrese el apellido del Empleado");
        String apellido = new Scanner(System.in).nextLine();
        int edad = validacion(0, 200, "Ingrese la edad: ");
        System.out.println("Ingrese su direccion ");
        String direccion = new Scanner(System.in).nextLine();
        System.out.println("Cual es su cargo en la empresa: ");
        String cargo = new Scanner(System.in).nextLine();
        System.out.println("Cual es su horario de trabajo: ");
        String horario = new Scanner(System.in).nextLine();
        System.out.println("Ingresa tu salario: ");
        Double salario =new Scanner(System.in).nextDouble();
        

    }

}
