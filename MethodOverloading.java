public class MethodOverloading{
    static int sum(int a,int b)
    {
        return a+b;
    }
    static int sum(int a,int b, int c)
    {
        return a+b+c;
    }
    static float sum(float a,float b)
    {
        return a+b;
    }
    public static void main (String[] args)
{
System.out.println(MethodOverloading.sum(4.4f,6.2f));
System.out.println(MethodOverloading.sum(4,5,7));
System.out.println(MethodOverloading.sum(79,6));
}
}
