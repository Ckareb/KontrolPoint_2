import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите элементы массива:");
        float result1 = 0, result2 = 0;
        int[] array = new int[6];
        for (int i = 0; i < 6; ++i) {
            array[i] = scanner.nextInt();
            if (i%2 == 0){
                result1 += array[i];
            } else result2 += array[i];
        }
        System.out.println(result1/3 +"\n" + result2/3);
    }
}
