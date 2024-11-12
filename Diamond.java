import java.util.Scanner;
/**
 * Write a description of class Diamond here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Diamond
{
    public static void diamond()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Select the lenght of your diamond: ");
        int l = s.nextInt();
        for (int a = 1; a <= l; a++)
        {
            for (int i = 1; i <= a; i++)
            {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}
