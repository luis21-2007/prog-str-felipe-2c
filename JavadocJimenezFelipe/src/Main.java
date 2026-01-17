import java.util.Scanner;
import java.util.Locale;

public class Main {

    static Scanner leer = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        int opc;
        do {
            System.out.println("Menu de Ejercicios");
            System.out.println("1. Calcular IMC");
            System.out.println("2. Calcular area de un rectangulo");
            System.out.println("3. Convertir °C a °F");
            System.out.println("4. Calcular area de un circulo");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Dime tu peso en kg: ");
                    double peso = leer.nextDouble();
                    System.out.print("Dime tu estatura en mt: ");
                    double estatura= leer.nextDouble();
                    calcularIMC(peso, estatura);
                    break;
                case 2:
                    System.out.print("Dame la base en cm: ");
                    double base = leer.nextDouble();
                    System.out.print("Dame la altura en cm: ");
                    double altura = leer.nextDouble();
                    calcularAreaRectangulo(base, altura);
                    break;
                case 3:
                    System.out.print("Ingresa grados Celsius: ");
                    double c = leer.nextDouble();
                    convertirCelsiusAFahrenheit(c);
                    break;
                case 4:
                    System.out.print("Dame el radio: ");
                    double r = leer.nextDouble();
                    calcularAreaCirculo(r);
                    break;
                case 5:
                    System.out.println("ADIOS");
                    break;
                default:
                    System.out.println("Opcion no encontrada");
            }
            System.out.println();
        } while (opc != 5);
    }


    /** * Metodo para calcular el imc de una persona *
     * @param > peso - nos ayuda para calcular el imc *
     * @param > estatura - este parametro nos ayuda en la estatura *
     * */
    public static void calcularIMC(double peso, double estatura) {
        double imc = peso / (estatura * estatura);
        System.out.println("Tu IMC es: " + imc);
    }
    /** * Metodo para calcular el area de un rectangulo *
     * @param > base - la base nos ayuda a guardar el dato *
     * @param > altura - este parametro nos ayuda en saber donde guardamos el dato de la altura *
     * */
    public static void calcularAreaRectangulo(double base, double altura) {
        double area = base * altura;
        System.out.println("El area del rectangulo es: " + area);
    }
    /** * Metodo para convertir de celsius a fahrenheit*
     * @param > celsius - nos ayuda a calcular los grados *
     * */
    public static void convertirCelsiusAFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C equivalen a: " + fahrenheit + "°F");
    }
    /** * Metodo para calcular el area del circulo*
     * @param > radio - este es donde guardamos el dato de los celsuis *
     * */
    public static void calcularAreaCirculo(double radio) {
        double area = Math.PI *(radio*radio);
        System.out.println("El area del circulo es: " + area);

    }
}