import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите отрезок 1: ");
        int number1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите отрезок 2: ");
        int number2 = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Введите отрезок 3: ");
        int number3 = scanner3.nextInt();
        int smallest = 0;
        if (number1 + number2 > number3 && number2 + number3 > number1 && number3 + number1 > number2) {
            double angle = Math.toDegrees(Math.acos((Math.pow(number2, 2) + Math.pow(number3, 2) - Math.pow(number1, 2)) / (2.0 * number2 * number3)));
            double angle1 = Math.toDegrees(Math.acos((Math.pow(number1, 2) + Math.pow(number2, 2) - Math.pow(number3, 2)) / (2.0 * number1 * number2)));
            double angle2 = Math.toDegrees(Math.acos((Math.pow(number3, 2) + Math.pow(number1, 2) - Math.pow(number2, 2)) / (2.0 * number1 * number3)));
            if (angle < angle1 && angle <= angle2) {
                smallest = (int) (180 - angle);
            } else if (angle1 < angle2 && angle1 < angle) {
                smallest = (int) (180 - angle1);
            } else {
                smallest = (int) (180 - angle2);
            }
            System.out.println("Наибольший внешний угол: " + smallest + "°");
        } else System.out.println("Теугольник невозможно составить");
    }
}
