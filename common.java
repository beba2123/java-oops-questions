import java.util.HashSet;

public class common {
    // public static void main(String[] args) {
    //     int a[] = {1,2,5,5,8,9,7,10};
    //     int b[] = {1,0,6,15,6,4,7,0};
    //     HashSet<Integer> set = new HashSet<Integer>(); //for creating an array for the common elements.
    //     for(int i=0; i<a.length; i++){
    //         for(int j=0; j<b.length; j++){
    //             if(a[i]==b[j]){
    //                 set.add(a[i]);
    //             }
    //         }
    //     }
    //    System.out.println(" common elements between two arrays ==> " + set);
    // }
    private static HashSet<Integer> CommonElement(int a[],  int b[]){
      
        HashSet<Integer> set = new HashSet<>();
        int count;
          for(int i=0; i<a.length; i++){
              count=0;
          for(int j =0; j<b.length; j++){
              if(a[i]==b[j]){
               count++;
              }
           }
            if(count > 0)
            set.add(a[i]);
       }
       return set;
     }
    public static void main(String[] args){
         int a[] = {23,45,56,76,21,27};
         int b[] = {76,32,45,21,25,65};
      System.out.println(" common elements between two arrays are.. " +  CommonElement(a , b));
      }
   
   
    
}
