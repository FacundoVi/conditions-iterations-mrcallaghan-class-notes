import java.util.Scanner;
/**
 * Write a description of class CircleIOverlap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CircleOverplap
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      double xcenter1 = 0;
      double ycenter1 = 0;
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      double xcenter2 = 40;
      double ycenter2 = 0;

      if (xcenter1 + radius1 > xcenter2 - radius2)
      {
          System.out.println("they overlap each other");
      }
      else if (xcenter1 + radius1 < xcenter2 - radius2)
      System.out.println("they are disjointed");
      else if (xcenter1 + radius1 == xcenter2 - radius2)
      System.out.println("they are mutually contained");
   }
}