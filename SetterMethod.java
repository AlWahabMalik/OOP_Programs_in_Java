public class SetterMethod {
    public static void main(String[] args)
    {
        student s1=new student();
        s1.setId(101);
        s1.setName("Mohsin");
       System.out.println("ID "+s1.id);
       System.out.println("Name "+s1.name);
    }
    }
    class student
    {
        int id;
        String name;
        void setId(int id)
        {
            this.id=id;
        }
        void setName(String name)
        {
            this.name=name;
        }
    }
