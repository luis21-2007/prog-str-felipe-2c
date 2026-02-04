public class ticekt {

    private final double DESCUENTO =0.10;
    private final double PRECIO = 10;
    public double subtotal;
    public double descuentoCalculado;
    public   double Total;

    public void process(int cantidad){
        calcularSubtotal(cantidad);
        calculaDescuento(this.subtotal);
        calcularTotal(this.Total);
    }

    private void calcularSubtotal(int cantidad){
        this.subtotal= cantidad*PRECIO;
    }
    private void calculaDescuento(double subtotal) {

        this.descuentoCalculado = this.subtotal*DESCUENTO;
    }

    private void calcularTotal(double subtotal){
        this.Total= this.subtotal - this.descuentoCalculado;

    }
    public void imprimirTicket(double cantidad){
    System.out.println("----Ticket----");
    System.out.println("La cantidad de articulos fue: "+cantidad);
    System.out.println("El subtotal fue: "+subtotal);
    System.out.println("El descuento calculado fue:"+ descuentoCalculado);
    System.out.println("El total del ticket es:  "+ Total);
    System.out.println("----Ticket----");
    }
}


