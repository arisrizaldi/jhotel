
/**
 * Write a description of class JHotel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JHotel
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class JHotel
     */
    public static void main(String[] args)
    {
       
        Lokasi objekLokasi = new Lokasi(10,11,"kota hujan");
        Hotel objekHotel = new Hotel("Hotel Aris", objekLokasi, 5);
        Customer objekCustomer = new Customer(1, "Aris");
        Room objekRoom = new Room(objekHotel, "13", true, objekCustomer, 155000, StatusKamar.Vacant);
        Pesanan objekPesanan = new Pesanan(555000, objekCustomer);
        
    
         
         objekLokasi.printData(); 
         objekCustomer.printData();
         objekHotel.printData();
        

        Administrasi.pesananDitugaskan(objekPesanan, objekRoom);
        
        objekPesanan.printData();
        objekRoom.printData();
        
        Administrasi.pesananDibatalkan(objekRoom);
       objekPesanan.printData();
        objekRoom.printData();
        
        
        Administrasi.pesananDitugaskan(objekPesanan, objekRoom);
        
        Administrasi.pesananSelesai(objekRoom);
        objekPesanan.printData();
        objekRoom.printData();
        
        Administrasi.pesananDitugaskan(objekPesanan, objekRoom);
        
        Administrasi.pesananDibatalkan(objekPesanan);
        objekPesanan.printData();
        objekRoom.printData();
        
        Administrasi.pesananDitugaskan(objekPesanan, objekRoom);
        
        Administrasi.pesananSelesai(objekPesanan);
        objekPesanan.printData();
        objekRoom.printData();
        
        
        
        


        

    }
    public JHotel()
    {
        // initialise instance variables
        
        
    }
    

    
}
