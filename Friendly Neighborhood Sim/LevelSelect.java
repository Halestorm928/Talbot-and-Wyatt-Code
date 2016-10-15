import java.util.Scanner;
public class LevelSelect
{
    Scanner input = new Scanner(System.in);
    private int a;
    Plantation1 plantation1 = new Plantation1();


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
