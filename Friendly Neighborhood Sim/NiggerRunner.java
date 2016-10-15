import java.util.Scanner;

public class NiggerRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ClearScreen clear = new ClearScreen();
        Intro intro = new Intro();
        setParam setParam = new setParam();
        Nigger nigger = new Nigger();
        
        
        intro.Intro();
        
        setParam.randNumGen();
        setParam.setNewNigger();
        setParam.randNumGen(); ///
        setParam.setNewNigger();
        setParam.randNumGen();///
        setParam.setNewNigger();
        
        n1.printStats();
        n2.printStats();
        n3.printStats();
        //nigger.printAllGets();
    }
}