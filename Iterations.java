import java.util.Scanner;


/**
 * Examples and notes on iterations (Chapter 6)
 *
 * @author gcschmit
 * @version 16nov2020
 */
public class Iterations
{
    public static void whileExample()
    {
        /*
         * while loop
         * 
         * evaluates a condition
         *      if true, executes the body of code in the loop and then re-evaluate the condition
         *      if false, skips the body and continues program
         *     
         */
        int count =1;       //initializes
        while (count<=5)    //condition
        {
            System.out.println(count);  //body
            
            count++;                    // update the loop variable
        }
        
        System.out.println("done");
    }
    
    public static void whileExample2()
    {
        
        
        /*
         * this is an examle of an infinite loop!
         * 
         * A better condtion would be <=50
         *  while (count <=50)
         */int count = 1;
        while (count != 50)
        {
            System.out.println(count);
            count += 2;
        }
        
        System.out.println("done");
    }
}
