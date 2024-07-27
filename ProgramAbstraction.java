abstract class Vehicle{
  abstract void VehicleNo();
}
class Car extends Vehicle{
    String owner;
    double price;
    Car(String owner,double price)
    {
        this.owner=owner;
        this.price=price;
    }

    }
       public void Info()
        {
           System.out.print("Owner Name:"+owner+"Price"+price);
        }

    

}
public class ProgramAbstraction {
    public static void main (String[] args)
    {
    Car obj1=new Car("Wahab",283415);
    obj1.Info;
    }
}
