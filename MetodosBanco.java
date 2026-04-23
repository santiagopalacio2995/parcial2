import java.util.Queue;
import java.util.Scanner;

public class MetodosBanco {

    private int contadorTurnos = 1;

    public Queue<Cliente> llegadaCliente(Queue<Cliente> fila, Scanner sc) {
        sc.nextLine();
        System.out.println("Ingrese el nombre del cliente:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el tipo de servicio:");
        String servicio = sc.nextLine();

        Cliente nuevo = new Cliente(contadorTurnos, nombre, servicio);
        fila.offer(nuevo);

        System.out.println("Cliente registrado: Turno #" + contadorTurnos);
        contadorTurnos++;

        return fila;
    }

    public Queue<Cliente> atenderCliente(Queue<Cliente> fila) {
        if (!fila.isEmpty()) {
            Cliente atendido = fila.poll();
            atendido.setAtendido(true);

            System.out.println("ATENDIENDO CLIENTE");
            System.out.println("Llamando a: " + atendido.getNombre());
            System.out.println("Turno: #" + atendido.getId());
            System.out.println("Servicio: " + atendido.getTipoServicio());
        } else {
            System.out.println("No hay clientes esperando en la fila.");
        }

        return fila;
    }

    public void verSiguiente(Queue<Cliente> fila) {
        if (!fila.isEmpty()) {
            Cliente siguiente = fila.peek();
            System.out.println("El próximo es: Turno #" + siguiente.getId() + siguiente.getNombre());
        } else {
            System.out.println("La fila está vacía, no hay siguiente.");
        }
    }

    public void verColaActual(Queue<Cliente> fila) {
        if (fila.isEmpty()) {
            System.out.println("La fila actual está vacía.");
            return;
        }
        System.out.println("\n TURNOS EN FILA (" + fila.size());
        for (Cliente c : fila) {
            System.out.println(c);
        }

    }
}