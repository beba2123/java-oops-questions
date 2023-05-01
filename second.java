public class second {
    public static int SecondMin(int a[]){

        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
         for(int i=0;i<a.length; i++){
             if(a[i]<min){
           second_min = min;
               min = a[i];
         }
            else if(a[i]>min && a[i]<second_min){
            second_min = a[i];
         }
       }
      return second_min;
 
     }
     public static void main(String[] args){
        
        int[] a= {23,45,21,26,76,33,22};
         System.out.println(" The second minimum value is " + SecondMin(a));
     }
 
 
 
}
