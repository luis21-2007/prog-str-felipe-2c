import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc,contador=0;
        double valor,resultado;
        int contCaF=0,contFaC=0,contKmMi=0,contMiKm=0;

        do {
            System.out.println("Menú de Conversiones");
            System.out.println("1 Convertir °C a °F");
            System.out.println("2 Convertir °F a °C");
            System.out.println("3 Convertir km a millas");
            System.out.println("4 Convertir millas a km");
            System.out.println("5 Salir");
            System.out.println("Eliga su opción :");
            opc = sc.nextInt();

            switch(opc){
                case 1:
                    System.out.println("Conversion de °C a °F");
                    System.out.println("Ingresa la temperatura en °C a convertir");
                    valor = sc.nextDouble();
                    resultado = (1.8*valor)+32;

                    System.out.println(valor+" °C "+" = "+resultado+" °F ");
                    contador++;
                    contCaF++;
                    break;

                case 2:
                    System.out.println("Conversion de °F a °C");
                    System.out.println("Ingresa la temperatura en °F a convertir");
                    valor = sc.nextDouble();
                    resultado = (valor-32)/1.8;

                    System.out.println(valor+" °F "+" = "+resultado+" °C ");
                    contador++;
                    contFaC++;
                    break;

                case 3:
                    System.out.println("Conversion de km a millas");
                    System.out.println("Ingresa la distancia en km a convertir");
                    valor = sc.nextDouble();
                    resultado = valor/1.60934;

                    System.out.println(valor+" km "+" = "+resultado+" millas ");
                    contador++;
                    contKmMi++;
                    break;


                case 4:
                    System.out.println("Conversiones de  millas a km");
                    System.out.println("Ingresa la distancia en millas a convertir");
                    valor = sc.nextDouble();
                    resultado = valor*1.60934;

                    System.out.println(valor+" millas "+" = "+resultado+" km ");
                    contador++;
                    contMiKm++;
                    break;

                case 5:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("Opción inválida");
                    System.out.println("Intente de nuevo con una opción válida");

            }
        }
        while (opc!=5);

        System.out.println("Historial De Operaciones");
        System.out.println("Conversiones °C a °F :" + contCaF);
        System.out.println("Conversiones °F a °C :" + contFaC);
        System.out.println("Conversiones km a millas :" + contKmMi);
        System.out.println("Conversiones millas a km :" +  contMiKm);
        System.out.println("Total De Operaciones :" + contador);

    }
}