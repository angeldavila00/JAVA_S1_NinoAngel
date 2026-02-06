import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws InterruptedException
    {
        Map<String, Integer> inventario = new HashMap<>();
        inventario.put("Pera", 5);
        inventario.put("Naranja", 10);
        inventario.put("Manzana", 50);
        inventario.put("Mandarina", 24);
        inventario.put("Arroz", 34);

        System.out.println("Cantidad de manzanas: " + inventario.get("Manzana"));

        GestionVentas gestionVentas = new GestionVentas(inventario);
        String[] pedido1 = {"Arroz", "Arroz", "Naranja"};
        String[] pedido2 = {"Pera", "Naranja", "Naranja"};
        String[] pedido3 = {"Mandarina", "Arroz", "Pera", "Mandarina"};
    /*
      Inventario Final:
      Pera: 3
      Naranja: 6
      Manzana: 50
      Arroz: 31
      Mandarina: 32
      */

        //Creamos las cajas (Hilos)

        Thread caja1 = new Thread(new  Caja("Caja - 1", gestionVentas, pedido1));
        Thread caja2 = new Thread(new Caja("Caja - 2", gestionVentas, pedido2));
        Thread caja3 = new Thread(new Caja("Caja - 3", gestionVentas, pedido3));

        //Gestionar las prioridades:
        caja1.setPriority(5);
        caja2.setPriority(10);
        caja3.setPriority(2);

        //Start
        caja1.start();
        caja2.start();
        caja3.start();

        caja1.join();
        caja2.join();
        caja3.join();

        System.out.println("\n INVENTARIO FINAL");
        gestionVentas.mostrarInventario();

    }
}