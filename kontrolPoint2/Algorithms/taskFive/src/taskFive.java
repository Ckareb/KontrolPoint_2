import java.util.Arrays;
import java.util.Scanner;

public class taskFive {
    private static int[] numberChange(int begin, int step, int countStep){
        int array[] = new int[countStep];
        for (int i = 0; i<countStep; ++i){
            array[i] = begin;
            begin += step;
        }
        return array;
    }
    public static void main(String[] args){
        System.out.println("¬ведите начальное число: ");
        Scanner in = new Scanner(System.in);
        int begin = in.nextInt();
        System.out.println("¬ведите шаг: ");
        Scanner scn = new Scanner(System.in);
        int step = scn.nextInt();
        System.out.println("¬ведите количество шагов: ");
        Scanner sc = new Scanner(System.in);
        int countStep = sc.nextInt();

        int[] result = numberChange(begin, step, countStep);
        System.out.println(Arrays.toString(result));
    }
}
