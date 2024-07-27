abstract class Shape{
    String type;
    Shape(String t){
        type=t;
    }
    abstract double calculateArea();
    abstract double calculatePerimeter();

}

class Rectangle extends Shape{
    double width,height;
    Rectangle(String t,double Width,double height){
     super(t);
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
    Circle(String t,double r){
     super(t);
     radius=r;
    }
    double calculateArea(){
     return Math.PI*radius*radius;
    }
    double calculatePerimeter(){
     return 2*Math.PI*radius;
    }
 }
public class Abstraction {
    public static void main(String[] args) {
     Rectangle r1=new Rectangle("Rectangle", 12.1, 133.3);
     Circle c1=new Circle("Circle", 122.1);   
     System.out.println(r1.calculateArea()+r1.calculatePerimeter());
     System.out.println(c1.calculateArea()+c1.calculatePerimeter());
    }
}
