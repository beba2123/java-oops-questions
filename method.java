public class method {
    public static void main(String[] args) {
        int[] a = {4,2,6,2,7,1,9};
        int[] b = {4,6,7,2,9};
        System.out.println(myMethod(a, b));
    }

    public static int myMethod(int[] a, int[] b){
        int min = Integer.MAX_VALUE;
        int index =0;
         for(int i=0; i<a.length; i++){
                if(min  > a[i]){
                    min=a[i];
                    index = i;
                }
            }
                for(int j=0;j<b.length; j++){
                    if(b[j]<=min){
                        return -1;    
                    }
                }
            // if(flag)
            // return -1;
            
        return index;
         
    }
}
