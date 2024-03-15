import java.util.Scanner;

public class taskThree {
    public static void main(String[] args){
        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] vowels ={"у","е","ы","а","о","э","я","и","ю","У","Е","Ы","А","О","Э","Я","И","Ю"};
        for (int i = 0; i<vowels.length; ++i){
            line = line.replace(vowels[i],"" );
        }
        System.out.println("Стока без гласных: "+ line);
    }
}
