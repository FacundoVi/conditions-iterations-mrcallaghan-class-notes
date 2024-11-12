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
        for (int x = l; x <= 3;)
        {
            for (int a =0; a <= 3 - l; a++)
            {
                System.out.println(w.substring(x, a));
            }
        }
    }
}
