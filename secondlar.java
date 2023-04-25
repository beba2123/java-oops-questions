import java.util.Arrays;

public class secondlar {
    public static void main(String[] args) {
        int[] a = {
                    10789, 2035, 1899, 1456, 2013, 
                    1458, 2458, 1254, 1472, 2365, 
                    1456, 2165, 1457, 2456};
        System.out.println("Original numeric array : "+Arrays.toString(a));            
        Arrays.sort(a);
            int index = 0;
           for(int i=0; i<a.length-1; i++){
               index= a[i];
           }
           // or the other way..
           int ind = a.length -1;
           while(ind == a.length){
              ind--;
               }
              System.out.println(" the second largest element ==> " + a[ind]);

            System.out.println("Second largest value: " + index);
        }
}
