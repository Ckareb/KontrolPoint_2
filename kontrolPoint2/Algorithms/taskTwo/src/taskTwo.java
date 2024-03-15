import java.util.Scanner;

public class taskTwo {
    public static void main(String[] args){
        System.out.println("Введите имя: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        name = name.trim();
        System.out.println("Привет "+name.toUpperCase().charAt(0) + name.toLowerCase().substring(1));
    }
}
