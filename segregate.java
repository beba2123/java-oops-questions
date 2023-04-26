import java.util.Arrays;

public class segregate {
    public static void main(String[] args) {
        int a[] ={1,0,0,1,0,1,1};
        System.out.println(" the segeration between 0 and 1 is ==> " + Arrays.toString(separate_0_1(a)));
    }
    public static int[] separate_0_1(int a[]){
        int left =0;
        int right =a.length-1;
        for(int i=0; i<a.length;i++){
            while(a[left]==0 && left<right ){
                left++;
            }
            while(a[right]==1 && left<right){
                right--;
            }
            if(left<right){
                int temp = a[left];
                a[left]=a[right];
                a[right]= temp;
            }
        
        }
        return a;
    }
}
