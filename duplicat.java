import java.util.HashSet;

public class duplicat {
    public static void main(String[] args) {
        int[] a = {1,2,3,3,5,6,1,6,4};
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if((a[i]==a[j]) && i!=j){
                    set.add(a[i]);
                }
            }
        }
        System.out.println(" dublicate elements are ==> " + set);
    }
}
