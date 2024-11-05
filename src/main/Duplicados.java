public class Duplicados {

    public static String duplicados(int[] array) {
        String resultado = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    resultado += array[i] + " ";
                    break;
                }
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, -6, 4, 2, -6,3,3,0};

        String resultado = duplicados(array);
        System.out.println("Valores duplicados: " + resultado);
    }
}
