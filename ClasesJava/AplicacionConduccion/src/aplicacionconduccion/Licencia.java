
package aplicacionconduccion;

import java.io.Serializable;

/**
 *
 * @author Komodin
 */
public class Licencia implements Serializable{
    private Personas persona;
    private String numero;
    private String categoria;

    public Licencia(Personas persona, String numero, String categoria) {
        this.persona = persona;
        this.numero = numero;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        String texto = """
                       %s
                       Numero Licencia: %s
                       Categoria: %s
                       """.formatted(persona,numero,categoria);
        return texto;    
    }
    
    public Personas getPersona(){
        return persona;
    }
    
    

}
