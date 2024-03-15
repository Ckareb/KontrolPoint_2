import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class taskSeven {
    public static void main(String[] args){
        System.out.println("¬ведите строку: ");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String words = Arrays.stream(line.split(" ")).distinct().collect(Collectors.joining(" "));
        System.out.println("–езультат: "+ words);
    }
}
