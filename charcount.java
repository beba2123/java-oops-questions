public class charcount {
    public static void main(String[] args) {
        String str = "Anteneh Alem";
        char ch = 'A';
        System.out.println("the characters in the string is.." + StringsChar(str, ch));
    }

    public static int StringsChar(String str, char c){
        int count =0;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == c){
                count++;
            }

        }
        return count;
    }
}
