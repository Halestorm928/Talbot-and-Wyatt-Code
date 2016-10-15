import java.util.Scanner;
public class NiggerRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ClearScreen clear = new ClearScreen();
        Intro intro = new Intro();
        setParam setParam = new setParam();
        Plantation plantation = new Plantation();
        
        
        Nigger n1 = new Nigger();
        Nigger n2 = new Nigger();
        Nigger n3 = new Nigger();
        
        intro.Intro();
        
        setParam.randNumGen();
        n1 = setParam.setNewNigger(n1);
        setParam.randNumGen(); ///
        n2 = setParam.setNewNigger(n2);
        setParam.randNumGen();///
        n3 = setParam.setNewNigger(n3);
        
        n1.printStats();                  //INTRO + STATS
        //_________________________________________________________________
        plantation.setMainNiggers(n1, n2, n3);
        plantation.moveOn();
        plantation.Story();
        
    }
}