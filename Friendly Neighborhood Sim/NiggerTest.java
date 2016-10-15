public class NiggerTest
{
    static int x;
    static int z;
    public NiggerTest()
    {
        x = 2;
        z = 1;
    }
    public NiggerTest(int arms, int buttons)
    {
        x = arms;
        z = buttons;
    }
    public int getArms()
    {
        return x;
    }
    public int getButtons()
    {
        return z;
    }
    public String toString()
    {
        return ""+x+" arms, and " +z+" buttons";
    }
}
