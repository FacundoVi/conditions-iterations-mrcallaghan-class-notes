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
        for (int x = 0; x < l; x++)
        {
            for (int a =0; a < l - x; a++)
            {
                System.out.println(w.substring(a, a + x + 1));
                
            }
        }
    }
}
