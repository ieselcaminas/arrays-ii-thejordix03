//1 EsDivisible.java Escribe un método llamado esDivisible que toma dos enteros, n y m, y devuelve verdadero si n es divisible por m, y falso en caso contrario.

public class EsDivisible {
    public static boolean esDivisible(int n, int m) {
        if (n % m == 0) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {

        int  n = Utilidades.leerEntero("Introduce un número entero:");
        int  m = Utilidades.leerEntero("Introduce un número entero:");

        if (esDivisible(n, m)) {
            System.out.println(n + " es divisible por " + m +" ES VERDADERO");
        } else {
            System.out.println(n + " no es divisible por " + m +" ES FALSO");
        }
    }
}
