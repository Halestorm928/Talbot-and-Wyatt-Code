import java.util.Scanner;
public class Plantation1
{
    Nigger n1 = new Nigger();
    Nigger n2 = new Nigger();
    Nigger n3 = new Nigger();
   
    int chooseachar;
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
    public void Story()
    {
        
        System.out.println("Welcome to " +Intro.playername+ "'s Plantation, We've got plenty of things to do");
        System.out.println("");
        System.out.println("Choose a nigger::");
        
        System.out.println(n1.getName() + " " +n2.getName() +" " + n3.getName());
        System.out.println("(1)   (2)   (3)");

        chooseachar = input.nextInt();
        
        
        if (chooseachar == 1)
        {
            System.out.println("Here's " + n1.getName() + "'s stats");
            System.out.println("");
            n1.printStats();
        }
        
        if (chooseachar == 2)
        {
            System.out.println("Here's "  + n2.getName() + "'s stats");
            System.out.println("");
            n2.printStats();
        }
        
        if (chooseachar == 3)
        {
            System.out.println("Here's " + n3.getName() + "'s stats");
            System.out.println("");
            n3.printStats();
        }
        
    }
}