public class Answer {
    static int MyAnswer(int a[]){
        if(a.length < 2)
          return 0;
             int sum=0;
          for(int i=1;i<a.length;i++){
              sum=0;
            for(int j= i-1;j>0;j--){
              sum+=a[j];
          }if(sum > a[i])
              return 0;
          }
         return 1;
       }
       public static void main(String[] args){
         int a[] = {2,3,6,12};
         System.out.println(MyAnswer(a));
        }
}
