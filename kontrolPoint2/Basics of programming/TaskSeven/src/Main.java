import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("¬ведите число: ");
        double sqrt = Math.sqrt(scanner.nextDouble());
        int closest = (int) Math.round(sqrt);
        System.out.println(closest);
    }
}
