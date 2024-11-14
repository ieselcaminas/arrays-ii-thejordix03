//2 EsTriangulo.java Si te dan tres palitos, puedes o no ser capaz de organizarlos en un triángulo. Por ejemplo, si uno de los palos mide 12 cm de largo y los otros dos tienen un cm de largo, no podrás hacer que los palitos cortos se encuentren en el medio. Para tres longitudes, hay una prueba simple para ver si es posible formar un triángulo:
//Si cualquiera de las tres longitudes es mayor que la suma de las otras dos, no puedes formar un triángulo Escribe un método llamado esTriangulo que toma tres enteros como argumentos y devuelve true o false, dependiendo de si puede o no formar un triángulo a partir de palitos con las longitudes dadas.

public class EsTriangulo {

    public static boolean esTriangulo(int palo1, int palo2, int palo3) {

        boolean triangulo;
        if (palo3 > palo1 + palo2) {
            triangulo = false;
        } else if (palo2 > palo1 + palo2) {
            triangulo = false;

        } else if (palo1 > palo2 + palo3) {
            triangulo = false;
        } else {
            triangulo = true;
        }
        return triangulo;
    }


    public static void main(String[] args) {
        int palo1 = Utilidades.leerEntero("Introduce la longitud del primer palito:");
        int palo2 = Utilidades.leerEntero("Introduce la longitud del segundo palito:");
        int palo3 = Utilidades.leerEntero("Introduce la longitud del tercer palito:");


        if (esTriangulo(palo1, palo2, palo3)) {

            System.out.println("El triangulo es correctamente");
        } else {
            System.out.println("El triangulo no es correctamente");
        }
    }
}

