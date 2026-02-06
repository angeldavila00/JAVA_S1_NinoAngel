
package ar.angel.aplicaccionlambda;

/**
 *
 * @author ANGEL
 */
public class Personalmpl implements Persona {

   @Override
    public void saludar(String nombre) {
        System.out.println("Hola "+nombre);
    }

}
