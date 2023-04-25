import java.util.HashSet;

public class duplicatstri {
    public static void main(String[] args) {
            String []a= {"beba", "beb", "anteneh" , "beba" };
            HashSet<String> set = new HashSet<String>();
            for(int i=0; i<a.length;i++){
                for(int j=0; j<a.length;j++){
                    if(a[i]==a[j] && i!=j){
                        set.add(a[i]);
                    }
                }
            }
            System.out.println( " duplicated elements are ==> " + set);
    }
}
