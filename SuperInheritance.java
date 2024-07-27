class person{
    int id;
    String name;
    person(int id,String name)
    {
        id=this.id;
        name=this.name;
    }
}
class employee extends person{
    int salary;
    employee(int id,String name, int salary)
    {
        super(id, name);
        salary=this.salary;

    }
    void display()
    {
        System.out.print( "Id:"+id+" Name: "+name+"Salary: "+salary);
    }
}
public class SuperInheritance {
    
    public static void main(String[] args)
    {
    employee obj1= new employee(12,"Ali",232);
    obj1.display();
    }    
}