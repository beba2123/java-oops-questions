import java.util.Arrays;

public class segregate1 {
    public static void main(String[] args) {
        int[] a={0,1,0,0,1,1,1,0,0};
        System.out.println(Arrays.toString(segeregat0_1(a)));
    }
    private static int[] segeregat0_1(int a[]){
        int count=0;
        for(int i=0; i<a.length;i++){
            if(a[i]==0){
                count++;
            }
        }
        for(int i=0; i<count;i++){
            a[i]=0;
        }
        for(int i= count; i<a.length;i++){
            a[i]= 1;
        }
        return a;
        }
 } 

