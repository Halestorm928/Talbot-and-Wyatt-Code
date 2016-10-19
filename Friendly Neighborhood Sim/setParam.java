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
        if (randB <= 10)
        {
            n = new Nigger(0, 40, 10, 80, 90, 90, "John", 1, 13, 50);
            return n;
        }
        else if(randB <= 20)
        {
            n = new Nigger(0, 30, 20, 110, 100, 100, "Barry", 1, 16, 60);
            return n;
        }
        else if(randB <= 30)
        {
            n = new Nigger(0, 35, 25, 75, 115, 115, "Jarius", 1, 19, 35);
            return n;
        }
        else if (randB <= 40)
        {
            n = new Nigger(0, 35, 25, 75, 115, 115, "Maxwell", 1, 19, 35);
            return n;
        }
        else if (randB <= 50)
        {
            n = new Nigger(0, 45, 15, 90, 100, 100, "Josh", 1, 14, 70);
            return n;
        }
        else if (randB <= 60)
        {
            n = new Nigger(0, 70, 5, 95, 120, 120, "Ahmadi", 1, 23, 25);
        }
        
        else if (randB <= 70)
        {
            n = new Nigger(0, 50, 30, 60, 90, 90, "Mehki", 1, 12, 75);
            return n;
        }
        else if (randB <= 80)
        {
            n = new Nigger(0, 30, 0, 65, 120, 120, "Evan", 1, 20, 25);
            return n;
        }
        else if (randB <= 90)
        {
            n = new Nigger(0, 40, 20, 80, 115, 115, "Thomas", 1, 21, 65);
            return n;
        }
        else if (randB <= 100)
        {
            n = new Nigger(0, 40, 0, 55, 100, 100, "Gustav", 1, 16, 50);
            return n;
        }
        return n;
    }
}
    
    