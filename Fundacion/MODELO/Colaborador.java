
package MODELO;

public class Colaborador extends Persona {
    
    private int horas;

    public Colaborador(int horas,String documento, String nombre, String apellido, int edad, String direccion, String tipo) {
        super(documento, nombre, apellido, edad, direccion, tipo);
        this.horas=horas;
    }
    
    @Override
    public void Presentarse(){
        System.out.println("Soy Colaborador, mi nombre es "+getNombre()+ " "+getApellido());
        
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
   
    

}
