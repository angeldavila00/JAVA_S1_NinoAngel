
package MODELO;

/**
 *
 * @author ANGEL
 */
public class Empleado {
    private int id;
    private String nombre,apellido,telefono;
    private Area area_id;

    public Empleado(int id, String nombre, String apellido, String telefono, Area area_id) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.area_id = area_id;
    }
    
    public Empleado(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Area getArea_id() {
        return area_id;
    }

    public void setArea_id(Area area_id) {
        this.area_id = area_id;
    }

    @Override
    public String toString() {
        return """
               ===========================
               Id:       %s
               Nombre:   %s
               Apellido: %s
               Telefono: %s
               %s
               """.formatted(id,nombre,apellido,telefono,area_id);
    }
    

}
