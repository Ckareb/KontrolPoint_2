import java.util.Scanner;

public class taskThree {
    public static void main(String[] args){
        System.out.println("������� ������: ");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] vowels ={"�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�"};
        for (int i = 0; i<vowels.length; ++i){
            line = line.replace(vowels[i],"" );
        }
        System.out.println("����� ��� �������: "+ line);
    }
}
