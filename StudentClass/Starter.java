
/**
 * Write a description of class Starter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Starter
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your graduation year: ");
        int gradYear = scan.nextInt();
        Student stud = new Student(gradYear);
    }
}
