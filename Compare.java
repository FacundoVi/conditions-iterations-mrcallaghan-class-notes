
/**
 * Write a description of class Compare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Compare
{
    static String word1 = "catalog";
    static String word2 = "cat";
    static String word3 = "aaa";
    public static void comp()
    {
        int result1 = word1.compareTo(word3);
        if (result1 < 0)
        {
            System.out.println("condition 1 is true");
        }
        else
        {
            System.out.println("condition 1 is false");
        }
        
        int result2 = word1.compareTo(word2);
        if (result2 == 0)
        {
            System.out.println("condition 2 is true");
        }
        else
        {
            System.out.println("condition 2 is false");
        }
        
        if (result2 < 0)
        {
            System.out.println("condition 3 is true");
        }
        else
        {
            System.out.println("condition 3 is false");
        }
        String w1 = word1.substring(0,3);
        String w2 = word2.substring(0,3);
        if (w1.equals(w2))
        {
            System.out.println("condition 4 is true");
        }
        else
        {
            System.out.println("condition 4 is false");
        }
    }
}
