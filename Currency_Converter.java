import java.util.*; 
public class Currency_Converter
{
    public static void main(String[] args) 
        {
            double rupee,dollar,pound,code,euro,KWD;
            DecimalFormat f = new DecimalFormat("##.###");
            Scanner sc = new Scanner(System.in);
            System.out.println(" WelCome to  Currency Converter Project:");
            System.out.println("Enter the currency code");
            System.out.println("1:Rupees\n 2:Dollar\n 3:Pound\n 4:Euro\n 5:Kuwaiti dinar"); 
            code=sc.nextInt();
            if(code == 1)
            {
                System.out.println("Enter amount in rupees:");
                rupee = sc.nextFloat();
                dollar = rupee / 75;
                System.out.println("Dollar : "+f.format(dollar));
                pound = rupee / 101;
                System.out.println("Pound : "+f.format(pound));
                euro = rupee / 84;
                System.out.println("Euro : "+f.format(euro));
                KWD = rupee / 250;
                System.out.println("Kuwaiti dinar : "+f.format(KWD));
            }
            else if (code == 2)
            {
                System.out.println("Enter amount in dollar:");
                dollar = sc.nextFloat();
                rupee = dollar * 75;
                System.out.println("Rupees : "+f.format(rupee));
                pound = dollar * 0.72;
                System.out.println("Pound : "+f.format(pound));
                euro = dollar * 0.88;
                System.out.println("Euro : "+f.format(euro));
                KWD = dollar * 0.30;
                System.out.println("Kuwaiti dinar : "+f.format(KWD));
            }
            else if(code == 3)
            {
                System.out.println("Enter amount in Pound:");
                pound = sc.nextFloat();
                rupee = pound * 101;
                System.out.println("Rupees : "+f.format(rupee));
                dollar = pound * 1.35;
                System.out.println("Dollar : "+f.format(dollar));
                euro = pound * 1.36;
                System.out.println("Euro : "+f.format(euro));
                KWD = pound * 0.4;
                System.out.println("Kuwaiti dinar : "+f.format(KWD));
            }
            else if(code == 4)
            {
                System.out.println("Enter amount in Euro:");
                euro = sc.nextFloat();
                rupee = euro * 84;
                System.out.println("Rupees : "+f.format(rupee));
                dollar = euro * 1.12;
                System.out.println("Dollar : "+f.format(dollar));
                pound = euro * 0.73;
                System.out.println("Pound : "+f.format(pound));
                KWD = euro * 0.34;
                System.out.println("Kuwaiti dinar : "+f.format(KWD));
            }
            else if(code == 5)
            {
                System.out.println("Enter amount in Kuwaiti dinar:");
                KWD = sc.nextFloat();
                rupee = KWD * 250;
                System.out.println("Rupees : "+f.format(rupee));
                dollar = KWD * 3.30;
                System.out.println("Dollar : "+f.format(dollar));
                pound = KWD * 2.5;
                System.out.println("Pound : "+f.format(pound));
                euro = KWD * 2.94;
                System.out.println("Euro : "+f.format(euro));
            }
            else
                System.out.println("Invalid Code!");
    }
}