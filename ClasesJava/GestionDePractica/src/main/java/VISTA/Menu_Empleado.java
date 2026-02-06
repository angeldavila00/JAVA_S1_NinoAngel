
package VISTA;

import CONTROLADOR.GestionarArea;
import CONTROLADOR.GestionarAreaImpl;
import CONTROLADOR.GestionarEmpleado;
import CONTROLADOR.GestionarEmpleadolmpl;
import MODELO.Area;
import MODELO.Empleado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ANGEL
 */
public class Menu_Empleado {
    
     GestionarEmpleado ga = new GestionarEmpleadolmpl();
    GestionarArea aa = new GestionarAreaImpl();

    private void registrar() {
        Empleado em = new Empleado();
        System.out.println("Ingrese el nombre:");
        em.setNombre(new Scanner(System.in).nextLine());
        System.out.println("Ingrese el apellido:");
        em.setApellido(new Scanner(System.in).nextLine());
        System.out.println("Ingrese el telefono:");
        em.setTelefono(new Scanner(System.in).nextLine());
        System.out.println("*******AREAS***********");
        ArrayList<Area> areas = aa.listar();
        for (Area a : areas) {
            System.out.println(a);
        }
        System.out.println("Ingrese el id del area");
        Area area = aa.buscar(new Scanner(System.in).nextInt());
        em.setArea_id(area);
        ga.guardar(em);
    }

    private void actualizar() {
        System.out.println("Ingrese el id de la empleado a buscar");
        int id = new Scanner(System.in).nextInt();
        Empleado em = ga.buscar(id);
        if (em != null) {
            System.out.println("EMPLEADO BUSCADO");
            System.out.println(em);
            System.out.println("""
                               Ingrese lo quiere modificar
                               1.   Nombre
                               2.   Apellido
                               3.   Telefono.
                               4.   Area. 
                               """);
            int op = new Scanner(System.in).nextInt();
            while (op < 1 || op > 4) {
                System.out.println("Error, opcion no valida");
                op = new Scanner(System.in).nextInt();
            }
            switch (op) {
                case 1:
                    System.out.println("Ingrese el nuevo nombre");
                    em.setNombre(new Scanner(System.in).nextLine());
                    break;
                case 2:
                    System.out.println("Ingrese el nuevo apellido");
                    em.setApellido(new Scanner(System.in).nextLine());
                    break;
                case 3:
                    System.out.println("Ingrese el nuevo telefono");
                    em.setTelefono(new Scanner(System.in).nextLine());
                    break;
                case 4:
                    ArrayList<Area> areas = aa.listar();
                    for (Area a : areas) {
                        System.out.println(a);
                    }
                    System.out.println("Ingrese el id de la nueva area");
                    int area = new Scanner(System.in).nextInt();
                    Area a = aa.buscar(area);
                    if (a != null) {
                        em.setArea_id(a);
                    } else {
                        System.out.println("AREA NO ENCONTRADA, NO SE PUEDE ACTUALIZAR");
                    }
                    break;
            }
            ga.actualizar(em, id);
        } else {
            System.out.println("No existe dicha area");
        }
    }

    private void buscar() {
        System.out.println("Ingrese el id de el empleado a buscar");
        int id = new Scanner(System.in).nextInt();
        Empleado em = ga.buscar(id);
        if (em != null) {
            System.out.println(em);
        } else {
            System.out.println("No existe dicha area!");
        }
    }

    private void eliminar() {
        System.out.println("Ingrese el id del empleado a eliminar");
        int id = new Scanner(System.in).nextInt();
        ga.eliminar(id);
    }

    private void listar() {
        ArrayList<Empleado> empleados = ga.listar();
        for (Empleado em : empleados) {
            System.out.println(em);
        }
    }

    public void menu() {
        int op = 0;
        do {
            System.out.println("""
                           ******************************
                                        Empleado
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
                    registrar();
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
