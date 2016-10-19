import java.util.Scanner;
public class NiggerRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ClearScreen clear = new ClearScreen();
        Intro intro = new Intro();
        setParam setParam = new setParam();
        Plantation1 plantation1 = new Plantation1();
        LevelSelect level = new LevelSelect();
        Inventory inventory = new Inventory();
        
        Nigger n1 = new Nigger();
        Nigger n2 = new Nigger();
        Nigger n3 = new Nigger();
        
        
        
        setParam.randNumGen();
        n1 = setParam.setNewNigger(n1);
        setParam.randNumGen(); ///
        n2 = setParam.setNewNigger(n2);
        setParam.randNumGen();///
        n3 = setParam.setNewNigger(n3);
        
        intro.Intro();
        
        n1.printStats();
        n2.printStats();
        n3.printStats();                    //INTRO + STATS
        //_________________________________________________________________
        
        level.moveOn();
        level.setMainNiggers(n1, n2, n3);
        level.level();
       
        
        
        //level.level();
        
        
    }
}