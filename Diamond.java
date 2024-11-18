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
        System.out.print("Select the sidelenght of your diamond: ");
        int l = s.nextInt();
        int b = 1;
        boolean tf = true;
        for (int a = 1; a <= l; a++)
        {
            for (int i = 1; i <= b; i++)
            {
                int q = l - a;
                if (tf == true)
                {
                    for (int c = 1; c <= q; c++){
                        System.out.print(" ");
                        tf = false;
                    }
                }
                System.out.print("*");
                
            }
            b += 2;
            tf = true;
            System.out.println();
        }
        /*for (int a = 1; a <=l; a++)
        {
            for (int i = b; i >= 2; i-=1)
            {
                int q = l-a;
                if (tf == true)
                {
                    for (int c = 1; c<=q; c++){
                        System.out.print(" ");
                        tf = false;
                    }
                }
                System.out.print("*");
            }
            b -= 2;
            tf = true;
            System.out.println();
        }
        */
    }
}
