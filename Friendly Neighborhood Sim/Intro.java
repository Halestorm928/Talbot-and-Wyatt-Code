import java.util.Scanner;

public class Intro
{
    Scanner input = new Scanner(System.in);
    static String playername;
    public void Intro()
    {
        System.out.println("Enter your name");
        playername = input.nextLine();
        System.out.println("Welcome to Nigger Simulator, "+playername+". Let's begin...");
        System.out.println("");
    }
}
