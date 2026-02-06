package CONTROLADOR;

import MODELO.Persona;
import java.util.ArrayList;

public class Funcion {

    private ArrayList<Persona> personas;

    public Funcion() {
        this.personas = new ArrayList<>();
    }


    public void registrar(Persona p) {
        personas.add(p);
        System.out.println("Registrado: " + p.getDocumento() + " (" + p.getTipo() + ")");
    }

    public void imprimir() {
        
        System.out.println("===============================");
        System.out.println("Datos de Registro ");

        for (int i = 0; i < personas.size(); i++) {
            Persona p = personas.get(i);

            System.out.println("""
                -----------------------------
                Documento: %s
                Nombre: %s
                Apellido: %s
                Edad: %d
                Direccion: %s
                Tipo de personal: %s
                """.formatted(
                    p.getDocumento(),
                    p.getNombre(),
                    p.getApellido(),
                    p.getEdad(),
                    p.getDireccion(),
                    p.getTipo()
            ));
        }
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }
}
