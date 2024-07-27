import java.util.Scanner;
public class MethodEvenOrOdd {
 public static void methodEvenOdd(int num) {
        if(num%2==0)
        {
            System.out.println(num+" Number is Even");
        }
        else
        {
            System.out.println(num+" Number is odd");
        }
    }
    public static void main(String[] args)
    {
Scanner input=new Scanner(System.in);
System.out.println("Enter a number");
int num=input.nextInt();
methodEvenOdd(num);
    }
}
