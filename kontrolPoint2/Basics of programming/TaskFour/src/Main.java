public class Main {
    public static int str_count(String str, char word){
        str.trim();
        int count = 0;
        for(int i = 0; i < str.length(); ++i){
            if (str.charAt(i) == word){
                count +=1;
            }
        }
        System.out.println(count);
        return count;
    }
    public static void main (String[] args){
        str_count("Hello", 'o');
        str_count("Hello", 'l');
        str_count("", 'i');
    }
}
