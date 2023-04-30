public class LinearSearch {
    
 public static int linearsearch(int a[], int value){
    for(int i=0; i<a.length;i++){
      if(a[i]==value){
        return i;
     }
    }
  return -1;
 }
public static void main(String[] args){
  int a[]={1,2,3,4,6,5,8,9};
 System.out.println(linearsearch(a, 9));
}
}
