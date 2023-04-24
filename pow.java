public class pow {
     public static void main(String[] args) {
        System.out.println(powcalc(2, 4));
     }  
     
     public static int powcalc(int exponetial, int base){
        int pow =1;
        for(int i =0; i<exponetial; i++){
            pow *= base;
        }
        return pow;
     }
}
