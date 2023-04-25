import java.util.HashSet;

public class common {
    public static void main(String[] args) {
        int a[] = {1,2,5,5,8,9,7,10};
        int b[] = {1,0,6,15,6,4,7,0};
        HashSet<Integer> set = new HashSet<Integer>(); //for creating an array for the common elements.
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i]==b[j]){
                    set.add(a[i]);
                }
            }
        }
       System.out.println(" common elements between two arrays ==> " + set);
    }
    
}
