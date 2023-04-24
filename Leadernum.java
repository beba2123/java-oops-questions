public class Leadernum {
    public static int Leadernumber(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] <= a[j]){
                    break;
                }
                }
                sum += a[i];
            }
            return sum; 
        }    
    
    
    public static void main(String[] args) {
        int[] a = {5,3,2,1};
        System.out.println(Leadernumber(a));
    }
}
