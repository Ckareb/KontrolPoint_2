import java.util.Arrays;
import java.util.Scanner;

public class taskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        System.out.println("������� �������� �������:");
        for (int i = 0; i < 3; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("������: " + Arrays.toString(array));

        Scanner scn = new Scanner(System.in);
        System.out.println("������� ���������� �������� �����: ");
        int len = scn.nextInt();
        System.out.println("������ �����: ");
        for (int i = 0; i < len; ++i) {
            if(array[0]<=array[1] && array[0]<=array[2]) array[0] = scn.nextInt();
            else if(array[1]<=array[2] && array[1]<=array[0]) array[1] = scn.nextInt();
            else if(array[2]<=array[1] && array[2]<=array[0]) array[2] = scn.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
