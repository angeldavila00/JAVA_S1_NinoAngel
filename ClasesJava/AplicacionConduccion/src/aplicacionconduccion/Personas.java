
package aplicacionconduccion;

import java.io.Serializable;

/**
 *
 * @author Komodin
 */
public class Personas implements Serializable{
    private String nombre,cedula;
    private int edad;

    public Personas(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        
        String texto = """
                       Nombre: %s
                       Cedula: %s
                       edad: %s
                       """.formatted(nombre,cedula,edad);
        return texto;
    }
    
    
}
