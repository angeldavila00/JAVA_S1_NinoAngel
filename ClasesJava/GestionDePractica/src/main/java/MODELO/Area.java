
package MODELO;

/**
 *
 * @author ANGEL
 */
public class Area {
    private int id;
    private String nombre,descripcion;
    

    public Area(int id,String nombre, String descripcion ) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        
    }
    
    public Area(){
        
    }

    public String getNombre() {
        return nombre;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public String toString() {
        return """
               ============================
               Id:          %s
               Nombre:      %s
               Descripcion: %s
               """.formatted(id,nombre,descripcion);
    }
    
    
    

}
