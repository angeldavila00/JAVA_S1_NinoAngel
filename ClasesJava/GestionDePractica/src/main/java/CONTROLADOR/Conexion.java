
package CONTROLADOR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ANGEL
 */
public class Conexion {
    
    public Connection conectar(){
        Connection c = null;
        try{
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/campusan", "root", "123456789");
            System.out.println("coneccion exitosa");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return c;
    }

}
