class customer{
    private String name;
    private int unitConsumed;
     //constructor
    public customer(){
        name="John Doe";
        unitConsumed = 20;
       
    }
    public customer(int unitConsumed, String name){
        this.name =name;
        this.unitConsumed= unitConsumed;

    }
    public int  getunitConsumed(){
        return unitConsumed;
    }
    public void setunitConsumed(int unitConsumed){
        this.unitConsumed = unitConsumed;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public int amountpaid(){
        int getpaid;
        if(unitConsumed >= 100){
            getpaid = 25;
        }else{
            getpaid = (int) (unitConsumed * 0.25); 
        }
        return getpaid;
    }
}

public class customerClass1 {
    public static void main(String[] args){
      customer obj  = new customer();
      System.out.println(" name: " + obj.getname() + " :unitconsumed " + obj.getunitConsumed() + " :amountpaid " + obj.amountpaid()); //default value..
      obj.setname("anteneh alem");
      obj.setunitConsumed(400);
      System.out.println(" name: " + obj.getname() + " :unitconsumed " + obj.getunitConsumed() + " :amountpaid " + obj.amountpaid()); 
    }
}
