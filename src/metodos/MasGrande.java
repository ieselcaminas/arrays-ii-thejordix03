public class MasGrande {
    public static int masGrande(int a, int b) {
        if (a > b) {
            return a;

        }else{
            return b;
        }
    }
    public static void main(String[] args) {

        int numero = Utilidades.leerEntero("Introduce un  numero: ");
        int numero2 = Utilidades.leerEntero("DIntroduce un numero: ");

        int elMasGrande = masGrande(numero,numero2);
        System.out.println("El mas grande es "+ elMasGrande);

    }
}
