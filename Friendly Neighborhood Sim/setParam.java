import java.util.Scanner;
//This class sets the parameters of a Nigger(class)
public class setParam
{
    private double rand = 0.0;
    private byte randB = 0;
    
    public void randNumGen()
    {
        rand = Math.random();
        rand = rand * 100.0;
        randB = (byte)(Math.ceil(rand));
    }
    public Nigger setNewNigger(Nigger n)
    {
        if (randB <= 33)
        {
            n = new Nigger(0, 40, 10, 80, 90, 90, "John", 1, 13, 50);
            return n;
        }
        else if(randB <= 67)
        {
            n = new Nigger(0, 30, 20, 110, 100, 100, "Barry", 1, 16, 60);
            return n;
        }
        else if(randB <= 100)
        {
            n = new Nigger(0, 35, 25, 75, 115, 115, "Jarius", 1, 19, 35);
            return n;
        }
        else
        {
            //Nigger n0 = new Nigger(0, 100, 10, 80, 90, 90, "elsenigger", 1);
        }
        return n;
    }
}
    
    