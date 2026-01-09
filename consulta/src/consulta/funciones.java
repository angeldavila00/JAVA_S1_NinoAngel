package consulta;

import java.util.Scanner;

public class funciones {

    static int validacion(int valorMinimo, int valorMaximo, String mensaje) {
        boolean validar = false;
        int op = 0;
        do {
            try {
                System.out.println(mensaje);
                op = new Scanner(System.in).nextInt();
                while (op < valorMinimo || op > valorMaximo) {
                    System.out.println("Opcion no valida, ingresa nuevamente");
                    op = new Scanner(System.in).nextInt();
                }
                validar = true;
            } catch (Exception e) {
                System.out.println("Error porfavor Ingrese solo numeros");
            }
        } while (validar == false);
        return op;
    }

    static void mostrarPacientes(ClinicaMonsalveNiño p) {
        if (p != null) {
            System.out.println("==========================");
            System.out.println("===Informacion Paciente===");
            System.out.println("Nombre" + p.getNombre());
            System.out.println("Numero Documento" + p.getNumeroDocumento());
            System.out.println("Edad" + p.getEdad());
            System.out.println("Motivo de la coonsulta" + p.getMotivo());
            System.out.println("Telefono" + p.getTelefono());
            System.out.println("Tipo Paciente" + p.getTipoPaciente());
            System.out.println("Estado Paciente" + p.getEstado());
        } else {

        }
    }

    public static void main(String[] args) {
        ClinicaMonsalveNiño p1 = null;
        ClinicaMonsalveNiño p2 = null;
        ClinicaMonsalveNiño p3 = null;
        ClinicaMonsalveNiño p4 = null;
        int op = 0;
        do {
            op = validacion(1, 4, "============================\n1- Registrar paciente\n2- Mostrar pacientes registrados\n3- Atender paciente\n4- Salir");
            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre del paciente");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.println("Ingrese El Numero de documento del paciente");
                    String numeroDocumento = new Scanner(System.in).nextLine();
                    System.out.println("Ingrese la edad del paciente");
                    int edad = new Scanner(System.in).nextInt();
                    System.out.println("Ingrese el motivo");
                    String motivo = new Scanner(System.in).nextLine();
                    System.out.println("Ingrese el telefono del paciente");
                    double telefono = new Scanner(System.in).nextDouble();
                    if (p1 == null) {
                        p1 = new ClinicaMonsalveNiño(nombre, numeroDocumento, edad, motivo, telefono, "", "registrado");
                    } else {
                        if (p2 == null) {
                            p2 = new ClinicaMonsalveNiño(nombre, numeroDocumento, edad, motivo, telefono, "", "registrado");
                        } else {
                            if (p3 == null) {
                                p3 = new ClinicaMonsalveNiño(nombre, numeroDocumento, edad, motivo, telefono, "", "registrado");
                            } else {
                                if (p4 == null) {
                                    p4 = new ClinicaMonsalveNiño(nombre, numeroDocumento, edad, motivo, telefono, "", "registrado");
                                } else {
                                    System.out.println("Ya no hay mas cupos Disponibles");
                                }
                            }

                        }

                    }
                    break;
                case 2:
                    mostrarPacientes(p1);
                    break;

            }
        } while (op != 4);
    }
}
