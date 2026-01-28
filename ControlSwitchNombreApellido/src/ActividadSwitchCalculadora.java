import java.util.Scanner;
public class ActividadSwitchCalculadora {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        double resultado=0;
        double a;
        double b;
        System.out.println("Dime cual operacionn deseas elegir");
        System.out.println("1. sumar \n 2. Resta \n 3.Multiplicacion \n 4.Dividir");
        int opc= leer.nextInt();
        switch (opc) {

            case 1:
                System.out.println("SUMA");
                System.out.println("Dame tu primer numero");
                a= leer.nextDouble();
                System.out.println("Dame tu segundo numero");
                b= leer.nextDouble();
                resultado= suma(a,b);
                System.out.println("Este es tu resultado "+ resultado);
                break;

            case 2:
                System.out.println("RESTA");
                System.out.println("Dame tu primer numero");
                a= leer.nextDouble();
                System.out.println("Dame tu segundo numero");
                b= leer.nextDouble();
                resultado=resta(a,b);
                System.out.println("Este es tu resultado "+ resultado);
                break;
            case 3:
                System.out.println("MULTIPLICACION");
                System.out.println("Dame tu primer numero");
                a= leer.nextDouble();
                System.out.println("Dame tu segundo numero");
                b= leer.nextDouble();
                resultado=multiplicacion(a,b);
                System.out.println("Este es tu resultado "+ resultado);
                break;
            case 4:
                System.out.println("DIVISION");
                System.out.println("Dame tu primer numero");
                a= leer.nextDouble();
                System.out.println("Dame tu segundo numero");
                b= leer.nextDouble();

                if (b ==0) {
                System.out.println("opcion invalida");
                } else {
                    resultado=division(a,b);
                    System.out.println("Este es tu resultado "+ resultado);
                }
                break;
            default:
                System.out.println("Opcion invalida por favor ponga una opcion valida");
                break;
        }

     }
     public static double suma(double num1, double num2){
        return num1+num2;
     }
     public static double resta(double num1, double num2){
        return num1-num2;
     }
     public static double multiplicacion(double num1,double num2){
        return num1*num2;
     }
     public static double division(double num1, double num2){
        return num1/num2;
     }


}
