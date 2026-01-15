package VISTA;

import CONTROLADOR.Funciones;
import static CONTROLADOR.Validacion.validacion;

public class main {

    public static void main(String[] args) {

        int opcion;

        do {
            opcion = validacion(1, 3, """
                                      
                                      === FUNDACION AYUDAS COMUNITARIAS ===
                                      1. Registrar persona
                                      2. Ver persona registrada
                                      3. Salir
                                      Seleccione una opcion: """);

            switch (opcion) {
                case 1 -> Funciones.registrar();
                case 2 -> Funciones.verPersona();
                case 3 -> System.out.println("Programa finalizado.");
            }

        } while (opcion != 3);
    }
}
