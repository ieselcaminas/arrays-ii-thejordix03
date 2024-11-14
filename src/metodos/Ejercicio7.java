public class Ejercicio7 {


    public static double calcularDescuento(double precioReal, double precioRebajado) {

        return ((precioReal - precioRebajado) / precioReal) * 100;
    }

    public static void main(String[] args) {

        double precioReal;
        double descuento;
        double precioRebajado;


        precioReal = Utilidades.leerDoble("Introduce un precio real:");

        precioRebajado = Utilidades.leerDoble("Introduce un precio rebajado:");

        descuento = calcularDescuento(precioReal, precioRebajado);

        System.out.println("El descuento realizado es de: " + descuento + "%");
    }
}
