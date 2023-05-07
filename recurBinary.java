public class recurBinary{
    public static void main(String[] args) {
      int a[] ={1,2,4,6,8,9,12,34,55};
      System.out.println( " the index of the element is " + BSC(a,0,9,55));  
    }
    private static int BSC(int a[], int start, int end, int value){
        
        if(start>end){     //the base condition for the method..
            return -1;
        }
        if(start<=end){
        int middle = (start+end)/2;
        int  middlenum = a[middle];
        if(value==middlenum){
            return middle;
        } 
        if(value> middlenum){
            return  BSC(a, middle+1, end, value);
        }
        else{
            return BSC(a, start, middle-1, value);
        }
        
    }
    return -1;
    }
}