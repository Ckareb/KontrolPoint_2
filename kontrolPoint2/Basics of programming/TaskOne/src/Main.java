import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ������ ����� �������: ");
        int stringMatrix = scanner.nextInt();
        System.out.print("������� �������� ����� �������: ");
        int collumMatrix = scanner.nextInt();
        int[][] array = new int[stringMatrix][collumMatrix];
        int[][] matrix = new int[collumMatrix][stringMatrix];
        System.out.println("������� �������� �������:");
        for (int i = 0; i < stringMatrix; ++i) {
            for (int j = 0; j < collumMatrix; ++j) {
                array[i][j] = scanner.nextInt();
                matrix[j][i] = array[i][j];
            }
        }
        scanner.close();
        System.out.println("������: " + Arrays.deepToString(matrix));
    }
}
