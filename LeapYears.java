import java.util.Scanner;
/**
 * Write a description of class LeapYears here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LeapYears
{
    public static void year()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("put any year: ");
        int year = s.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            System.out.println("the year " + year +" is a leap year.");
        }
        else
        System.out.println("the year " + year + " is not a leap year");
    }
}