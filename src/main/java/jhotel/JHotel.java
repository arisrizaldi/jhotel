package jhotel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

/**
 * Class Hotel
 *
 * @author Muhammad Aris Rizaldi
 * @version 19/4/2018
 */



public class JHotel
{   
    /**
     * Merupakan metode main dari Applikasi JHotel
     * 
     * @param args argumen untuk main
     */
    public static void main(String[] args) {
        SpringApplication.run(JHotel.class, args);
    }


    /**
     * Constructor dari Class JHotel
     */
    public JHotel(){
    }
}
