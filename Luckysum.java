public class Luckysum {
    public static void main(String[] args) {
        int[]a= {1,2,3,4,6,5};
        System.out.println(luckSum(a));
    }

    public static int luckSum(int[] a){
      int sum=0;
      for(int i =0; i<a.length-1; i++){
        
           if(a[i] < a[i+1]){
            sum+=a[i];
           }else{
            return 0;
           }
      }
      return sum;
    }
}

