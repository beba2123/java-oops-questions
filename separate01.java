import java.util.Arrays;

public class separate01 {
    public static void main(String[] args) {
        int arr[] ={1,0,0,0,1,1,0};
        System.out.println(Arrays.toString(separate_0_1(arr, 7)));
    }
    static int[] separate_0_1(int arr[], int n){
        int count = 0;   
     
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1)
                count++;
        }
 
        for (int i = 0; i < count; i++)
            arr[i] = 1;
 
        for (int i = count; i < n; i++)
            arr[i] = 0;
    
         return arr;
    }
}
