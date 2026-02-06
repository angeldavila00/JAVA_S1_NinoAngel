package VISTA;

import CONTROLADOR.GestionarArea;
import CONTROLADOR.GestionarAreaImpl;
import MODELO.Area;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ANGEL
 */
public class Menu_Area {

    GestionarAreaImpl ga = new GestionarAreaImpl();

    private void registro() {
        Area a = new Area();
        System.out.println("Ingresa el nombre del Area: ");
        a.setNombre(new Scanner(System.in).nextLine());
        System.out.println("Ingresa la descripcion: ");
        a.setDescripcion(new Scanner(System.in).nextLine());
        ga.guardar(a);

    }

    private void actualizar() {
        System.out.println("Ingrese el id de la area a buscar");
        int id = new Scanner(System.in).nextInt();
        Area a = ga.buscar(id);
        if (a != null) {
            System.out.println("AREA BUSCADA");
            System.out.println(a);
            System.out.println("""
                               Ingrese lo quiere modificar
                               1.   Nombre
                               2.   Descripcion
                               """);
            int op = new Scanner(System.in).nextInt();
            while (op < 1 || op > 2) {
                System.out.println("Error, opcion no valida.");
                op = new Scanner(System.in).nextInt();
            }
            switch (op) {
                case 1:
                    System.out.println("Ingrese el nuevo nombre");
                    a.setNombre(new Scanner(System.in).nextLine());
                    break;
                case 2:
                    System.out.println("Ingresa la nueva descripcion");
                    a.setDescripcion(new Scanner(System.in).nextLine());
                    break;
            }
            ga.actualizar(a, id);
        } else {
            System.out.println("No existe dicha area....");
        }
    }

    public void buscar() {
        System.out.println("Ingrese el id del area que va a buscar: ");
        int id = new Scanner(System.in).nextInt();
        Area a = ga.buscar(id);
        if (a != null) {
            System.out.println(a);
        } else {
            System.out.println("No existe dicha area....");
        }
    }

    public void eliminar() {
        ArrayList<Area> areas = ga.listar();
        for (Area a : areas) {
            System.out.println("Ingrese el id de la area a eliminar?\n" + a);
        }
        System.out.println("Ingresa el Id del Area que desea Eliminar?");
    }

    public void listar() {
        ArrayList<Area> areas = ga.listar();
        for (Area a : areas) {
            System.out.println(a);
        }
    }

    public void menu() {
        int op = 0;
        do {
            System.out.println("""
                           ******************************
                                        AREA
                           1.   Registrar
                           2.   Actualizar
                           3.   Eliminar.
                           4.   Listar.
                           5.   Buscar.
                           6.   Regresar.
                           """);
            op = new Scanner(System.in).nextInt();
            while (op < 1 || op > 6) {
                System.out.println("Error, opcion no valida");
                op = new Scanner(System.in).nextInt();
            }
            switch (op) {
                case 1:
                    registro();
                    break;
                case 2:
                    actualizar();
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    listar();
                    break;
                case 5:
                    buscar();
                    break;
            }
        } while (op != 6);
    }

}
