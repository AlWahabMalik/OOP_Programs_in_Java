abstract class Shape{
    String type;
    Shape(String type){
        this.type=type;
    }
    abstract double calculateArea();
    abstract double calculatePerimeter();

}

class Rectangle extends Shape{
    double width,height;
    Rectangle(String type,double width,double height){
     super(type);
     this.width=width;
     this.height=height;
    }
    double calculateArea(){
     return width*height;
    }
    double calculatePerimeter(){
     return 2*(width+height);
    }

 }

 class Circle extends Shape{
    double radius;
    Circle(String type,double radius){
     super(type);
     this.radius=radius;
    }
    double calculateArea(){
     return 3.14*radius*radius;
    }
    double calculatePerimeter(){
     return 2*3.14*radius;
    }
 }
public class Abstraction1 {
    public static void main(String[] args) {
     Rectangle r1=new Rectangle("Rectangle", 12.1, 133.3);
     Circle c1=new Circle("Circle", 122.1);   
     System.out.println(r1.calculateArea() +" "+r1.calculatePerimeter());
     System.out.println(c1.calculateArea()+" "+c1.calculatePerimeter());
    }
}
