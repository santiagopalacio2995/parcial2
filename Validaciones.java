import java.util.Scanner;

public class Validaciones {
    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor digite un numero");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public Double ValidarDecimal(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Por favor digite un numero");
            sc.nextLine();
        }
        return sc.nextDouble();
    }

    public int ValidarRango(int n1, int n2, int numero, Scanner sc) {
        Validaciones m = new Validaciones();
        while (numero < n1 || numero > n2) {
            System.out.println("Por favor ingrese un rango de :" + n1 + " hasta " + n2);
            numero = m.ValidarEntero(sc);
        }
        return numero;
    }

    public int Pedirdato(int opt,Scanner sc) {
        Validaciones m = new Validaciones();
        switch (opt) {
            case 1:
                System.out.println("Ingrese El numero a Modificar");
                opt = m.ValidarEntero(sc);
                break;
            case 2:
                System.out.println("Ingrese El nuevo numero Modificado");
                opt = m.ValidarEntero(sc);
                break;

            default:
                System.out.println("Ingrese el numero a eliminar");
                opt = m.ValidarEntero(sc);
                break;
        }
        return opt;

    }
}
