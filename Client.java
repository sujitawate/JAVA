import java.net.*;
import java.io.*;


class Client
{
    public static void main(String Arg[]) throws Exception
    {
        System.out.println("Client Application is running...");
        
        Socket s = new Socket("localhost",2100);
        System.out.println("Client is wating for connection");

        PrintStream ps = new PrintStream(s.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Chat masseger started..");
        String str1,str2; 
        System.out.println("Enter massege for server : ");
        while(!(str1 = br2.readLine()).equals("end"))
        {
            ps.println(str1);
            str2 = br1.readLine();
            System.out.println("Enter massege for server : ");
            System.out.println("Server says : "+str2);
        }
        System.out.println("Thank you for using chat messenger..")
    }
}