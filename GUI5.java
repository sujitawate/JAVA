import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
    public Frame fobj;
    public MarvellousFrame(String title)
    {
        fobj = new Frame(title);
        fobj.setSize(400,400);
        fobj.setVisible(true);
        fobj.addWindowListener(new MarvellousListner());

    }
}
class MarvellousListner extends WindowAdapter
{

    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }



}
class GUI5
{
    public static void main(String Arg[])
    {
        MarvellousFrame mobj = new MarvellousFrame("Sujit");   
    }
}