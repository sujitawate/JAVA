import java.util.Scanner;

class ExeptionDemoX
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int No1 = 0, No2 = 0;
        float Ans = 0;

        System.out.println("Enter First Number : ");
        No1 = sobj.nextInt();

        System.out.println("Enter Second Number : ");
        No2 = sobj.nextInt();

        try
        {
            System.out.println("inside try");
            Ans = No1 / No2;     // 10/0 
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Exception occured and code is catch block : "+obj);

        }
        finally
        {
            System.out.println("Code is inside finally block..");
            System.out.println("Division is : ");
        }


        System.out.println("Division is : "+Ans);
    }

}
