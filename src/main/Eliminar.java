import java.util.Scanner;
public class Eliminar {

    public static int[] eliminar(int[] array, int indice) {
        if (indice >= 0 && indice < array.length) {
            int temp = array[indice];
            for (int i = indice; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = temp;
        }
        return array;
    }
    public static int[] eliminarPrimero(int[] array) {
        return eliminar(array, 0);
    }
    public static int[] eliminarUltimo(int[] array) {
        return eliminar(array, array.length - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {0,1, 2, 3, 4, 5, 6};
        int indice = 3;

        array = eliminar(array, indice);

        System.out.print("Array después de mover el elemento al final: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
