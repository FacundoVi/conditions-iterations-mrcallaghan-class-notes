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
    
    public static void forExample()
    {
        /*
         * for loop:
         * 
         *  three parts of the for statement/
         *      1.initialization = executed once
         *      2. condition = boolean expression evaluated at the start of the loop and each iteration
         *      3.update the loop variable =- executed at the "end" of each iteration (before the condition is reevaluated)
         */
        
        
        for (int count = 1;     //initialization
            count <= 5;         //condition
            count++)            //update the loop variable
        {
            System.out.println(count);  //body
        }
        
        System.out.println("done.");
        /*
         * variables declared withing the schope of the for statement are scoped to the statement and the loop body/
         */
        //System.out.println("the final value of count is: " + count); 
    }
    
    public static void offByOne()
    {
        for (int i = 0;
            i <= 5;
            i++)
        {
            System.out.println("*");
        }
        System.out.println("done.");
    }
    
    
    
    
    public static void doExample()
    {
        /*
         * do loop (do-while)
         *  
         *      1. executes the body of the loop first
         *      2. evaluates the condition:
         *          if true, execute the body again
         *          if false, continues execution after the loop
         */
        int count = 1;//initalization
        do
        {
            System.out.println(count); //body
            count += 1; //update the loop variable
        }
        while (count <= 5); //condition
        
        System.out.println("done");
    }
}
