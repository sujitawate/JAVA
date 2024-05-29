
import java.util.*;

class collection2
{
    public static void main(String Arg[])
    {
       Hashtable <String, Integer> hobj = new Hashtable<String,Integer>();
       hobj.put("C Programming", 990);
       hobj.put("CPP Programming", 1200);
       hobj.put("Java Programming", 780);
       hobj.put("Python Programming", 1650);

       System.out.pritnln("Book price of java"+hobj.get("Java Programming"));
       hobj.remove("CPP Programming");

       Enumeration eobj = hobj.keys();
       while(eobj.hasMoreElements())
       {

            System.out.println(eobj.nextElement());
       }
        
    }

}