public class Luckysum {
    public static void main(String[] args) {
        int[]a= {1,2,3,4,5};

        System.out.println(luckSum(a));
    }

    public static int luckSum(int[] a){
      int sum=0; //inorder to find the sum of  the luckysum..
       for(int i=1; i<a.length;i++){  //for picking one number in the array
         int j;
        for(j=i-1; j>0;j--){   //for iterating the left side number right to it.
          if(a[i]<=a[j]){ // 
            break;
          }
        }
        if(j==0)
        sum+=a[i];
       }
       return sum;
 }

}