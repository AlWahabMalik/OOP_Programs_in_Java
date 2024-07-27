import java.util.*;
public class MethodSum {
   static int sum;
   public static void methodSum(int num1,int num2)
    {
      sum=num1+num2;
      System.out.println("Sum is "+sum);
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1=input.nextInt();
        System.out.println("Enter 2nd number");
        int num2=input.nextInt();
      methodSum(num1,num2);
    }
}
