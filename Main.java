/*abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main{
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(5, 3);
        shapes[1] = new Circle(4);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}
*/
/*abstract class shape{
    abstract void numberOfSides();
}
class Trapezoid extends shape{
    void numberOfSides(){
        System.out.println("Number of sides in trapezoid are: "+4);
    }
}
class Traingle extends shape{
    void numberOfSides(){
        System.out.println("Number of sides in trapezoid are: "+3);
    }
}
class Hexagon extends shape{
    void numberOfSides(){
        System.out.println("Number of sides in trapezoid are: "+6);
    }
}
public class Main {
    public static void main(String[] args){
        shape a = new Trapezoid();
        shape b = new Traingle();
        shape c = new Hexagon();
        a.numberOfSides();
        b.numberOfSides();
        c.numberOfSides();
    }
}*/


//outer and inner nested class
/*
        using Static 
class Outer{
    static int a=10;
    static class inner{
        void dis(){
            System.out.println(a);
        }
    }
}
class Main {
public static void main(String[] args){
Outer.inner obj =new Outer.inner();
obj.dis(); 
    
}
}
*/
        // without using Static 
/*class Outer{
     int a=10;
     class inner{
        void dis(){
            System.out.println(a);
        }
    }
}
class Main {
public static void main(String[] args){
Outer obj=new Outer();
Outer.inner obj1=obj.new inner();
obj1.dis();    
}
}*/