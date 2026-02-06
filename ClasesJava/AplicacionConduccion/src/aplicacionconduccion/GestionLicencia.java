
package aplicacionconduccion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author Komodin
 */
public class GestionLicencia {
    
    private ArrayList<Licencia> licencias = new ArrayList<>();
    private final String ARCHIVO = "Licencias.dat";
    
    //Dministrar la permanencia de datos
    public void cargar(){
        File f = new File(ARCHIVO);
        if (!f.exists()) {
            return; //Se acabe la funcion
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO))){
            licencias = (ArrayList<Licencia>) ois.readObject();   
        }catch(Exception e){
            
        }
    }
    
    public void guardar(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))){
            oos.writeObject(licencias);           
        }catch(Exception e){
            e.printStackTrace();
            
        }
    }
    //Constructor 
    
    public GestionLicencia(){
        cargar();       
    }
    //Administrar Lista
    public void registrar(Licencia l){
        licencias.add(l);
    }
    
    public void listar(){
        if (licencias.isEmpty()) {
            System.out.println("No hay Licencias");
            return;
        }
        for(Licencia l: licencias){
            System.out.println(l);
        }
    }
    
    public void buscar(String cedula){
        /*for (int i = 0; i < licencias.size(); i++) {
            if(licencias.get(i).getPersona().getCedula().equals(cedula)){
                System.out.println("");
            }
            
        }*/
        for(Licencia l: licencias){
            if(l.getPersona().getCedula().equals(cedula)){
                System.out.println(l);
            }
            
        }
    }
    
    public void eliminar(String cedula){
        for (int i = 0; i < licencias.size(); i++) {
            if(licencias.get(i).getPersona().getCedula().equals(cedula)){
                licencias.remove(i);
            }
        }
    }
    //Backup
    public void exportarBackup(){
        JFileChooser j = new JFileChooser();
        j.setDialogTitle("Escoja la ruta a guardar");
        int op =j.showSaveDialog(j); //Guardar dialogo
        if(op==JFileChooser.APPROVE_OPTION){
            File destino = j.getSelectedFile();
            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(destino))){
                oos.writeObject(licencias);
                System.out.println("Base de datos exportada correctamente");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }

}
