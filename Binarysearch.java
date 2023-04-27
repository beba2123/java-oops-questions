public class Binarysearch {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,9,11,23,445};
        System.out.println("the value we want is located..==> " + Binarysearch1(a, 11));
    }
    private static int Binarysearch1(int a[], int value){
          int begin=0;
          int last=a.length-1;
          int middle = (begin + last)/2;
          while(begin<=last){
            int middleNumber = a[middle];
           if(value==middleNumber){
           return middle;
           } 
           if(value>middleNumber){
            begin = middle+1;
           }
           else{
            last= middle-1;
           }
          }
          return -1;
    }
}
