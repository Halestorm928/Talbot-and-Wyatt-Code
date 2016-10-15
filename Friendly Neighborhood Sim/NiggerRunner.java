import java.util.Scanner;

public class NiggerRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ClearScreen clear = new ClearScreen();
        Intro intro = new Intro();
        Nigger nigger1 = new Nigger();
        setParam setParam = new setParem();
        
        intro.Intro();
        setParam.setParam();
        System.out.println(nigger1);
        //nigger.printAllGets();
    }
}