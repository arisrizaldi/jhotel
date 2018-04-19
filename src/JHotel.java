/**
 *
 *
 * @author Muhammad Aris Rizaldi 1506673643
 * @version 18/04/2018
 */
import java.util.*;

public class JHotel {
    /**
     * Merupakan metode main dari Applikasi JHotel
     *
     * @param args argumen untuk main
     */
    public static void main(String[] args) {
        DatabaseCustomer.addCustomer(new Customer("Aris Rizaldi", 12, 1, 2015));
        DatabaseCustomer.addCustomer(new Customer("Bang Toni Garut", 13, 2, 2016));
        DatabaseCustomer.addCustomer(new Customer("Marion Jola", 14, 3, 2017));

        for (Customer c : DatabaseCustomer.getCustomerDatabase()) {

            System.out.println(c);

        }
        DatabaseHotel.addHotel(new Hotel("Parama", new Lokasi(1234, 4567, "adem"), 5));
        DatabaseHotel.addHotel(new Hotel("Bali", new Lokasi(4321, 7645, "anget"), 4));
        DatabaseHotel.addHotel(new Hotel("Puncak", new Lokasi(2314, 7654, "asoy"), 3));

        for (Hotel h : DatabaseHotel.getHotelDatabase()) {

            System.out.println(h);
        }
        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "1", StatusKamar.VACANT));
        DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2), "2", StatusKamar.VACANT));
        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3), "3", StatusKamar.VACANT));

        for (Room r : DatabaseRoom.getRoomDatbabse()) {
            System.out.println(r);
        }


    }

    /**
     * Constructor dari Class JHotel
     */
    public JHotel() {

    }

}