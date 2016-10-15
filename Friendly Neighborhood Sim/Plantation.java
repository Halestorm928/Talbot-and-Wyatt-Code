import java.util.Scanner;
public class Plantation
{
    Nigger n1 = new Nigger();
    Scanner input = new Scanner(System.in);
   
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
    public void setMainNiggers(Nigger mn1, Nigger mn2, Nigger mn3)
    {
        // Sets first nigger
        n1 = mn1;
    }
    public void Story()
    {
        String chooseachar;
        
        System.out.print("Welcome to " +Intro.playername+ "'s Plantation, We've got plenty of things to do");
        
        System.out.println("Choose a nigger::");
        System.out.println(n1.getName + " " +n2.getName +" " + n3.getName);
        
        if (chooseachar.equals("n1"));
        {
            System.out.println("Here's" + n1.getName + "'s stats");
            n1.printStats();
        }
        
        if (chooseachar.equals("n2"));
        {
            System.out.println("Here's" + n2.getName + "'s stats");
            n1.printStats();
        }
        
        if (chooseachar.equals("n3"));
        {
            System.out.println("Here's" + n3.getName + "'s stats");
            n1.printStats();
        }
    }
}