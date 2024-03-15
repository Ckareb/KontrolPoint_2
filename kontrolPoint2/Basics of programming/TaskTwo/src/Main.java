import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int stringMatrix = scanner.nextInt();
        System.out.println("Введите элементы массива:");
        int[] array = new int[stringMatrix];
        int count = 0;
        for (int i = 0; i < stringMatrix; ++i) {
            array[i] = scanner.nextInt();
            if (array[i] == 1){
                count += 1;
            }
        }
        System.out.println("Количество зашедших сотрудников " + count);
        scanner.close();
    }

}
