
package MODELO;

public class Colaborador extends Persona {
    private String metaVoluntaria;
    private int horas;
    private double bonificaciones;

    public Colaborador(String metaVoluntaria, int horas, double bonificaciones, String documento, String nombre, String apellido, int edad, String direccion) {
        super(documento, nombre, apellido, edad, direccion);
        this.metaVoluntaria = metaVoluntaria;
        this.horas = horas;
        this.bonificaciones = bonificaciones;
    }
    
    @Override
    public void Presentarse(){
        System.out.println("Soy Colaborador, mi nombre es "+getNombre()+ " "+getApellido());
        
    }

    public String getMetaVoluntaria() {
        return metaVoluntaria;
    }

    public void setMetaVoluntaria(String metaVoluntaria) {
        this.metaVoluntaria = metaVoluntaria;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getBonificaciones() {
        return bonificaciones;
    }

    public void setBonificaciones(double bonificaciones) {
        this.bonificaciones = bonificaciones;
    }
    

}
