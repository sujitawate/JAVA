import java.awt.*;

class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        Frame fobj = new Frame(title);
        fobj.setSize(400,400);
        fobj.setVisible(true);
    }
}

class GUI2
{
    public static void main(String Arg[])
    {
        MarvellousFrame mobj = new MarvellousFrame("Sujit");   
    }