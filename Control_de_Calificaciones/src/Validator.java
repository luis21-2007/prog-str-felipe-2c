import java.util.Scanner;

public class Validator {
    Scanner sc = new Scanner(System.in);

    public static String leerTextoNoVacio(Scanner sc, String msg) {
        System.out.print(msg);
        String texto = sc.nextLine().trim();
        while (texto.isEmpty()) {
            System.out.println("Pon porfavor el nombre");
            System.out.print(msg);
            texto = sc.nextLine().trim();
        }
        return texto;
    }

    public static double leerDoubleEnRango(Scanner sc, String msg) {
        while(true) {
            System.out.println(msg);
            if (sc.hasNextInt()) {
                int valor = sc.nextInt();
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

    public static int leerIntEnRango(Scanner sc, String msg) {
        while(true) {
            System.out.println(msg);
            if (sc.hasNextInt()) {
                int valor = sc.nextInt();
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

    public static boolean leerBoolean(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            String input = sc.next().toLowerCase();
            if (input.equals("true")) return true;
            if (input.equals("false")) return false;
            System.out.println("Error: Ingrese 'true' o 'false'.");
        }
    }

    public void imprimirReporte(String nombre, double parcial1, double parcial2, double parcial3,double promedio, int asistencia, boolean proyecto, double calificacionfinal, String estado) {
        System.out.println("--------CALIFICACIONES--------");
        System.out.println("Alumno :" + nombre);
        System.out.println("Parciales :"+"\n"+parcial1+"\n"+ parcial2 +"\n"+ parcial3);
        System.out.println("Promedio Parciales :"+ promedio);
        System.out.println("Asistencia :" + asistencia + "%");
        System.out.println("Entregó Proyecto :" +proyecto);
        System.out.println("Calificación Final :"+calificacionfinal);
        System.out.println("ESTADO :" + estado);
    }
}




