import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BancoMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validaciones v = new Validaciones();
        MetodosBanco m = new MetodosBanco();

        Queue<Cliente> fila = new LinkedList<>();

        boolean ejecutar = true;

        while (ejecutar) {
            System.out.println("\n BANCO");
            System.out.println("1) Tomar turno");
            System.out.println("2) Atender cliente");
            System.out.println("3) Ver quién sigue");
            System.out.println("4) Mostrar todos los clientes en espera");
            System.out.println("5) Cerrar");
            System.out.print("Elija una opción: ");

            int opcion = v.ValidarEntero(sc);

            switch (opcion) {
                case 1:

                    fila = m.llegadaCliente(fila, sc);
                    break;
                case 2:

                    fila = m.atenderCliente(fila);
                    break;
                case 3:
                    m.verSiguiente(fila);
                    break;
                case 4:
                    m.verColaActual(fila);
                    break;
                case 5:
                    System.out.println("Cerrando la sucursal...");
                    ejecutar = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }
}