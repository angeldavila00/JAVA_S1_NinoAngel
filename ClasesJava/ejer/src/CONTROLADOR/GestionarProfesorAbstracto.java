
package CONTROLADOR;
public abstract class GestionarProfesorAbstracto {
    public abstract void registrar();
    public abstract void eliminar(String cedula);
    public abstract String buscar_niombre_completo(String cedula);

}
