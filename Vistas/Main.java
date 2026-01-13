
package Vistas;

import Controladores.Funciones;
import Controladores.Validaciones;

public class Main {
    public void iniciar(){
       
        Validaciones v = new Validaciones();
        Funciones f = new Funciones();
        int op =0;
        
            
        do {
            op = v.validacion_entero("============================\n1- Registrar paciente\n2- Mostrar pacientes registrados\n3- Atender paciente\n4- Salir",1, 4);
            switch(op){
                case 1 -> f.agregar_paciente();
                case 2 -> f.visualizar();
                case 3 -> f.espera_estado();
            }
        } while (op != 4);
    }
}

