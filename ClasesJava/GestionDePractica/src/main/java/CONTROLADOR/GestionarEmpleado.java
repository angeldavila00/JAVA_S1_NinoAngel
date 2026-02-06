
package CONTROLADOR;

import MODELO.Empleado;
import java.util.ArrayList;

/**
 *
 * @author ANGEL
 */
public interface GestionarEmpleado {
    void guardar(Empleado e);
    
    void actualizar(Empleado e, int id);
    
    void eliminar(int id);
    
    ArrayList<Empleado> listar();
    
    Empleado buscar(int id);
}
