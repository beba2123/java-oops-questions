import java.util.Arrays;

public class separate {
    public static void main(String[] args) {
        int arr[] = {8,2,3,4,5,6,10};
        System.out.println(Arrays.toString(separate_odd_even(arr)));
    }
    static int [] separate_odd_even(int arr[]){
        int left=0;
        int right=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
       
         while(arr[left]%2==0 &&  left<right)
         {
          left++;
         }
         while(arr[right]%2!=0 && left<right)
         {
          right--;
         }
       
         if(left<right)
         {
          int temp=arr[left];
          arr[left]=arr[right];
          arr[right]=temp;
          
         }
        }
        return arr;
    }
}
