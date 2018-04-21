import java.util.*;
/**
 * Write a description of class RunForYourLife here.
 *
 * @author Muhammad Aris Rizaldi
 * @version 19/4/2018
 */
public class RunForYourLife implements Runnable
{
    private Thread checkpoint;
    private String peserta;
    private Random acak;
    private boolean test=true;
    private int delay;

    public RunForYourLife(String nama)
    {
        peserta = nama;
        System.out.println(peserta + ", ready.");
    }

  
    public void start()
    {
        System.out.println(peserta + ", set...");
        checkpoint = new Thread(this,peserta);
        checkpoint.start();
    }
    
    public void setDelay (int delay)
    {
        delay = this.delay;
    }
    
    public void run()
    {
        System.out.println(peserta + " go!");                       
        try
        {    
            for(int checkpoint=1;checkpoint<=20;checkpoint++)
            {
                System.out.println(peserta+" has passed checkpoint"+"("+checkpoint+")");
                Thread.sleep(delay);
            }
        }
        catch(InterruptedException e)
        {
            test=true;
            System.out.println(peserta+"was interrupted");
        }
        System.out.println(peserta+" has finished");
    }
}
