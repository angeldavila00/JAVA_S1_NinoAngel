package MODELO;

public class Colaborador extends Persona {

    private int horas;

    public Colaborador(int horas, String documento, String nombre, String apellido, int edad, String direccion) {
        super(documento, nombre, apellido, edad, direccion);
        this.horas = horas;
    }

    public int getHoras() { return horas; }
    public void setHoras(int horas) { this.horas = horas; }

    @Override
    public String getTipo() {
        return "Colaborador";
    }
    @Override
    public void Presentarse(){
        System.out.println("Hola, mi nombre es "+getNombre()+ " "+getApellido());
        
    }
}
