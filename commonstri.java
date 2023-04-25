public class commonstri {
    public static void main(String[] args) {
        String [] a = {"beba", "Anteneh", "Alem", "miki"};
        String [] b = {"beba", "eyu", "alemss"};

        for(int i =0;i<a.length;i++){
            for(int j =0;j<b.length; j++){
                 if(a[i].equals(b[j])){
                    System.out.println(" common elements between two arrays ==> " + a[i]);
                 }
            }
        }
    }
}
