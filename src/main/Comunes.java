public class Comunes {
    public static void main(String[] args) {

        int[] num1 = {4,5,7,9,4,2};
        int[] num2 = {4,6,2};
        String resultado = "";

        for (int i = 0; i < num1.length; i++) {
            for (int n = 0; n < num2.length; n++) {
                if (num1[i] == num2[n]) {
                    resultado += num1[i] + " ";
                    break;
                }
            }
        }
        System.out.println(resultado);
    }
}
