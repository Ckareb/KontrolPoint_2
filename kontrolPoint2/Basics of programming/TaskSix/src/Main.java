import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("¬ведите число: ");
        int number = scanner.nextInt();

        if ((number % number == 0) && (number % 2 != 0) && (number % 3 != 0)) {
            System.out.println("True");
        }else System.out.println("False");
    }
}
