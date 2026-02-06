import java.util.Map;

public class GestionVentas {


    protected Map<String, Integer> inventario;

    public GestionVentas(Map<String, Integer> inventario) {
        this.inventario = inventario;
    }

    public synchronized void vender(String producto, String caja) {
        Integer stock = inventario.get(producto);

        if (stock == null) {
            System.out.println(caja + " intentó vender '" + producto + "' pero no existe en inventario.");
            return;
        }
        if (stock > 0) {
            inventario.replace(producto, stock - 1);
            System.out.println(caja + " vendió 1 " + producto +
                    " | Stock restante: " + (stock - 1));
        } else {
            System.out.println("La cantidad a vender supera el límite del producto, Stock: " + stock);
        }

        try {
            Thread.sleep(500);
        } catch (Exception e) {
            // excepción ignorada
        }
    }

    public void mostrarInventario() {
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}



