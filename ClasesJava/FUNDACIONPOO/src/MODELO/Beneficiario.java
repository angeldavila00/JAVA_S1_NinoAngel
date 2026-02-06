package MODELO;

public class Beneficiario extends Persona {

    private int ayudasMes;

    public Beneficiario(int ayudasMes, String documento, String nombre, String apellido, int edad, String direccion) {
        super(documento, nombre, apellido, edad, direccion);
        this.ayudasMes = ayudasMes;
    }

    public int getAyudasMes() {
        return ayudasMes;
    }

    public void setAyudasMes(int ayudasMes) {
        this.ayudasMes = ayudasMes;
    }

    @Override
    public String getTipo() {
        return "Beneficiario";
    }
    
    @Override
    public void Presentarse(){
        System.out.println("Hola, mi nombre es "+getNombre()+ " "+getApellido());
        
    }
}
