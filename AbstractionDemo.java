abstract class BaseClass
{
  //abstract method
  abstract public void show1();

  //concrete method
  public void show2()
  {
    System.out.println("Concrete method of parent class");
  }
}
//child class
class ChildClass extends BaseClass
{

  public void show1()
  {
    System.out.println("Overriding the abstract method of the parent class");
  }

  //Overriding concrete method is not compulsory
  public void show2()
  {
    System.out.println("Overriding concrete method of the parent class");
  }
}
public class AbstractionDemo
{
  public static void main(String[] args)
  {
    
    ChildClass obj = new ChildClass();
    obj.show1();
    obj.show2();
  }
}