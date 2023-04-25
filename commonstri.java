import java.util.HashSet;

public class commonstri {
    public static void main(String[] args) {
        String [] a = {"beba", "Anteneh", "Alem", "miki"};
        String [] b = {"beba", "eyu", "alemss", "miki"};
        HashSet<String> set = new HashSet<String>();
        for(int i =0;i<a.length;i++){
            for(int j =0;j<b.length; j++){
                 if(a[i].equals(b[j])){
                    set.add(a[i]);
                 }
            }
        }
        System.out.println(" common elements between two arrays ==> " + set);
    }
}
