 import java.util.HashSet;

// public class duplicat {
//     public static void main(String[] args) {
//         int[] a = {1,2,3,3,5,6,1,6,4};
//         HashSet<Integer> set = new HashSet<Integer>();
//         for(int i=0; i<a.length; i++){
//             for(int j=0; j<a.length; j++){
//                 if((a[i]==a[j]) && i!=j){
//                     set.add(a[i]);
//                 }
//             }
//         }
//         System.out.println(" dublicate elements are ==> " + set);
//     }
// }
public class duplicat{

    static HashSet<Integer> duplicate(int[] a){
          int count=0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<a.length;i++){
             count=0;
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j] && i!=j){
                    count++;
                  }
            }
         if(count > 0)
          set.add(a[i]);
        }
      return set;
     }
    public static void main(String[] args){
         int a[]= {1,2,3,45,32,45,43,46,43};
        System.out.println(" duplicate elements are..==> " + duplicate(a));
     }
 
 
 }