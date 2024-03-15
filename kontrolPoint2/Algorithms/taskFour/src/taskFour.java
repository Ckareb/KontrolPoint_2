import java.util.Scanner;
import java.util.Arrays;

public class taskFour {
    private static int[] numberChange(int max, int min){
        int array[] = new int[max];
        int number = min;
        for (int i = 0; i<max; ++i){
            array[i] = number*number;
            number += min;
        }
        return array;
    }
    public static void main(String[] args){
        System.out.println("¬ведите число: ");
        Scanner in = new Scanner(System.in);
        int numberOne = in.nextInt();
        System.out.println("¬ведите число: ");
        Scanner scn = new Scanner(System.in);
        int numberTwo = scn.nextInt();
        int max, min;
        if (numberTwo>numberOne){
            max = numberTwo;
            min = numberOne;
        } else{
            max = numberOne;
            min = numberTwo;
        }
        int[] result = numberChange(max, min);
        System.out.println(Arrays.toString(result));
    }
}
