
package aplicacionconduccion;

import java.util.Scanner;

/**
 * @author Komodin
 
 */
public class AplicacionConduccion {


    public static void main(String[] args) {
        GestionLicencia g=new GestionLicencia();
        
        int op;
        do{
            System.out.println("""
                               Gestiona de liocencias:
                               1. Guardad
                               2. Listar
                               3.Buscar
                               4.Eliminar
                               5.Exportar
                               0. Salir
                               """);
            op = new Scanner(System.in).nextInt();
            switch (op) {
                case 1:
                    
                    System.out.println("Ingresa el Nombre: ");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.println("Ingrese la cedula: ");
                    String cedula = new Scanner(System.in).nextLine();
                    System.out.println("Ingresa el Edad: ");
                    int edad = new Scanner(System.in).nextInt();
                    System.out.println("Ingresa el Numero de licencia: ");
                    String numero = new Scanner(System.in).nextLine();
                    System.out.println("Ingresa el Categoria: ");
                    String categoria = new Scanner(System.in).nextLine();
                    Personas persona = new Personas(nombre, cedula, edad);
                    Licencia l=new Licencia(persona, numero, categoria);
                    g.registrar(l);
                    g.guardar();
                    break;
                case 2:
                    g.listar();
                    break;
                case 3:
                    System.out.println("Ingresa la cedula a Buscar: ");
                    g.buscar(new Scanner(System.in).nextLine());
                    break;
                case 4:
                    System.out.println("Ingresa la cedula a Eliminar: ");
                    g.eliminar(new Scanner(System.in).nextLine());
                    break;
                case 5:
                    g.exportarBackup();
                    break;      
            }
        }while(op!=0);
        g.guardar();
        System.out.println("Programa terminado");
    
        }
}
        
    


