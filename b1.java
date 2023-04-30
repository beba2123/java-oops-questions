public class b1 {
    public static int BinearySearch(int a[], int value){
        int start=0;
        int last= a.length-1;
   while(start<=last){
      int middle = (start + last)/2;
      int middleElement= a[middle];
    if(middleElement==value)
      return middle;
    if(middleElement > value){
         last = middle-1;
    }else if(middleElement < value){
         start = middle + 1;
          }else{
        middle=value;
        }
  }  
   return -1;
}
public static void main(String[] args){
int a[] = {1,2,3,4,5,6,7};
   System.out.println(BinearySearch(a, 6));
}
}
