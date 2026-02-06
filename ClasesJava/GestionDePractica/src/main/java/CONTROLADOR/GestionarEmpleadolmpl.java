
package CONTROLADOR;

import MODELO.Area;
import MODELO.Empleado;
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
public class GestionarEmpleadolmpl implements GestionarEmpleado {

    Conexion c = new Conexion();
    

    @Override
    public void guardar(Empleado em) {
        try(Connection con = c.conectar()){
            PreparedStatement ps = con.prepareStatement("insert into empleado(nombre, apellido, telefono, area_id) values (?,?,?,?)");
            ps.setString(1, em.getNombre());
            ps.setString(2, em.getApellido());
            ps.setString(3, em.getTelefono());
            ps.setString(4, String.valueOf(em.getArea_id().getId()));
            ps.executeUpdate();
            System.out.println("REGISTRO EXITOSO!!!!!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public void actualizar(Empleado em, int id) {
        try(Connection con = c.conectar()){
            PreparedStatement ps = con.prepareStatement("update empleado set nombre=?, apellido=?, telefono=?, area_id=? where id=?");
            ps.setString(1, em.getNombre());
            ps.setString(2, em.getApellido());
            ps.setString(3, em.getTelefono());
            ps.setString(4, String.valueOf(em.getArea_id().getId()));
            ps.setInt(5, id);
            ps.executeUpdate();
            System.out.println("ACTUALIZACION EXITOSA!");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public void eliminar(int id) {
        try (Connection con = c.conectar()) {
            //La usamos cuando queremos hacer una inserción o modificacion a la base de datos.
            PreparedStatement ps = con.prepareStatement("delete from empleado where id=?");
            ps.setInt(1, id);
            int op = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el empleado?", null, JOptionPane.YES_NO_OPTION);
            if (op == 0) {
                ps.executeUpdate();
                System.out.println("ELIMINACION EXITOSA!");
            } else {
                System.out.println("Operacion cancelada");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public ArrayList<Empleado> listar() {
        ArrayList<Empleado> areas = new ArrayList<>();
        GestionarArea ga = new GestionarAreaImpl();
        try (Connection con = c.conectar()) {
            //creo el statement para que quede listo cuando quiera escribir en sql
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from empleado");
            while (rs.next()) {
                Area a = ga.buscar(Integer.parseInt(rs.getString(5)));
                areas.add(new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), a));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return areas;
    }

    @Override
    public Empleado buscar(int id) {
        Empleado em = new Empleado();
        GestionarArea ga = new GestionarAreaImpl();
        try (Connection con = c.conectar()) {
            //creo el statement para que quede listo cuando quiera escribir en sql
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from empleado where id=" + id);
            while (rs.next()) {
                Area a = ga.buscar(Integer.parseInt(rs.getString(5)));
                em.setId(rs.getInt(1));
                em.setNombre(rs.getString(2));
                em.setApellido(rs.getString(3));
                em.setTelefono(rs.getString(4));
                em.setArea_id(a);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return em;
    }

    

}
