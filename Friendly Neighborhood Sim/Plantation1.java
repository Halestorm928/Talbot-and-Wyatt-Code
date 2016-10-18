import java.util.Scanner;
public class Plantation1
{
    Nigger n1 = new Nigger();
    Nigger n2 = new Nigger();
    Nigger n3 = new Nigger();
   
    int choice;
    Scanner input = new Scanner(System.in);
    
    public String printName()
    {
        return "Plantation 1";
    }
    public void setMainNiggers(Nigger mn1, Nigger mn2, Nigger mn3)
    {      
        n1 = mn1;
        n2 = mn2;
        n3 = mn3;
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
    //Starts general flow of Plantation Class
    public void Story()
    {
        boolean isfn;
        int numLashes;
        
        System.out.println("Welcome to " +Intro.playername+ "'s Plantation, We've got plenty of things to do");
        System.out.println("");
        System.out.println("Choose a nigger::");
        
        System.out.println(n1.getName() + " " +n2.getName() +" " + n3.getName());
        System.out.println("(1)   (2)   (3)");

        choice = input.nextInt();
        
        moveOn();
        if (choice == 1)
        {
            
            System.out.println("Here's " + n1.getName() + "'s stats");
            System.out.println("");
            n1.printStats();
            if (n1.getFieldNigger() == false)
            {
                System.out.println("Add this nigger to the field?");
                System.out.println("Yes(1)\t\tNo(2)");
                choice = 0;
                choice = input.nextInt();
                if (choice == 1)
                {
                    isfn = true;
                    n1.setIsFieldNigger(isfn);
                    System.out.println(n1.getName() + " is now a field nigger!");
                }
                else if (choice == 2)
                {
                    //Does nothing
                }
            }
            else if (n1.getFieldNigger() == true)
            {
                System.out.println("Remove this nigger from the field?");
                System.out.println("Yes(1)\t\tNo(2)");
                choice = 0;
                choice = input.nextInt();
                if (choice == 1)
                {
                    isfn = false;
                    n1.setIsFieldNigger(isfn);
                    System.out.println(n1.getName() + " is no longer a field nigger!");
                }
                else if (choice == 2)
                {
                    //Does nothing
                }
            }
            System.out.println("Whip your nigger?");
            System.out.println("Yes(1)\t\tNo(2)");
            choice = 0;
            choice = input.nextInt();
            if (choice == 1)
            {
                System.out.println("How many times will you whip " + n1.getName() + "?");
                numLashes = 0;
                numLashes = input.nextInt();
                for(int i = 0; i <= numLashes; i++ )
                {
                    n1.whipNigger();
                }
                moveOn();
                System.out.println("You've whipped " + n1.getName() + " " + numLashes + " times!");
                System.out.println("______________________________________________________");
                n1.printStats();
            }            
        }
        
        if (choice == 2)
        {
            System.out.println("Here's "  + n2.getName() + "'s stats");
            System.out.println("");
            n2.printStats();
        }
        
        if (choice == 3)
        {
            System.out.println("Here's " + n3.getName() + "'s stats");
            System.out.println("");
            n3.printStats();
        }
        
    }
}