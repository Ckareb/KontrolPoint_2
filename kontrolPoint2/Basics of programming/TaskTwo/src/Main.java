import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ������ �������: ");
        int stringMatrix = scanner.nextInt();
        System.out.println("������� �������� �������:");
        int[] array = new int[stringMatrix];
        int count = 0;
        for (int i = 0; i < stringMatrix; ++i) {
            array[i] = scanner.nextInt();
            if (array[i] == 1){
                count += 1;
            }
        }
        System.out.println("���������� �������� ����������� " + count);
        scanner.close();
    }

}
