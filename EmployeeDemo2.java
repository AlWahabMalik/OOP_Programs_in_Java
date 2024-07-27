import java.util.Scanner;

public class EmployeeDemo2 {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter Your name : ");
    String name=input.nextLine();
    System.out.println("Enter Your id : ");
    int id=input.nextInt();
    System.out.println("Enter Your salary : ");
    int salary=input.nextInt();
    Employee yasir=new Employee();
    yasir.insert(id,name,salary);
    yasir.display();
}
    
}
class Employee{
    int id;
    String name;
    int salary;
    void insert(int id, String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("Name : "+name+" Id : "+id+" Salary : "+salary);
    }
}