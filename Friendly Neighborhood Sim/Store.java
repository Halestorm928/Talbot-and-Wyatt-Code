import java.util.Scanner;
public class Store
{
    
    Scanner input = new Scanner(System.in);
    Inventory inventory = new Inventory();
    LevelSelect level;
    int money = 200;
    int p_cotton = 10;
    int p_tobacco = 5;
    int p_nigger = 200;
    
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
     level.moveOn();
     System.out.println("You have " +money + " money");
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
        System.out.println("The merchant will buy for : \n Tobacco: " + p_tobacco + "\n Cotton: " + p_cotton + "\n Nigger:" +p_nigger);
        System.out.println("Do you want to sell cotton(1), tobacco(2), nigger(3), back(4)");
        int response = input.nextInt();
        switch(response)
        {
         case 1: 
            System.out.println("You sell your " +inventory.inv_cotton + " cotton for " + inventory.inv_cotton+" each.");
            inventory.inv_cotton = 0;
            System.out.println("You have " + inventory.inv_cotton +" cotton");
            money = money + (inventory.inv_cotton * p_cotton);
            RunStore(); break;
         case 2: 
            System.out.println("You sell your "+ inventory.inv_tobacco+" tabacco for " + p_tobacco+" each.");
            inventory.inv_tobacco = 0;
            System.out.println("You have " + inventory.inv_tobacco +" tobacco \n");
            money = money + (inventory.inv_tobacco * p_tobacco);
            RunStore(); break;
         case 3:
            System.out.println("You sell your Nigger for " +p_nigger);
            inventory.inv_nigger = inventory.inv_nigger - 1;
            System.out.println("You have " + inventory.inv_nigger + " Niggers \n");
            money = money + (p_nigger);
            RunStore(); break;
         case 4: Back(); break;
         default: System.out.println("Wrong number, try again"); ReRun(); break;
        }
    }
    public void Buy()
    {
        ClearScreen.ClearScreen();
        System.out.println("The current prices are: \n Tobacco(1): " + p_tobacco + "\n Cotton(2): " + p_cotton + "\n Niggers(3)" +p_nigger +"\n(4) Back");
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
            System.out.println("You have: " + inventory.inv_nigger + " Niggers.");
            type = 3; break;
         case 4:
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
                money = money -(inventory.inv_tobacco * p_tobacco);
                System.out.println("You have " + inventory.inv_tobacco + " Tobacco"); level.moveOn(); break;
            case 2: 
                inventory.inv_cotton = inventory.inv_cotton + response;
                money = money -(inventory.inv_cotton * p_cotton);
                System.out.println("You have " + inventory.inv_cotton + " Cotton"); level.moveOn(); break;
            case 3:
                inventory.inv_nigger = inventory.inv_nigger + response;
                money = money -(inventory.inv_nigger * p_nigger);
                System.out.println("You have " + inventory.inv_nigger + " Niggers"); level.moveOn(); break;
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