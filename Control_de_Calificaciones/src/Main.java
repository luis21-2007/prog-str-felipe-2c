import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        GradeService service = new GradeService();
        Validator Validator=new Validator();
        String nombre = Validator.leerTextoNoVacio(sc, "Nombre del alumno: ");
        double p1 = Validator.leerDoubleEnRango(sc, "Parcial 1 : ");
        double p2 = Validator.leerDoubleEnRango(sc, "Parcial 2 : ");
        double p3 = Validator.leerDoubleEnRango(sc, "Parcial 3 : ");
        int asistencia = Validator.leerIntEnRango(sc, "Asistencia : " );
        boolean proyecto = Validator.leerBoolean(sc, "¿Entregó proyecto? (true/false): ");
        double promedio = service.calcularPromedio(p1, p2, p3);
        double Promediofinal = service.calcularFinal(promedio, asistencia);
        String estado = service.determinarEstado(Promediofinal, asistencia, proyecto);

        Validator.imprimirReporte(nombre, p1, p2, p3, promedio, asistencia, proyecto, Promediofinal, estado);
    }





}