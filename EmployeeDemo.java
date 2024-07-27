import java.util.*;
class EmployeeDemo{
    String id;
    String name;
    int salary;
    void getInsert()
    {
        id="";
        name="";
        salary=0;
    }
    EmployeeDemo(String id,String name,int salary)
        {
          this.id=id;
          this.name=name;
          this.salary=salary;
        }
        void getDisplay()
        {
            System.out.println("id"+id);
            System.out.println("Name"+name);
            System.out.println("Salary"+salary);
        }
        public class Employee 
        {
            public static void main(String[] args)
            {
               
                Scanner input=new Scanner("System.in");
                System.out.println("Enter Your id");
                String id=input.next();
                System.out.println("Enter Your Name");
                String name=input.nextLine();
                System.out.println("Enter Your Salary");
                int salary=input.nextInt();
                Employee e1=new Employee(id,name,salary);
                input.close();
            }
        }
            
        }


