import java.util.Scanner;
public class LevelSelect
{
    Scanner input = new Scanner(System.in);
    private int a;
    Plantation1 plantation1 = new Plantation1();
    Nigger n1 = new Nigger();
    Nigger n2 = new Nigger();
    Nigger n3 = new Nigger();
    
    public void setMainNiggers(Nigger mn1, Nigger mn2, Nigger mn3)
    {
        n1 = mn1;
        n2 = mn2;
        n3 = mn3;
    }
    public void level()
    {
        System.out.println("Where would you like to go?");
        System.out.println("");
        System.out.println(plantation1.printName());
        System.out.println("(1)  (2)  (3)");
        
        a = input.nextInt();
        
        
        if (a==1)
        {
            moveOn();
            plantation1.setMainNiggers(n1, n2, n3);
            plantation1.Story();
        }
    }
    public void moveOn()
    {
        System.out.println("Press Enter to move on");
        String enter;
        enter = input.nextLine();
        
        
        
        if(enter.isEmpty())
        {
            System.out.println('\u000C');
        }
    }
    
    
    
    
    
    
    
    
    
}
