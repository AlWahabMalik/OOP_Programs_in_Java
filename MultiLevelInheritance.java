class person{
    int id;
    String name;
    person(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class employee extends person{
    int salary;
    employee(int id,String name,int salary){
        super(id,name);
        this.salary=salary;
    }
    void display(){
        System.out.print(id+" "+name+" "+salary);
    }
}
class programmer extends employee{
    int bonus=10000;
    programmer(int id,String name,int salary)
    {
        super(id,name,salary);
    }
    @Override
    void display()
    {
    super.display();
    System.out.print(" "+bonus);
    }
}
public class MultiLevelInheritance {
    public static void main (String[] args){
        programmer obj1=new programmer(12,"Asalm", 2000);
        obj1.display();
    }
}
