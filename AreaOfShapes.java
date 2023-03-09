
//abstract class
abstract class Shape
{
   private double height; 
   private double width; 

   // Set height and width
   public void setValues(double height, double width)
   {
      this.height = height;
      this.width = width;
   }

   //Get height
   public double getHeight() 
   {
       return height;
   }
     
   //Get width
   public double getWidth() 
   {
       return width;
   } 

   //getArea() is a Abstract method which must be overridden in a subclass
   public abstract double getArea();
}

//subclass
class Rectangle extends Shape
{
    public double getArea()
    {
        return getHeight() * getWidth();
    }
}

//subclass
class Triangle extends Shape
{ 
    public double getArea() 
    {
        return (getHeight() * getWidth()) / 2;
    }
} 

//main
public class AreaOfShapes
{
    public static void main(String[] args)
    {
//Use the Object Class to get Equality, Class Information, Hash value, and String value

        // assign subclass reference to subclass variable
        Shape shape;
        Rectangle rect = new Rectangle(); 
        shape = rect;

        shape.setValues(44, 15);
        double shape1 = shape.getArea();
        Triangle tri = new Triangle();
        

        shape = tri;
        shape.setValues(32,8);
        double shape2 = shape.getArea();

        //Cheack if area of rectangle is equal to area of triangle!
        System.out.print("\nCheck the equality of two shapes: ");
        if (rect.equals(tri)){
            System.out.println("Equal");
        } 
        else {
            System.out.println("Not Equal");
        }

        System.out.print("________________________________________________________");
        //Display the information of Rectangle class 
        System.out.print("\nGet Class Information ");
        System.out.println("\t: "+rect.getClass());
        System.out.print("Get Hash Code ");
        System.out.println("\t\t: "+rect.hashCode());
        System.out.print("String Code ");
        System.out.println("\t\t: "+rect.toString());
        System.out.print("Area of triangle ");
        System.out.println("\t: "+shape1);
        System.out.print("________________________________________________________");

        //Display the information of Triangle class 
        System.out.print("\nGet Class Information ");
        System.out.println("\t: "+tri.getClass());
        System.out.print("Get Hash Code ");
        System.out.println("\t\t: "+tri.hashCode());
        System.out.print("String Code ");
        System.out.println("\t\t: "+tri.toString());
        System.out.print("Area of triangle ");
        System.out.println("\t: "+shape2);

    }
}