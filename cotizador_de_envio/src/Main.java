import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        ShippingCalculator calc = new ShippingCalculator();
        validator validator=new validator();

        // proceso para validar los datos
        double peso = validator.leerDoubleEnRango(sc,"Ingrese peso (0.1 - 50.0 kg): ");
        int distancia = validator.leerIntEnDistancia(sc, "Ingrese distancia (1 - 2000 km): ");
        int servicio = validator.leerIntEnServicio(sc, "Tipo de servicio (1-Estándar, 2-Express): ",1,2);
        boolean remota = validator.leerBoolean(sc, "¿Es zona remota? (true/false): ");

        // procesos desde shippingcalculator
        double subtotal = calc.calcularSubtotal(peso, distancia,servicio, remota);
        double iva = calc.calcularIVA(subtotal);
        double total = calc.calcularTotal(subtotal, iva);

        // output desde validator
        validator.imprimirTicket(servicio, peso, distancia, remota, subtotal, iva, total);
    }


}
