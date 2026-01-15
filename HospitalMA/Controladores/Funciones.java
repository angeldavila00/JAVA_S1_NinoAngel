
package Controladores;

import Modelo.Persona;
import java.util.Scanner;

public class Funciones {
 Validaciones v = new Validaciones();
    Persona p1 = null;
    Persona p2 = null;
    Persona p3 = null;
    Persona p4 = null;

    public void agregar_paciente() {
        System.out.println("Ingrese el nombre del paciente ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Ingrese El Numero de documento del paciente ");
        String numeroDocumento = new Scanner(System.in).nextLine();
        int edad = v.validacion_entero("Ingrese la edad del paciente ",0, 150);
        String edadV = String.valueOf(edad);
        edadV = v.VerificarTipoPaciente(edad);
        System.out.println("Ingrese el motivo ");
        String motivo = new Scanner(System.in).nextLine();
        System.out.println("Ingrese el telefono del paciente ");
        String telefono = new Scanner(System.in).nextLine();
        if (p1 == null) {
            p1 = new Persona(nombre, numeroDocumento, edad, motivo, telefono, "", "registrado");
        } else {
            if (p2 == null) {
                p2 = new Persona(nombre, numeroDocumento, edad, motivo, telefono, "", "registrado");
            } else {
                if (p3 == null) {
                    p3 = new Persona(nombre, numeroDocumento, edad, motivo, telefono, "", "registrado");
                } else {
                    if (p4 == null) {
                        p4 = new Persona(nombre, numeroDocumento, edad, motivo, telefono, "", "registrado");
                    } else {
                        System.out.println("Ya no hay mas cupos Disponibles");
                    }
                }

            }
        }
    }

    public void visualizar() {
        visualizar_pacientes(p1);
        visualizar_pacientes(p2);
        visualizar_pacientes(p3);
        visualizar_pacientes(p4);
    }

    public void visualizar_pacientes(Persona p) {
        if (p != null) {
            System.out.println("==========================");
            System.out.println("===Informacion Paciente===");
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Numero Documento: " + p.getNumeroDocumento());
            System.out.println("Edad: " + p.getEdad());
            System.out.println("Motivo de la coonsulta: " + p.getMotivo());
            System.out.println("Telefono: \n" + p.getTelefono().replace(",", "\n"));
            System.out.println("Tipo Paciente: " + p.getTipoPaciente());
            System.out.println("Estado Paciente: " + p.getEstado());
        } else {

        }
    }
    
    public void espera_estado(){
        atencion_paciente(p1);
        atencion_paciente(p2);
        atencion_paciente(p3);
        atencion_paciente(p4);
    }
    
    public void atencion_paciente(Persona p) {
        if (p != null && p.getEstado().equals("registrado")) {
            System.out.println("==========================");
            System.out.println("Paciente: " + p.getNombre());
            System.out.println("Estado de disponibilidad: " +p.getEstado());
            int opp = v.validacion_entero("Quieres atender a este Paciente??\n1. SI\n2. NO",1, 2);
            if(opp ==1){
                p.setEstado("atendido");
                System.out.println("El estado del paciente fue actualizado");
            }else{
                System.out.println("El paciente sigue en espera");
            }
        }
    }
}
