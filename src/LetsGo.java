import java.util.*;
/**
 * Write a description of class LetsGo here.
 *
 * @author Muhammad Aris Rizaldi
 * @version 19/4/2018
 */
public class LetsGo
{
   public static int delay1, delay2, delay3;
   private static Random rand = new Random();    

    public static void main(String[] args)
    {
        RunForYourLife Lionel = new RunForYourLife("Lionel");
        delay1 = rand.nextInt((500-100)+1)+100;
        Lionel.setDelay(delay1);
        Lionel.start();
        
        RunForYourLife Andreas = new RunForYourLife("Andreas");
        delay2 = rand.nextInt((delay1-13)+69)+100;
        Andreas.setDelay(delay2);        
        Andreas.start();
        
        RunForYourLife Messi = new RunForYourLife("Messi");
        delay3 = rand.nextInt((delay2-13)+69)+100;
        Messi.setDelay(delay3);        
        Messi.start();
    }
}
