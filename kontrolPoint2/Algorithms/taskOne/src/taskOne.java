public class taskOne {
    private static boolean �hangeString(String str, String piece){
        boolean result = str.regionMatches(1, piece, 0, piece.length());
        return result;
    }
    public static void main(String[] args){
        boolean result = taskOne.�hangeString("abc", "bc");
        System.out.println(result);
    }

}

