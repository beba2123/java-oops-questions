import java.util.Arrays;

public class separate2 {
    public static void main(String[] args) {
        int[] a={1,2,4,5,6,23,55};
        System.out.println(Arrays.toString(separate_even_odd1(a)));

    }
     private static  int[] separate_even_odd1(int a[]){
        int left =0;
        int right=a.length-1;
        for(int i=0; i<a.length; i++){
            while(a[left]%2==0 && left<right){
                left++;
            }
            while(a[right]%2!=0 && left<right){
                right--;
            }
          if(left<right){
            int temp= a[left];
            a[left]=a[right];
            a[right]=temp;
          }
        }
        return a;
     }
}
