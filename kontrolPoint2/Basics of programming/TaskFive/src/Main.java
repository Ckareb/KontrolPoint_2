import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ������ �������: ");
        int stringMatrix = scanner.nextInt();
        System.out.println("������� �������� �������:");
        int[] array = new int[stringMatrix];
        int count = 0;
        for (int i = 0; i < stringMatrix; ++i) {
            array[i] = scanner.nextInt();
            count += array[i] * array[i];
        }
        System.out.println(count);
    }
}
