import java.util.Scanner;

/**
 * Examples and notes on conditions (Chapter 5)
 *
 * @author mcallagha
 * @version 16nov2020
 */
public class Conditions
{
    public static void ifExample()
    {
        //model a coin flip; 1: Heads, 0: Tails
        int coinFlip = (int) (Math.random() * 2 ); // Math.random() returns 0.0 - 0.9999
        
        /*
         * if statement
         * 
         * Statements in the if block are executed if the condition is true.
         * 
         * Conditional expressions evaluate to either true or false.
         *  The conditional expressions must go inside of the parenthesis.
         *  (unlike python, there is no colon after the expression
         *  
         *  Statements are grouped by blocks (i.e., {}).
         *      (Unlike python, blocks are not defined by indentation)
         *      
         */
        if (coinFlip == 1)
        {
            System.out.println("coin is heads!");
        }
        
        /*
         * if, else statement
         * 
         * the else block is executed if the conditional expression is false.
         */
        if (coinFlip == 1)
        {
            System.out.println("coin is heads!");
        }
        else
        {
            System.out.println("coin is tails!");
        }
        /*
         * if, else if, else statement
         * 
         * (unlike python java uses "else if" instead of "elif")
         * 
         */
        
        int rollDice = (int) (Math.random() * 4) + 1;
        if (rollDice == 1)
        {   
            System.out.println("rooled a 1");
        }
        else if (rollDice == 2)
        {   
            System.out.println("rooled a 2");
        }
        else if (rollDice == 3)
        {
            System.out.println("rooled a 3");
        }
        else
        {
            System.out.println("rooled a 4");
        }
        
        /*
         * { } are not required for a single statement, however they are a good idea.
         *      Leaving them out, it can lead to bugs like this:
         */
        if (coinFlip == 0)
            System.out.println("Coin is tails still!");
            System.out.println("better luck next time");
            
    }
    
    public static boolean doubleAreEqual(double num1, double num2)
    {
        final double EPSILON = 1e-6;
        
        if (Math.abs(num1 - num2) < EPSILON)
        {
            return true;
        }
        else{
            return false;
        }
        //don't have to use if/else
        //return (Math.abs(num1 - num2) < EPSILION);
        
    }
    
    public static void stringExample()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter two words: ");
        String str1 = s.next();
        String str2 = s.next();
        
        /*
         * The equality operartor (==) returns true if the two variables (e.g. str1, str2)
         * contian the same value. For variables of a class type, includeing strings,
         * this means is that they must contian the same reference to be equal. That is, they refer
         * to the same object in memory, not htat the two string have the same sequence of characters
         */
        if(str1 == str2)
        {
            System.out.println("The string references are equal.");
        }
        else
        {
            System.out.println("The string references are not equal.");
        }
        
        /*
         * The equals method returns if tthe two objects referenced by the variables are 
         * "equal". What "equal" means is defined by the String Class. For strings,
         * it means they have the same sequence of characters.
         */
        if (str1.equals(str2))
        {
            System.out.println("The strings are equal(same sequence of characters).");
        }
        else
        {
            System.out.println("The strings are not equal.");
        }
        
        /*
         * if we want to check if the strings are not equal we can use the logical complement operateor
         * (e.g., !)
         */
        if (! str1.equals(str2))
        {
            System.out.print("Strings are NOT equal.");
        }
        
        /*
         * We eill determine wich string come first lexographically using the compareTo method of the
         * String class.
         * 
         * compareTo returns an int:
         * 0: if the strings are equal
         * <0: if  str1 < str2 lexigraphically
         * >0: if str1 > str2 lexigraphically
         */
        int result = str1.compareTo(str2);
        System.out.println("result of compareTo: " + result);
        String firstStr = null;
        if (result < 0)
        {
            firstStr = str1;
        }
        else if (result >0)
        {
            firstStr = str2;
        }
        
        if (firstStr != null)
        {
            System.out.println("The first string is " +firstStr);
        }
        else
        {
            System.out.println("The strings are equal.");
        }
        
        /*
         * this is an exa,ple of a "short circuit".
         * 
         * for an AND operator
         */
        if (firstStr != null && firstStr.length() > 3)
        {
            System.out.println("The first string has more than three characters.");
        }
        
        /*
         * this is another shorrt circuitr exampole.
         * 
         * FOr an OR operation, if the left operabd us tryue, the right operand will not be evaluatedf. this is 
         *  because we have already dtermined the OR operator will bve false.
         *  
         *  THis results in a bud if the first fruit is "kiwi".
         */
        System.out.print("Enter your two favorite fruits: ");
        if (s.next().equals("kiwi") || s.next().equals("kiwi"))
        {
            System.out.println("Yum! Kiwis!");
        }
        
        System.out.print("Enter your favorite ice cream flavor: ");
        String flavor = s.next();
        System.out.println("Favorite ice cream flavor is " + flavor);
    }
    
    /*
     * 1) word1 is lexogrphically greter than. "aaa"
     * 2)
     */
    
}
