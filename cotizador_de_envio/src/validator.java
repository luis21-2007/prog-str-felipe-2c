import java.util.Scanner;
import java.util.Locale;
public class validator {
    Scanner sc = new Scanner(System.in);
    public  double leerDoubleEnRango(Scanner sc, String msg) {
        sc.useLocale(Locale.US);
        double valor;
        while (true) {
            System.out.println(msg);
            if (sc.hasNextDouble()) {
                valor = sc.nextDouble();
                if (valor > 0) {
                    return valor;
                }
                System.out.println("El numero no es positivo");
            } else {
                System.out.println("El valor no es numerico");
                sc.next();
            }
        }
    }

    public  int leerIntEnDistancia(Scanner sc, String msg) {
        int valor;
        while (true) {
            System.out.println(msg);
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                if (valor > 0) {
                    return valor;
                }
                System.out.println("El numero no es positivo");
            } else {
                System.out.println("El valor no es numerico");
                sc.next();
            }
        }
    }
    public  int leerIntEnServicio(Scanner sc, String msg,int min,int max) {
        int valor;
        while (true) {
            System.out.println(msg);
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                if (valor > 0) {
                    return valor;
                }
                System.out.println("El numero no es positivo");
            } else {
                System.out.println("El valor no es numerico");
                sc.next();
            }
        }
    }

    public  boolean leerBoolean(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            String input = sc.next().toLowerCase();
            if (input.equals("true")) return true;
            if (input.equals("false")) return false;
            System.out.println("Error: Solo se acepta 'true' o 'false'.");
        }
    }
    public  void imprimirTicket(double servicio, double peso, double distancia, boolean zonaRemota, double subtotal, double iva, double total) {
        System.out.println("--- TICKET DE ENVÍO ---");
        System.out.println("Servicio: " +servicio);
        System.out.println("Peso kg: "+ peso);
        System.out.println("Distancia: " + distancia+ " km");
        System.out.println("Zona Remota: " + zonaRemota);
        System.out.println("");
        System.out.println("Subtotal :$"+ subtotal);
        System.out.println("IVA 16% :$"+ iva);
        System.out.println("TOTAL FINAL: $"+ total);
        System.out.println("-----------------------");
    }

}
