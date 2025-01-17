class Base
{
    public int A;
    public int B;

    public Base()
    {
        System.out.println("Inside Base constructor");
    }
    public void fun()
    {
        System.out.println("Inside Base fun");
        this.A = 11;
        this.B = 21;
    }
}

class Derived extends Base  //class Derived : public Base
{
    public int X;
    public int Y;
    public Derived()
    {
        System.out.println("Inside Derived constructur");
        this.X = 51;
        this.Y = 101;
    }
    public void gun()
    {
        System.out.println("Inside Base gun");
    }
}

class Single
{
    public static void main(String Arg[])
    {
        Derived dobj = new Derived();    //  No casting  
        dobj.fun();
        dobj.gun();

        System.out.println(dobj.A); 
        System.out.println(dobj.B);
        System.out.println(dobj.X);
        System.out.println(dobj.Y);
    }
}

 //  Base bobj2 = new Derived();  // upcasting
       // Derived dobj = new Base();  // down casting
              // Base bobj = new Base();   //  No casting