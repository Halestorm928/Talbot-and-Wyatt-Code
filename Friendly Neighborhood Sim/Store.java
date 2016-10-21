import java.util.Scanner;
public class Store
{
    
    Scanner input = new Scanner(System.in);
    Inventory inventory = new Inventory();
    LevelSelect level;
    int p_cotton = 10;
    int p_tobacco = 5;
    
    private int type;
    private int yesorno = 0;
    
    public Store(Scanner s)
    {
        
    }
    public void getLevel(LevelSelect l)
    {
        level = l;
    }
    public String printName()
    {
        return "Store";
    }
    public void RunStore()
    {
     System.out.println("Would you like to Sell(1) or Buy(2) Back(3)?");
     yesorno = input.nextInt();
     
     switch(yesorno)
     {
         case 1: Sell();break;
         case 2: Buy(); break;
         case 3: Back(); break;
         default: System.out.println("Wrong number, try again"); ReRun();break;
     }
     }
    public void Sell()
    {
        System.out.println("The merchant will buy for : \n Tobacco: " + p_tobacco + "\n Cotton: " + p_cotton);
        System.out.println("Do you want to sell cotton(1), tobacco(2), back(3)");
        int response = input.nextInt();
        switch(response)
        {
         case 1: 
            System.out.println("You sell your " +inventory.inv_cotton + " cotton for " + inventory.inv_cotton+" each.");
            inventory.inv_cotton = 0;
            System.out.println("You have " + inventory.inv_cotton +" cotton");
            RunStore(); break;
         case 2: 
            System.out.println("You sell your "+ inventory.inv_tobacco+" tabacco for " + p_tobacco+" each.");
            inventory.inv_tobacco = 0;
            System.out.println("You have " + inventory.inv_tobacco +" tobacco \n");
            RunStore(); break;
         case 3: Back(); break;
         default: System.out.println("Wrong number, try again"); ReRun(); break;
    }
    }
    public void Buy()
    {
        ClearScreen.ClearScreen();
        System.out.println("The current prices are: \n Tobacco(1): " + p_tobacco + "\n Cotton(2): " + p_cotton +"\n(3) Back");
        int response = input.nextInt();
        switch(response)
        {
         case 1:
            System.out.println("You have " + inventory.inv_tobacco + " Tobacco."); 
            type = 1; break;
         case 2:
            System.out.println("You have: " + inventory.inv_cotton + " Cotton.");
            type = 2; break;
         case 3:
            Back(); break;
         default:
            System.out.println("Wrong number, try again."); ReRun(); break;
        }
        System.out.println("How many would you like to purchase?");
        response = input.nextInt();
        switch(type)
        {
            case 1: 
                inventory.inv_tobacco = inventory.inv_tobacco + response; 
                System.out.println("You have " + inventory.inv_tobacco + " Tobacco"); level.moveOn(); break;
            case 2: 
                inventory.inv_cotton = inventory.inv_cotton + response;
                System.out.println("You have " + inventory.inv_cotton + " Cotton"); level.moveOn(); break;
                
            default: break;
        }
        if(1==1)
        {
            Buy();
        }
    }
    public void ReRun()
    {
        System.out.println("Wrong number, try again \n");
        RunStore();
    }
    public void Back()
    {
        level.level();
    }
}

//THIS MAY NEED TO CHANGE THE VALUE OF YES OR NO BACK TO 0 IF THERE ARE ERRORS