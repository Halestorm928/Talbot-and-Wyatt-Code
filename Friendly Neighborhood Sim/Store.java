import java.util.Scanner;
public class Store
{
    
    Scanner input = new Scanner(System.in);
    
    
    int inventory.inv_tobacco, inventory.inv_cotton;
    
    int p_cotton, p_tobacco;
    private int yesorno = 0;
    public Store()
    {
      RunStore();
    }
    public void RunStore()
    {
      System.out.println("Would you like to Sell(1) or Buy(2) Back(3)?");
     yesorno = input.nextInt();
     if (yesorno == 1)
     {Sell();}
     
     else if (yesorno == 2)
     {Buy();}
    
     else if (yesorno == 3)
     {Back();}
     
     else
     {ReRun();}
    }
    
    public void Sell()
    {
        System.out.println("The merchant will buy for : \n Tobacco: " + p_tobacco + "\n Cotton: " + p_cotton);
        System.out.println("Do you want to sell cotton(1), tobacco(2), back(3)");
        int response = input.nextInt();
        if (response == 1)
        {
            System.out.println("You sell your " +inv_cotton + " cotton for " + p_cotton+" each.");
        }
     
        else if (response == 2)
        {
            System.out.println("You sell your "+ inv_tobacco+" tabacco for " + p_tobacco+" each.");
        }
    
        else if (response == 3)
        {
        }
     
        else
        {ReRun();}
        
    }
    public void Buy()
    {
        System.out.println("The current prices are: \n Tobacco: " + p_tobacco + "\n Cotton: " + p_cotton);
        ReRun();
    }
    public void ReRun()
    {
        System.out.println("Wrong number, try again \n");
        RunStore();
    }
    public void Back()
    {
    }
    
    
}

//THIS MAY NEED TO CHANGE THE VALUE OF YES OR NO BACK TO 0 IF THERE ARE ERRORS