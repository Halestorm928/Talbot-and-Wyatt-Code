import java.util.Scanner;
public class NiggerRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ClearScreen clear = new ClearScreen();
        Intro intro = new Intro();
        setParam setParam = new setParam();
        Nigger n1 = new Nigger();
        Nigger n2 = new Nigger();
        Nigger n3 = new Nigger();
        
        intro.Intro();
        
        setParam.randNumGen();
        setParam.setNewNigger(n1);
        setParam.randNumGen(); ///
        setParam.setNewNigger(n2);
        setParam.randNumGen();///
        setParam.setNewNigger(n3);
        
        n1.printStats();
        n2.printStats();
        n3.printStats();
        //nigger.printAllGets();
    }
}