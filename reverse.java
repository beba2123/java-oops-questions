import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6,7};
        System.out.println(" the original array is " + Arrays.toString(reverseArray(a)));
      //we are using this for calling the reverse array...
    }
    static int[] reverseArray(int a[]){
        int rev;
        for(int i=0; i<a.length/2;i++){
            rev =a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1]=rev;
        }

       return a;
       
    }
}
