public class Caja  implements Runnable{
    private String nombre;
    private GestionVentas gestionVentas;
    private String[] pedidos;

    public Caja(String nombre, GestionVentas gestionVentas, String[] pedidos) {
        this.nombre = nombre;
        this.gestionVentas = gestionVentas;
        this.pedidos = pedidos;
    }

    @Override
    public void run() {
        Thread actual = Thread.currentThread();
        System.out.println("\n======" + nombre + " ======");
        System.out.println("ID: " + actual.getId());
        System.out.println("Prioridad: " + actual.getPriority());
        System.out.println("Estado: " + actual.getState());
        System.out.println("-----------------------------");

        for (int i = 0; i < pedidos.length; i++) {
            gestionVentas.vender(pedidos[i], nombre);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(nombre + " fue interrumpida");
                Thread.currentThread().interrupt();
            }
        }

        System.out.println(nombre + " terminó su turno");
    }
}
