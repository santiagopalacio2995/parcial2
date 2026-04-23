import java.util.Stack;
import java.util.Scanner;

public class NavegadorMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validaciones v = new Validaciones();
        MetodosNavegador m = new MetodosNavegador();
        Stack<PaginaWeb> historial = new Stack<>();

        boolean ejecutar = true;

        while (ejecutar) {
            System.out.println("\nNAVEGADOR");
            if (!historial.isEmpty()) {
                System.out.println("PÁGINA ACTUAL: " + historial.peek().getTitulo());
            } else {
                System.out.println("PÁGINA ACTUAL: [   NULL       ]");
            }

            System.out.println("1) Visitar nueva página");
            System.out.println("2) Atrás");
            System.out.println("3) Ver historial completo");
            System.out.println("4) Salir");

            int opcion = v.ValidarEntero(sc);

            switch (opcion) {
                case 1:

                    historial = m.visitarPagina(historial, sc);
                    break;
                case 2:

                    historial = m.retroceder(historial);
                    break;
                case 3:

                    m.mostrarHistorial(historial);
                    break;
                case 4:
                    System.out.println("Cerrando");
                    ejecutar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}