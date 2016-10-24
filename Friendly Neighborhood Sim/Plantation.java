import java.util.Scanner;
public class Plantation
{
    Nigger[] n = new Nigger[50];
    Field field;
    int choice;
    Scanner input;
    LevelSelect level;
    
    public Plantation (Scanner s)
    {
        input = s;
    }
    public String printName()
    {
        return "Plantation 1";
    }
    public void setMainNiggers(Nigger[] x)
    {      
        n = x;
        //This gets the nigger array from main
    }
    public void setLevel(LevelSelect l)
    {      
        level = l;
    }
    public void setField(Field f)
    {
        field = f;
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
    public void welcome()
    {
        System.out.println("Welcome to " +Intro.playername+ "'s Plantation, We've got plenty of things to do");
        System.out.println("");
    }
    public void plantName()
    {
        System.out.println("Plantaion: " + Intro.playername + "'s Plantation");
    }
    //Starts general flow of Plantation Class
    public void Story()
    {
        boolean isfn;
        int numLashes;
        int numDays = 0;
        byte nindex = 0;
        
        field.setMainNiggers(n);
        System.out.println("Choose a nigger:");
        
        System.out.println(n[1].getName() + "(1) " +n[2].getName() +"(2) " + n[3].getName() + "(3)");
        choice = 0;
        choice = input.nextInt();
        
        moveOn();
        switch(choice)
        {
            case 1: nindex = 1; break;
            case 2: nindex = 2; break;
            case 3: nindex = 3; break;
        }
        System.out.println("Here's " + n[nindex].getName() + "'s stats");
        System.out.println("");
        n[nindex].printStats();
            if (!n[nindex].getFieldNigger())
            {
                System.out.println("Add this nigger to the field?");
                System.out.println("Yes(1)\t\tNo(2)");
                choice = 0;
                choice = input.nextInt();
                switch (choice)
                {
                    case 1: 
                        isfn = true;
                        n[nindex].setIsFieldNigger(isfn);
                        System.out.println(n[nindex].getName() + " is now a field nigger!"); break;
                    default: break;
                        
                }
            }
            else if (n[nindex].getFieldNigger())
            {
                System.out.println("Remove this nigger from the field?");
                System.out.println("Yes(1)\t\tNo(2)");
                choice = 0;
                choice = input.nextInt();
                switch (choice)
                {
                    case 1: 
                        isfn = true;
                        n[nindex].setIsFieldNigger(isfn);
                        System.out.println(n[nindex].getName() + " is now a field nigger!"); break;
                    default: break;
                }
            }
        System.out.println("Whip your nigger?");
        System.out.println("Yes(1)\t\tNo(2)");
        choice = 0;
        choice = input.nextInt();
        switch (choice)
        {
            case 1: 
                System.out.println("How many times will you whip " + n[nindex].getName() + "?");
                numLashes = 0;
                numLashes = input.nextInt();
                for(int i = 0; i <= numLashes; i++ )
                {
                    n[nindex].whipNigger();
                    n[nindex].checkLevelUp();
                }
                moveOn();
                System.out.println("You've whipped " + n[nindex].getName() + " " + numLashes + " times!");
                System.out.println("______________________________________________________");
                n[nindex].printStats(); break;
            case 2:
                System.out.println("Your nigger is not whipped today");
                System.out.println("______________________________________________________");
                break;
        }
        moveOn();
        System.out.println("Will you work you niggers?");
        System.out.println("Yes(1)\t\tNo(2)");
        choice = 0;
        choice = input.nextInt();
        switch (choice)
        {
            case 1: 
                System.out.println("How many days will you work you nigger?");
                numDays = input.nextInt();
                field.setDays(numDays);
                field.setMainNiggers(n);
                field.debug();
                field.waitDay(); break;
            case 2: 
                System.out.println("You wait to work your niggers.");
                break;
        }
        moveOn();
        
        System.out.println("Stay at your plantation?");
        System.out.println("Yes(1)\t\tNo(2)");
        choice = 0;
        choice = input.nextInt();
        switch (choice)
        {
            case 1: moveOn(); ReRunStory(); break;
            case 2: moveOn(); level.level(); break;
        }
            
        }
    public void ReRunStory()
    {
        Story();
    }
   }
