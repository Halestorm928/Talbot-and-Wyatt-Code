/**
 * Niggerlover
 * Display a rainbow on Finch
 * Author: Wyatt Hales
 * Date: 10/10
 * I worked on this assignment alone, using only course materials.
 **/
 
import java.util.Scanner;

public class Niggerwhip
{
    public static void main(String args[])
    {
        System.out.println("Enter an amount of whips on Talbot the nigger");
        
        
        Scanner whip = new Scanner(System.in);
        int whips;
        int yesorno;
        
        whips = whip.nextInt();
        System.out.println("The crack of the whip sounds");
        
        if (whips >= 3)
        {
            System.out.println("Talbot collapses to the ground");
            System.out.println("");
            System.out.println("Ruthlessly continue to whip Talbot? 1 for Yes 0 for No");
            yesorno = whip.nextInt();
            if (yesorno == 1)
            {
                System.out.println("Talbot Dies Brutally");
                return;
            }
            if (yesorno == 0)
            {
                System.out.println("Talbot survives your whippings");
                return;
            }
        }
        if (whips < 3)
        {
            System.out.println("Talbot needs a couple more lashes");
            System.out.println("");
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Enter an amount of whips on Talbot the nigger");
        whips = whips + whip.nextInt();
        System.out.println("The crack of the whip sounds");
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        if (whips >= 3)
        {
            System.out.println("Talbot collapses to the ground");
            System.out.println("");
            System.out.println("Ruthlessly continue to whip Talbot? 1 for Yes 0 for No");
            yesorno = whip.nextInt();
            if (yesorno == 1)
            {
                System.out.println("");
                System.out.println("Talbot Dies Brutally");
                return;
            }
            if (yesorno == 0)
            {
                System.out.println("");
                System.out.println("Talbot survives your whippings");
                return;
            }
        }
        if (whips < 3)
        {
            System.out.println("Talbot needs a couple more lashes");
            System.out.println("");
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Enter an amount of whips on Talbot the nigger");
        whips = whips + whip.nextInt();
        System.out.println("The crack of the whip sounds");
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        if (whips >= 3)
        {
            System.out.println("Talbot collapses to the ground");
            System.out.println("");
            System.out.println("Ruthlessly continue to whip Talbot? 1 for Yes 0 for No");
            yesorno = whip.nextInt();
            if (yesorno == 1)
            {
                System.out.println("Talbot Dies Brutally");
                System.out.println("");
                return;
            }
            if (yesorno == 0)
            {
                System.out.println("Talbot survives your whippings");
                System.out.println("");
                return;
            }
        }
        if (whips < 3)
        {
            System.out.println("Talbot needs a couple more lashes");
        }
    }   
}