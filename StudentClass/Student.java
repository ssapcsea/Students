
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    public int gradYear;
    public Student() {
    }
    
    public Student(int input) {
        gradYear = input; 
        if (gradYear > 2021) {
            Middle mid = new Middle();
            mid.printChapel();
            mid.printLunch();
        } else {
            Upper up = new Upper(); 
            up.printChapel();
            up.printLunch();
        }
    }
    
    public void printChapel() {
    }
    
    public void printLunch(int num) {
        if (num == 1)
            System.out.println("You go to lunch in the Tierny Dinning Hall.");
    }
}
