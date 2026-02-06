
package CONTROLADOR;

import MODELO.Area;
import java.util.ArrayList;

/**
 *
 * @author ANGEL
 */
public interface GestionarArea {
    
    void guardar(Area a);
    
    void actualizar(Area a, int id);
    
    void eliminar(int id);
    
    ArrayList<Area> listar();
    
    Area buscar(int id);

}
