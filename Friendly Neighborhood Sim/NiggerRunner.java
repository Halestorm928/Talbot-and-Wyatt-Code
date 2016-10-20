import java.util.Scanner;
public class NiggerRunner
{    
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        //Scanner for all classes
        ClearScreen clear = new ClearScreen();
        Intro intro = new Intro(input);
        setParam setParam = new setParam();
        Plantation1 plantation1 = new Plantation1();
        LevelSelect level = new LevelSelect(input);
        Inventory inventory = new Inventory();
        
        
        Nigger[] n = new Nigger[50];
                        
        setParam.randNumGen();
        n[1] = setParam.setNewNigger(n[1]);
        setParam.randNumGen(); ///
        n[2] = setParam.setNewNigger(n[2]);
        setParam.randNumGen();///
        n[3] = setParam.setNewNigger(n[3]);
        
        intro.Intro();
        level.moveOn();
        
        n[1].printStats();
        n[2].printStats();
        n[3].printStats();                    //INTRO + STATS
        //_________________________________________________________________
        


        level.setMainNiggers(n[1], n[2], n[3]);
        level.level();
       
        
        
        //level.level();
        
        
    }
}