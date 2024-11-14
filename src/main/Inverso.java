import java.util.Arrays;

public class Inverso {

    public static int[] Alreves(int[] num) {
        int[] Alreves = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            Alreves[i] = num[num.length - 1 - i] = num[i];
        }
        return Alreves;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(Alreves(num)));
    }
}




