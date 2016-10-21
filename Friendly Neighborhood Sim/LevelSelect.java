import java.util.Scanner;
public class LevelSelect
{
    private int a;
    Plantation plantation1;
    Scanner input;
    Nigger[] n = new Nigger[50];
    Store store;

    public LevelSelect(Scanner s, Store param_store, Plantation param_plant)
    {
        input = s;
        store = param_store;
        plantation1 = param_plant;
    }
    public void setMainNiggers(Nigger[] x)
    {
        n = x;
    }
    public void level()
    {
        System.out.println("Where would you like to go?");
        System.out.println("");
        System.out.println(plantation1.printName() + "(1)\t"+ store.printName() + "(4)");
        
        a = input.nextInt();
        
        if (a == 1)
        {
           moveOn();
          plantation1.setMainNiggers(n);
          plantation1.Story();
        }
        if (a == 4)
        {
            moveOn();
            store.RunStore();
        }
    }
    public void moveOn()
    {
        System.out.println("Press Enter to continue...");
        String enter;
        enter = input.nextLine();
        
        if(enter.isEmpty())
        {
            System.out.println('\u000C');
        }
    }
    
    
    
    
    
    
    
    
    
}
