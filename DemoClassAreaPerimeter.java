 class Rectangle {
    double height;
    double width;
     Rectangle() 
    {
height=1.0;;
width=1.0;

    }
    Rectangle(double width,double height)
    {
        this.height=height;
        this.width=width;
    }
double getArea()
{
return height*width;
}
double getParimeter()
{
    return 2*(height+width);
}
}
public class DemoClassAreaPerimeter
{
    public static void main(String[] args)
    {
     Rectangle r1= new Rectangle(4,40);
     Rectangle r2= new Rectangle(3.5, 35.2);
     System.out.println("Height:"+r1.height+"width:"+r1.width+"Area:"+r1.getArea()+"Parimeter:"+r1.getParimeter());
    }
}