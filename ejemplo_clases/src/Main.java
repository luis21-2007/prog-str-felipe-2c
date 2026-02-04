import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ticekt ticekt= new ticekt();//declaracion de un object
        InputValidator inputValidator=new InputValidator();
        Scanner sc= new Scanner(System.in);

        int cantidad = inputValidator.getValidInt("ingresa la cantidad de articulos",sc);

        ticekt.process(cantidad);


        ticekt.imprimirTicket(cantidad);
    }
}
