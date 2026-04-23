import java.util.Stack;
import java.util.Scanner;

public class MetodosNavegador {
    
   
    public Stack<PaginaWeb> visitarPagina(Stack<PaginaWeb> historial, Scanner sc) {
        sc.nextLine(); 
        System.out.println("Ingrese el título de la página:");
        String titulo = sc.nextLine();
        System.out.println("Ingrese la URL:");
        String url = sc.nextLine();
        
        PaginaWeb nueva = new PaginaWeb(url, titulo);
        historial.push(nueva);
        System.out.println("Navegando en: " + titulo);
        
        return historial; 
    }

    
    public Stack<PaginaWeb> retroceder(Stack<PaginaWeb> historial) {
        if (historial.size() > 1) {
            PaginaWeb eliminada = historial.pop(); 
            System.out.println("Cerrando: " + eliminada.getTitulo());
            System.out.println("Ahora estás en: " + historial.peek().getTitulo());
        } else if (historial.size() == 1) {
            System.out.println("Estás en la página de inicio. No hay más historial atrás.");
        } else {
            System.out.println("El historial está vacío.");
        }
        
        return historial; 
    }

    public void mostrarHistorial(Stack<PaginaWeb> historial) {
        if (historial.isEmpty()) {
            System.out.println("No hay historial de navegación.");
            return; 
        }
        System.out.println("\n HISTORIAL DE PAAGINAS");
        
        for (int i = historial.size() - 1; i >= 0; i--) {
            System.out.println(historial.get(i));
        }
      
    }
}