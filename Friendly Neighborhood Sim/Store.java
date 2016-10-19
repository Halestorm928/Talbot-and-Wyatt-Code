import java.util.Scanner;
public class Store
{
    
    Scanner store_input = new Scanner(System.in);
    Inventory inventory = new Inventory();
    LevelSelect level = new LevelSelect();
    
    int p_cotton = 10;
    int p_tobacco = 5;
    
    private int yesorno = 0;
    
    public Store()
    {
      RunStore();
    }
    public String printName()
    {
        return "Store";
    }
    public void RunStore()
    {
     System.out.println("Would you like to Sell(1) or Buy(2) Back(3)?");
     yesorno = store_input.nextInt();
     switch (yesorno)
     {
      case 1:
      Sell(); break;
     
      case 2:
      Buy(); break;
     
      case 3:
      Back(); break;
     }
     if (yesorno < 1 || yesorno > 3) {System.out.println("Wrong number, try again"); RunStore();}
     
     }
    
    
    public void Sell()
    {
        System.out.println("The merchant will buy for : \n Tobacco: " + p_tobacco + "\n Cotton: " + p_cotton);
        System.out.println("Do you want to sell cotton(1), tobacco(2), back(3)");
        int response = store_input.nextInt();
        
        switch(response)
        {
         case 1 : 
            System.out.println("You sell your " +p_cotton + " cotton for " + p_cotton+" each.");
            p_cotton = p_cotton - p_cotton;
            System.out.println("You have " + p_cotton +" cotton");
            RunStore(); break;
         
         case 2 :
            System.out.println("You sell your "+ inventory.inv_tobacco+" tabacco for " + p_tobacco+" each.");
            inventory.inv_tobacco = inventory.inv_tobacco - inventory.inv_tobacco;
            System.out.println("You have " + p_tobacco +" tobacco \n");
            RunStore(); break;
          
         case 3 :
             Back(); break;
        }
        if (response < 1 || response > 3) {System.out.println("Wrong number, try again"); Sell();}
    }

    public void Buy()
    {
        System.out.println("The current prices are: \n Tobacco(1): " + p_tobacco + "\n Cotton(2): " + p_cotton +"\n(3) Back");
        int respnose = store_input.nextInt();
        System.out.println("How many would you like to purchase?");
        int response = store_input.nextInt();
        switch (response)
        {
            case 1 :
         inventory.inv_tobacco = inventory.inv_tobacco - response;
         System.out.println("You have " + inventory.inv_tobacco + " Tobacco left.");
         break; case 2:
         inventory.inv_cotton = inventory.inv_cotton - response;
         System.out.println("You have: " + inventory.inv_cotton + " left");
         RunStore();
         break; case 3:
         Back(); break;
        }
        if (response < 1 || response > 3){System.out.print("Wrong number, try again."); Buy();}
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