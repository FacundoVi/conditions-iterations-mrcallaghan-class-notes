import java.util.Scanner;
/**
 * Write a description of class Substrins here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Substrins
{
    public static void subtring()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter a word: ");
        String w = s.next();
        int l = w.length();
        for (int x = 1; x <= l; x++)
        {
            int i =1;
            while (x <= l && i <= l)
            {
                i++;
                System.out.println(x);
            }
            
        }
    }
}
