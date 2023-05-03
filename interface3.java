interface shape{
    double area();
    double perimeter();
}
class Rectangle implements shape{
   private double length;
   private double breath;
    //constructor
    public Rectangle(){
        length = 20;
        breath = 30;
    }
    public Rectangle(double length, double breath){
        this.breath= breath;
        this.length = length;
    }
    //method

    @Override
    public double area(){
        double recArea = breath* length;
        return recArea;
    }
    @Override
    public double perimeter(){
        double RecPerimeter = 2*(breath + length);
        return RecPerimeter;
    }

}
class Circle implements shape{
    private double radius;

    //constructor
    public Circle(){
        radius = 20;
    }
    public Circle(double radius){
        this.radius = radius;
    }

    //method 
    @Override
    public double area(){
        double CircArea= Math.PI * radius * radius;
        return CircArea;
    }
    @Override
    public double perimeter(){
        double CircPerimeter = 2 * Math.PI * radius;
        return CircPerimeter;
    }
    public double getradius(){
        return radius;
    }
    public void setradius(int radius){
       this.radius = radius;
    }

}



public class interface3 {
    public static void main(String[] args){
        	// Rectangle area and parameter
		double length = 12;
        double breath = 21;
        
		Rectangle r = new Rectangle(length, breath);

		System.out.println("Rectangle - Area: " + r.area());
		System.out.println("Rectangle - perimeter: " + r.perimeter());
        
		// Circle area and parameter
		
		Circle c = new Circle();
        c.setradius(25);
		System.out.println("Circle - Area: " + c.area());
		System.out.println("Circle - perimeter: " + c.perimeter());

    }
}
