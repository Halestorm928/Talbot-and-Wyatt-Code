import java.util.Scanner;
public class TestRunner
{
    Scanner input = new Scanner(System.in);
    public void main (String[] args)
    {
        System.out.println("enter # of arms");
        NiggerTest.x = input.nextInt();
        
        System.out.println("enter # of buttons");
        NiggerTest.z = input.nextInt();
        
        NiggerTest n  = new NiggerTest(NiggerTest.x, NiggerTest.z);
        System.out.println(n);
    }
}
