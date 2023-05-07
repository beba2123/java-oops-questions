public class last {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = {5,6,7};
        int sum= 0;
        for(int i=b.length; i< a.length; i++){
            sum+=a[i]; 
            b[i] = a[i];
             
        }
      
       System.out.println(sum);
    }
}
