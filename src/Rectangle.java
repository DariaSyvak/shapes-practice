/**
 * FIRST, COMPLETE Shape interface
 * THEN, COMPLETE Rectangle, Square, and Circle classes
 * LASTLY, COMPLETE TestShapes class
 */

//implement Shape interface and provide abstract method implementation
public class Rectangle implements Shape {


    /*
    Define instance variables of rectangle as below
    Instance variables must be encapsulated
    */
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /*
        Override area and perimeter methods here
        REMEMBER:
        Area of a rectangle can be found as => width * height
        Perimeter of a rectangle can be found as => 2 * (width + height)
        */
    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }


    //Override toString() method here


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height + '}' +
                "\nArea of the Rectangle is = " + area() +
                "\nPerimeter of the Rectangle is = " + perimeter()+"\n";

    }
}
