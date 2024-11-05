public class SumaIgual {
    public static String sumaIgual(int[] numeros, int objetivo) {
        String resultado = "";

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] + numeros[j] == objetivo) {
                    resultado += "[" + numeros[i] + " + " + numeros[j] + "] ";
                }
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5 ,0,-2,7};
        int objetivo = 5;

        String resultado = sumaIgual(numeros, objetivo);
        System.out.println("Pares con suma igual a " + objetivo + ": " +  resultado);
    }
}
