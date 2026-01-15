
package MODELO;

public class Beneficiario extends Persona{
    private int ayudasMes;

    public Beneficiario(int ayudasMes, String documento, String nombre, String apellido, int edad, String direccion) {
        super(documento, nombre, apellido, edad, direccion);
        this.ayudasMes = ayudasMes;
    }

    

    @Override
    public void Presentarse(){
        System.out.println("Soy Beneficiario, mi nombre es "+getNombre()+ " "+getApellido());
        
    }
    public int getAyudasMes() {
        return ayudasMes;
    }

    public void setAyudasMes(int ayudasMes) {
        this.ayudasMes = ayudasMes;
    }

}
