import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Definir credenciales
        String nombre_usuario = "Angel";
        String contraseña = "1234";
        double saldo = 3000000;

        //Definir Productos
        //Comida
        double hamburguesa = 20000;
        double pizza = 15000;
        double perros = 18000;
        double sushi = 35000;

        //Ropa
        double adidas = 200000;
        double nike = 220000;
        double puma = 190000;
        double reebok = 150000;

        // Tecnologia
        double computadores = 1200000;
        double portatiles = 1800000;
        double audifonos = 200000;
        double teclado = 170000;

        //INICIO SESION
        int opcion_menu = 0;
        System.out.println("""
                               ================================
                               Bienvenido al Carrito de mercado
                               ================================
                                Panel Inicio De Sesion
                               ================================
                               """);

        System.out.println("Ingrese el usuario: ");
        String usuario_aux = new Scanner(System.in).nextLine();
        while (!usuario_aux.equals(nombre_usuario)) {
            System.out.println("Error el usuario no es correcto!!!!");
            System.out.println("Intentar Nuevamente...");
            usuario_aux = new Scanner(System.in).nextLine();
        }
        System.out.println("Ingresa la contraseña: ");
        String contraseña_aux = new Scanner(System.in).nextLine();
        while (!contraseña_aux.equals(contraseña)) {
            System.out.println("La contraseña es incorrecta!!!!");
            System.out.println("Tienes solo 3 intentos..");
            for (int i = 0; i < 3; i++) {
                if (!contraseña_aux.equals(contraseña)) {
                    System.out.println("Intento numero" + (i + 1));
                    contraseña_aux = new Scanner(System.in).nextLine();
                } else {
                    System.out.println("Contraseña correcta.");
                }
            }
        }
        boolean salir = false;
        //CONTROL DE MENU
        do {
            System.out.println("""
                           ================================================
                                    ¡Bienvenido al carrito de mercado!
                           1.   Productos
                           2.   saldo total
                           3.   Salir!!!
                           
                           =================================================
                           """);
            System.out.println("Elige un opcion(opcion Numerica):");
            int opcion_carrito = new Scanner(System.in).nextInt();

            while (opcion_carrito < 1 || opcion_carrito > 4) {
                System.out.println("Error, opciones no validas, intente nuevamente.");
                opcion_carrito = new Scanner(System.in).nextInt();
            }
            //opcion 1 PRODUCTOS
            if (opcion_carrito == 1) {
                System.out.println("""
                               ===============================================
                                            CATEGORIA DE PRODUCTOS
                               1.       COMIDA
                               2.       ROPA
                               3.       TECNOLOGIA
                               4.       Regresar!!!!
                                    
                               """);
                System.out.println("Elige una opcion(opcion Numerica):");
                int opcion_producto = new Scanner(System.in).nextInt();

                while (opcion_producto < 1 || opcion_producto > 4) {
                    System.out.println("Error, opciones no validas, intente nuevamente.");
                    opcion_producto = new Scanner(System.in).nextInt();
                }

                //COMIDA
                if (opcion_producto == 1) {
                    System.out.println("""
                                   =================================
                                        Lista de precios comida
                                   1. Hamburguesa   $20.000
                                   2. Pizzas        $15.000
                                   3. Perros        $18.000
                                   4. Sushi         $35.000
                                   5. Regresar...
                                   """);
                    System.out.println("Elige un Producto(opcion Numerica): ");
                    int comida = new Scanner(System.in).nextInt();

                    switch (comida) {
                        case 1:
                            System.out.println("Compra de Hamburguesa por un precio de" + hamburguesa);
                            double compra_hamb = saldo -= hamburguesa;
                            System.out.println("Compra exitosa y saldo disponible en la cuenta: " + compra_hamb);
                            break;
                        case 2:
                            System.out.println("Compra de Pizza por un precio de " + pizza);
                            double compra_pizza = saldo -= pizza;
                            System.out.println("Compra exitosa y saldo disponible en la cuenta: " + compra_pizza);
                            break;
                        case 3:
                            System.out.println("Compra de Pizza por un precio de " + perros);
                            double compra_perros = saldo -= perros;
                            System.out.println("Compra exitosa y saldo disponible en la cuenta: " + compra_perros);
                            break;
                        case 4:
                            System.out.println("Compra de Pizza por un precio de " + sushi);
                            double compra_sushi = saldo -= sushi;
                            System.out.println("Compra exitosa y saldo disponible en la cuenta: " + compra_sushi);
                            break;
                        case 5:
                            System.out.println("Regresando al menu inicial...");
                            break;
                    }
                }

                //ROPA
                if (opcion_producto == 2) {
                    System.out.println("""
                                   =================================
                                        Lista de precios ROPA
                                   1. Adidas   $200.000
                                   2. Nike     $220.000
                                   3. Puma     $190.000
                                   4. Reebok   $150.000
                                   5. Regresar...

                                   """);
                    System.out.println("Elige un Producto(opcion Numerica): ");
                    int ropa = new Scanner(System.in).nextInt();
                    switch (ropa) {
                        case 1:
                            System.out.println("Compra de ropa ADIDAS por un precio de" + adidas);
                            double compra_adidas = saldo -= adidas;
                            System.out.println("Compra exitosa y saldo disponible en la cuenta: " + compra_adidas);
                            break;
                        case 2:
                            System.out.println("Compra de ropa NIKE por un precio de " + nike);
                            double compra_nike = saldo -= nike;
                            System.out.println("Compra exitosa y saldo disponible en la cuenta: " + compra_nike);
                            break;
                        case 3:
                            System.out.println("Compra de ropa PUMA por un precio de " + puma);
                            double compra_puma = saldo -= puma;
                            System.out.println("Compra exitosa y saldo disponible en la cuenta: " + compra_puma);
                            break;
                        case 4:
                            System.out.println("Compra de ropa REEBOK por un precio de " + reebok);
                            double compra_reebok = saldo -= reebok;
                            System.out.println("Compra exitosa y saldo disponible en la cuenta: " + compra_reebok);
                            break;
                        case 5:
                            System.out.println("Regresando al menu inicial....");
                            break;
                    }

                }

                //TECNOLOGIA
                if (opcion_producto == 3) {
                    System.out.println("""
                                   =================================
                                        Lista de precios TECNOLOGIA
                                   1. Computadores  $1.200.000
                                   2. Portatiles    $1.800.000
                                   3. Audifonos     $200.000
                                   4. Teclados      $170.000
                                   5. Regresar..
                                   """);
                    System.out.println("Elige un Producto(opcion Numerica): ");
                    int tecnologia = new Scanner(System.in).nextInt();
                    switch (tecnologia) {
                        case 1:
                            System.out.println("Compra de COMPUTADOR por un precio de" + computadores);
                            double compra = saldo -= computadores;
                            System.out.println("Compra exitosa y saldo disponible en la cuenta: " + compra);
                            break;
                        case 2:
                            System.out.println("Compra de PORTATIL por un precio de " + portatiles);
                            compra = saldo -= portatiles;
                            System.out.println("Compra exitosa y saldo disponible en la cuenta: " + compra);
                            break;
                        case 3:
                            System.out.println("Compra de AUDIFONOS por un precio de " + audifonos);
                            compra = saldo -= audifonos;
                            System.out.println("Compra exitosa y saldo disponible en la cuenta: " + compra);
                            break;
                        case 4:
                            System.out.println("Compra de TECLADO por un precio de " + teclado);
                            compra = saldo -= teclado;
                            System.out.println("Compra exitosa y saldo disponible en la cuenta: " + compra);
                            break;
                        case 5:
                            System.out.println("Regresando al menu anterior....");
                            break;

                    }
                }
            }
            //OPCION 2 -= SALDO
            if (opcion_carrito == 2) {
                System.out.println("[DEBUG] Entró a opción 2");
                System.out.println("Saldo Disponible "+saldo);

            }

            //OPCION 3 -= SALIR
            if (opcion_carrito == 3) {
                System.out.println("Gracias por usar el sistema...");

                salir = true;
            }
        }
        while (!salir);
    }
}
