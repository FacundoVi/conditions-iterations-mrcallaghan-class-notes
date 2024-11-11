
/**
 * Write a description of class NestedLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedLoops
{
    public static void nested()
    {
        for (int i = 1; i <= 2; i++)
        {
            for (int n = 1; n <=4; n++)
            {
                System.out.println(i + " " + n);
            }
        }
        int a = 1;
        while (a <= 2)
        {
            int b = 0;
            while (b < 4)
            {
                
                b += 1;
                System.out.println(a + " " + b);
            }
            a += 1;
        }
    }
}
