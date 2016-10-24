import java.util.Scanner;
public class Field
{
    // instance variables - replace the example below with your own
    Scanner input;
    Nigger[] n = new Nigger[50];
    int days = 0;
    int nindex;
    public Field(Scanner s)
    {
        input =  s;
        days =  0;
        nindex = 1;
    }
    public void setMainNiggers(Nigger[] x)
    {
        n = x;
    }
    public void setDays(int param_days)
    {
        days = param_days;
    }
    public void debug()
    {
        System.out.println(n[nindex].getName());
    }
    public void waitDay()
    {
        
        for (nindex = 0; nindex <= 50; nindex++)
        {           
            if (n[nindex].getFieldNigger() == true)
            {
                for (int in = 0; in <= days; in++)
                {
                    n[nindex].waitDay();
                }
                n[nindex].printStats();
            }
            else
            {
            
            }
        }
        System.out.println("Your field niggers have worked for " + days + " days.");
        
    }
}
