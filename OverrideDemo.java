class Workers {         //Parent class
    void work()
    {
      System.out.println(" They can do all");
    }
     void time()
    {
    System.out.println("They are  begginers");
    }
    }
       
    class experts extends Workers {          //Child class
    
    void work()
    {
    System.out.println( " They can't do All"); 
    }
    void time()
    {
    System.out.println("They are experienced");
    }
    }
    public class OverrideDemo {
    public static void main(String[] args)
    {
        experts e1=new experts();     //UpCasting
        e1.work();
        e1.time();
        Workers e2=new experts();
        e2.work();
        e2.time();
    }
    }