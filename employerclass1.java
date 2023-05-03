class Employee{
  private String name;
  private int id;
  private int fee;
     //constructor
    public Employee(){
      name="Anteneh Alem" ;
      id = 234;
      fee = 30;

    }
    public Employee(int id, String name, int fee){
        this.name = name;
        this.id = id;
        this.fee = fee;
    }
    //methods for the instance variable..
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name =name;
    }
    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id= id;
    }
    public int getfee(){
        return fee;
    }
    public void setfee(int fee){
        this.fee= fee;
    }
    public int calculateFee(){
        int totalfee;
        totalfee = fee*30;
        return totalfee;
    }
}


public class employerclass1 {
    public static void main(String[] args) {
        Employee obj = new Employee();
        System.out.println(" name ==> " + obj.getname() + " id ==>" + obj.getid() + " fee ==> " + obj.getfee() + " calculated fee ==>" + obj.calculateFee()); //this one is for the default value
        obj.setname("abreham");
        obj.setid(235);
        obj.setfee(40);
        System.out.println(" name ==> " + obj.getname() + " id ==>" + obj.getid() + " fee ==> " + obj.getfee() + " calculated fee ==>" + obj.calculateFee());//this one is for the parametrized one..
        
    }    
}
