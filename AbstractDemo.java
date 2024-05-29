
abstract class RBI
{
    public abstract float calculteROI();
    // virtual flot CalculateROI() = 0;
    public void DisplayRules();
    {
        System.out.println("You have to submit Adhar and PAN card");
        System.out.println("Minimum balnce is 10,000");
    }

}

class SBI extends RBI
{
    public float CalculateROI()
    {
        return 5.7;
    }
}
class BOM extends RBI
{
    public float CalculateROI()
    {
        return 7.7;
    }
}
class AbstractDemo
{
    public static void main(String Arg[])
    {
        SBI sobj = new SBI();
        BOM bobj = new BOM();

        sobj.DisplayRule();
        bobj.DisplaRule();

        float fRet = 0.0;
        fRet = sobj.CalculateROI();
        System.out.println("ROI of SBI is : "+fRet);
        System.out.println("ROI of BOM is : "+fRet);

    }
}