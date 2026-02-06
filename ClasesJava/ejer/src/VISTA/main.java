
package VISTA;

import MODELO.Profesor;

public class main {

    public static void main(String[] args) {
        Profesor p = new Profesor("Español", 20000, "1004556787", "Andres", "Monsalve");
        
        System.out.println("Hola me llamo "+ p.getNombre() +" mi salario es de "+p.getSalario());
    }

}
