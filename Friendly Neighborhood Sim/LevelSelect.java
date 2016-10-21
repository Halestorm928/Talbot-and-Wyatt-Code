import java.util.Scanner;
public class LevelSelect
{
    private int a;
    Plantation1 plantation1;
    Scanner input;
    Nigger n1 = new Nigger();
    Nigger n2 = new Nigger();
    Nigger n3 = new Nigger();
    Store store;

    public LevelSelect(Scanner s, Store param_store, Plantation1 param_plant)
    {
        input = s;
        store = param_store;
        plantation1 = param_plant;
    }
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
        System.out.println(plantation1.printName() + "(1)\t"+ store.printName() + "(4)");
        
        a = input.nextInt();
        
        if (a == 1)
        {
           moveOn();
          plantation1.setMainNiggers(n1, n2, n3);
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
