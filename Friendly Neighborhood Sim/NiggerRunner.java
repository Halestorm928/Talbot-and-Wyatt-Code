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
        //Recurring classes that will be accessed
        Plantation plantation1 = new Plantation(input);
        Store store = new Store(input);
        LevelSelect level = new LevelSelect(input, store, plantation1);
        //The store still needs to get the level
        store.getLevel(level);
        plantation1.setLevel(level);
        //Dont know if inventory needs anything yet
        //will be accessed several times though
        Inventory inv = new Inventory();
        Field field = new Field(input);
        plantation1.setField(field);                
        
        Nigger[] n = new Nigger[50];
        //This is an array of niggers that will be used throught
        
        setParam.randNumGen();
        n[1] = setParam.setNewNigger(n[1]);
        inv.numOfNigs += 1;
        setParam.randNumGen(); ///
        n[2] = setParam.setNewNigger(n[2]);
        inv.numOfNigs += 1;
        setParam.randNumGen();///
        n[3] = setParam.setNewNigger(n[3]);
        inv.numOfNigs += 1;
        
        
        
        intro.Intro();
        level.moveOn();
        
        n[1].printStats();
        n[2].printStats();
        n[3].printStats();                    //INTRO + STATS
        //_________________________________________________________________
        


        level.setMainNiggers(n);
        level.level();
       
        
        
        //level.level();
        
        
    }
}