
/**
 * Write a description of class Middle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Middle extends Student
{
    public Middle()
    {
        super();
    }
    
    public void printLunch() {
        super.printLunch(1);
        System.out.println("You go to lunch during first block.");
    }

    public void printChapel()
    {
        System.out.println("You go to Chapel on even days.");
    }
}
