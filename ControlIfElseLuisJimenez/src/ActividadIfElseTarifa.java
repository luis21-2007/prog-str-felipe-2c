
import java.util.Scanner;
public class ActividadIfElseTarifa {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = leer.nextInt();
        boolean estudiante;
        int tarifa;
        if (edad < 1 || edad > 120) {
            System.out.println("Es una edad no valida");
        } else if (edad >0 && edad < 12 ) {
            System.out.println("Su tarifa es de 50 ");
            tarifa=50;
            System.out.println("Esta es tu edad: "+edad+"\n No eres estudiante " +" \n Esta es tu tarifa "+ tarifa);
        } else if (edad >= 12 && edad < 17) {
            System.out.println("Eres estudiante? \n si o no ");
            estudiante = leer.nextBoolean();
            if (estudiante == true) {

           System.out.println("Tu tarifa es de 60 ");
           tarifa=60;
                System.out.println("Esta es tu edad: "+edad+" \n Si eres estudiante" + " \n Esta es tu tarifa "+ tarifa);
            } else {
                System.out.println("Tu tarifa es de 80");
                tarifa=80;
                System.out.println("Esta es tu edad: "+edad+" \n No eres estudiante "+" \n Esta es tu tarifa "+ tarifa);
            }
        } else if (edad >= 18 && edad < 120) {
            System.out.println("Eres estudiante? \n si o no ");
            estudiante = leer.nextBoolean();
            if (estudiante == true) {

                System.out.println("Tu tarifa es de 90 ");
                tarifa=90;
                System.out.println("Esta es tu edad: "+edad+" \n Si eres estudiante ?" + estudiante +"\n Esta es tu tarifa "+ tarifa);
            } else {
                System.out.println("Tu tarifa es de 120");
                tarifa=120;
                System.out.println("Esta es tu edad: "+edad+"\n No eres estudiante ?" + estudiante +"\n Esta es tu tarifa "+ tarifa);
            }
        }

    }
}
