import java.util.Scanner;
public class Plantation
{
    Nigger n1 = new Nigger();
    Nigger n2 = new Nigger();
    Nigger n3 = new Nigger();
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
        n2 = mn2;
        n3 = mn3;
    }
    public void Story()
    {
        int chooseachar;
        
        System.out.println("Welcome to " +Intro.playername+ "'s Plantation, We've got plenty of things to do");
        System.out.println("");
        System.out.println("Choose a nigger::");
        
        System.out.println(n1.getName() + " " +n2.getName() +" " + n3.getName());
        System.out.println("(1) (2) (3)");
        chooseachar = input.nextInt();
        
        if (chooseachar == 1);
        {
            System.out.println("Here's" + n1.getName() + "'s stats");
            n1.printStats();
        }
        
        if (chooseachar == 2);
        {
            System.out.println("Here's" + n2.getName() + "'s stats");
            n1.printStats();
        }
        
        if (chooseachar == 3);
        {
            System.out.println("Here's" + n3.getName() + "'s stats");
            n1.printStats();
        }
    }
}