public class Ejercicio31 {
    public static void mostrarDivisores(int numero) {
        String
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int numero;

        numero = Utilidades.leerEntero("Introduce un número natural:");

        mostrarDivisores(numero);
    }

















}
