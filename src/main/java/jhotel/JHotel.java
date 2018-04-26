package jhotel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

/**
 * Class Hotel
 *
 * @author Muhammad Aris Rizaldi
 * @version 26/4/2018
 */
public class JHotel
{   
    /**
     * Merupakan metode main dari Applikasi JHotel
     * 
     * @param args argumen untuk main
     */
    public static void main(String[] args) throws RoomSudahAdaException, HotelSudahAdaException {
        SpringApplication.run(JHotel.class, args);
        Lokasi siji = new Lokasi ( 6, 6, "Surga");
        Lokasi loro = new Lokasi ( 1, 1, "Kane");
        Lokasi telu = new Lokasi ( 9, 9, "Maknyus");

        Hotel surga = new Hotel ("Surgawi", siji, 10);
        Hotel kane = new Hotel ( "Kane", loro, 3);

        Room jh1 = new PremiumRoom(surga, "jh1");
        DatabaseRoom.addRoom(jh1);
        Room jh2 = new PremiumRoom(kane, "jh2");
        DatabaseRoom.addRoom(jh2);
        Room jh3 = new PremiumRoom(surga, "jh3");
        DatabaseRoom.addRoom(jh3);
    }


    /**
     * Constructor dari Class JHotel
     */
    public JHotel(){
    }
}
