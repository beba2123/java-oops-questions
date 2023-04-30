import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeaderNmum {
    public static HashSet<Integer> LeaderNum(int a[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<a.length-1; i++){
            int j;
           for(j = i+1; j<a.length; j++){
                   if(a[i] <= a[j]){
                     break; 
                }
         }
        if(j==a.length)
          set.add(a[i]);
       }
       return set;
    }
     public static void main(String[] args){
        int a[] = {54,23,41,32,21};
          System.out.println(" the leader number inside an array " + LeaderNum(a));
        }
    // public static void main(String[] args){
    //     int a[] = {54,23,41,32,21};
    //     for(int i=0; i<a.length-1; i++){
    //          int j;
    //         for(j=i+1;j<a.length;j++){
    //             if(a[i] <= a[j]){
    //                break;
    //             }
    //            }
    //             if(j==a.length)
    //             System.out.println(" these value " + a[i] + " is the leader Number ");
    //         }
    //     }

    }

