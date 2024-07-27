class Animal{
    String name;
    void display()
        {
            System.out.println("I am an animal");
        }
     }
class dog extends Animal{
     void displayName()
     {
      System.out.println("My name is "+ name);

     }
}

public class Inheritance {
    public static void main(String[] args){
        dog obj1=new dog();
        obj1.name="Puppy";
        obj1.display();
        obj1.displayName();
        
        
    }
    
}
