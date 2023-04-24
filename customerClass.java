

class Customer{

    private String name;
    private int unitConsumed;

    //Property methods
    
  
    public String getName(){
        return name;
    }
    public int getUnitConsumed(){
        return unitConsumed;
    }
    public void setUnitConsumed(int unitConsumed){
        this.unitConsumed = unitConsumed;
    }
   
    //Constractor mathods

    public Customer(){ //this one is called defualt construnctor
      name = "anteneh alem";
      unitConsumed = 200;
    }
    public Customer(String name, int unitConsumed){
        this.name = name;
        this.unitConsumed = unitConsumed;
    }


    public double calculateFee(){
            double amountPaid;
        if(unitConsumed <100){
            amountPaid = unitConsumed*0.25;
        }else if(unitConsumed > 100){
            amountPaid = 25;
        }else{
            amountPaid = 0;
        }
        
        return amountPaid;
    }
    
}
public class customerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer c = new Customer();
       
    System.out.println(" The consumer name: " + c.getName() + "  ==>the amount of unit it consumed " +  c.getUnitConsumed() + "the calculation fee " + c.calculateFee());
       
    }

}