
package CONTROLADOR;

import MODELO.Area;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ANGEL
 */
public class GestionarAreaImpl implements GestionarArea{
    Conexion c = new Conexion();
    

    @Override
    public void guardar(Area a) {
        try(Connection con = c.conectar()){
            PreparedStatement ps = con.prepareStatement("insert into area(nombre, descripcion) values (?,?)");
            ps.setString(1, a.getNombre());
            ps.setString(2, a.getDescripcion());
            ps.executeUpdate();
            System.out.println("REGISTRO EXITOSO!!!!!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public void actualizar(Area a, int id) {
        try(Connection con = c.conectar()){
            PreparedStatement ps = con.prepareStatement("update area set nombre=?, descripcion=? where id=?");
            ps.setString(1, a.getNombre());
            ps.setString(2, a.getDescripcion());
            ps.setInt(3, id);
            ps.executeUpdate();
            System.out.println("ACTUALIZACION EXITOSA!!!!!!!!!");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public void eliminar(int id) {
        try(Connection con= c.conectar()){
            PreparedStatement ps = con.prepareStatement("delete from area where id= ?");
            ps.setInt(1, id);
            int op = JOptionPane.showConfirmDialog(null,"Desea elimimar el area?", null,JOptionPane.YES_NO_OPTION);
            if(op ==0){
                ps.executeUpdate();
                System.out.println("ELIMINACION EXITOSA!!");    
            }else{
                System.out.println("Operacion Cancelada!!!!");
            }
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public ArrayList<Area> listar() {
        ArrayList<Area> areas = new ArrayList<>();
        try(Connection con = c.conectar()){
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from area");
            while(rs.next()){
                areas.add(new Area(rs.getInt(1), rs.getString(2),rs.getString(3)));
                
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return areas;
        
    }

    @Override
    public Area buscar(int id) {
        Area a = new Area();
        try(Connection con = c.conectar()){
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from area where id=" + id);
            while(rs.next()){
                a.setId(rs.getInt(1));
                a.setNombre(rs.getString(2));
                a.setDescripcion(rs.getString(3));
            }
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return a;
        
    }

    
    

}
