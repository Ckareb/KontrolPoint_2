import java.util.Objects;
import java.util.Scanner;

public class taskEight {
    public static void main(String[] args){
        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int a = 0, b = 0;
        for (int i = 0; i<line.length(); ++i){
            if(Objects.equals(line.charAt(i), line.toUpperCase().charAt(i))) ++a;
            else ++b;
        }
        String result = a>b ? line.toUpperCase(): line.toLowerCase();
        System.out.println("Преобразованная стока: "+ result);
    }
}
