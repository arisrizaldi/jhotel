
/**
 * class JHotel sebagai class utama.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JHotel
{
    // instance variables - replace the example below with your own
   

    /**
     * Main method untuk class JHotel.
     * 
     * @param args[]
     */
    public static void main(String[] args)
    {
       
       Lokasi l = new Lokasi(13,13,"Asyik");
        
       Hotel h = new Hotel("Sukasuka",l,3);
       SingleRoom sr = new SingleRoom(h,"973",true,StatusKamar.Booked);
       Customer c = new Customer(22,"Aris");
       Room r = sr;
      
       
       Pesanan p = new Pesanan(3,c,r);
       
       System.out.println("Welcome to JHotel");
         l.printData(); 
         c.printData();
         h.printData();
         
         Administrasi.pesananDitugaskan(p,r);
         r.printData(); 
         p.printData();
       
       
        /*modul3
        Lokasi lokasi = new Lokasi(10,11,"kota hujan");
        Customer customer = new Customer(1, "Aris");
        Hotel hotel = new Hotel("Hotel Aris", lokasi, 5);
        Room room = new Room(hotel, "13", true, customer, 155000, StatusKamar.Vacant);
        Pesanan pesan = new Pesanan(555000, customer);
        pesan.setTipeKamar(TipeKamar.Single);
        
    
         System.out.println("Welcome to JHotel");
         lokasi.printData(); 
         customer.printData();
         hotel.printData();
        
         System.out.println("\n====================Method 1====================");
        
         Administrasi.pesananDitugaskan(pesan, room);
        room.printData();
        pesan.printData();
        
        System.out.println("\n====================Method 2====================");
        
        
        Administrasi.pesananDibatalkan(room);
        room.printData();
        pesan.printData();
        
       
        Administrasi.pesananDitugaskan(pesan, room);
        System.out.println("\n====================Method 3====================");
       Administrasi.pesananDibatalkan(pesan);
        room.printData();
        pesan.printData();
        
        Administrasi.pesananDitugaskan(pesan, room);
        
        System.out.println("\n====================Method 4====================");
        Administrasi.pesananSelesai(room);
        room.printData();
        pesan.printData();
        
        Administrasi.pesananDitugaskan(pesan, room);
        System.out.println("\n====================Method 5====================");
        Administrasi.pesananSelesai(pesan);
        room.printData();
        pesan.printData();
        
        
        */


        

    }
    /**
     * Constructor untuk class JHotel.
     */
    public JHotel()
    {
        // initialise instance variables
        
        
    }
    

    
}
