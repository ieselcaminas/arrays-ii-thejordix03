public class Comunes {

    public static String comunes(int[] array1, int[] array2) {
        String resultado = "";
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {

                    resultado += array1[i] + " ";
                    break;
                }
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5,-6};
        int[] array2 = {4, 5, 6, 7, 8,-6};

        String resultado =  comunes(array1,array2);
        System.out.println(resultado);
    }
}
