
/**
 * Write a description of class Nigger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nigger
{
    // instance variables - replace the example below with your own
    private int curexp, maxexp, curhatred, maxhatred, curhp, maxhp, lvl;
    private String name;

    public Nigger()
    {
       curexp = 0;
       maxexp = 100;
       curhatred = 0;
       maxhatred = 100;
       curhp = 100;
       maxhp = 100;
       lvl = 0;
       name = "Tyrone";
    }
    
    public Nigger(int param_curexp, int param_maxexp ,int param_curhatred, int param_maxhatred, int param_curhp, int param_maxhp, String param_name, int param_level)
    {
       maxexp = param_maxexp;
       curexp = param_curexp;
       curhatred = param_curhatred;
       maxhatred = param_maxhatred;
       curhp = param_curhp;
       maxhp = param_maxhp;
       lvl = param_level;
       name = param_name;
    }
    
    public int getCurExp()
    {
        return curexp;
    }
    public int getCurHatred()
    {
        return curhatred;
    }
    public int getMaxHatred()
    {
        return maxhatred;
    }
    public int getCurHp()
    {
        return curhp;
    }
    public int getMaxHp()
    {
        return curhp;
    }
    public int getMaxExp()
    {
        return maxexp;
    }
    public int getLevel()
    {
        return lvl;
    }
    public String getName()
    {
        return name;
    }
    
    //this method prints all the stats ofone nigger
    
    public void printStats()
    {
        System.out.println("NAME: " + getName());
        System.out.println("LVL: " + getLevel());
        System.out.println("HP: " + getCurHp() + "//" + getMaxHp());
        System.out.println("EXP: " + getCurExp() + "//" + getMaxExp());
        System.out.println("HATRED: " + getCurHatred() + "//" + getMaxHatred());
        System.out.println("______________________________________________________");
        
    }
    //This is a test string
    public String toString()
    {
        return "test";
    }
}
