
/**
 * Class Room untuk pendataan ruangan pada JHotel.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Room
{
    // instance variables - replace the example below with your own
    private Hotel hotel;
    private String nomor_kamar;
    private boolean isAvailable;
    private StatusKamar status_kamar;
    private Pesanan pesan;
    public double dailyTariff;

    /**
     * Constructor for objects of class Room.
     * 
     * @param hotel
     * @param nomor_kamar
     * @param isAvailable
     * @param customer
     * @param dailyTariff
     * @param status_kamar
     */
    public Room(Hotel hotel, String nomor_kamar, boolean isAvailable, 
    StatusKamar status_kamar)
    {
        // initialise instance variables
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.isAvailable = isAvailable;
        //this.customer = customer;
        //this.dailyTariff = dailyTariff;
        this.status_kamar = status_kamar;
    }
    /**
     * untuk mendapatkan nilai hotel.
     * 
     * @return hotel
     */
    public Hotel getHotel()
    {
        return hotel;
    }
    
    
    
    /**
     * untuk mendapatkan nilai nomor kamar.
     * 
     * @return nomor_kamar
     */
    public String getNomorKamar()
    {
        return nomor_kamar;
    }
    
    /**
     * untuk mengetahui status ketersediaan kamar.
     * 
     * @return isAvailable
     */
    public boolean getStatusAvailable()
    {
        return isAvailable;
    }
    
    
    /**
     * untuk mendapatkan nilai tarif.
     * 
     * @return dailyTariff
     */
    public double getDailyTariff()
    {
        return dailyTariff;
    }
    
    /**
     * untuk mengetahui status kamar.
     * 
     * @return status_kamar
     */
    public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }
    
    /**
     * untuk mendapatkan nilai pesanan.
     * 
     * @return pesan
     */
    public Pesanan getPesanan()
    {
        return pesan;
    }
    
    public abstract TipeKamar getTipeKamar();
    
        
    
    /**
     * untuk menset nilai hotel.
     * 
     * @param hotel
     */
    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }
    
    
    /**
     * untuk menset nilai hotel.
     * 
     * @param hotel
     */
    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }
    
    /**
     * untuk menentukan status ketersediaan kamar.
     * 
     * @param isAvailable
     */
    public void setStatusAvailable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
    }
    
    
    /**
     * untuk menset nilai tarif.
     * 
     * @param dailytariff
     */
    public void setDailyTariff(double dailytariff)
    {
        dailyTariff = dailytariff;
    }
    
    /**
     * untuk menset nilai status kamar.
     * 
     * @param status_kamar
     */
    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar = status_kamar;
    }
    
    /**
     * untuk menset nilai pesanan.
     * 
     * @param pesan
     */
    public void setPesanan(Pesanan pesan)
    {
        this.pesan = pesan;
    }
    
    /**
     * untuk menampilkan data pada class Room.
     */
    public void printData()
    {
        System.out.printf("\nRoom\n");
        System.out.println("Nama Hotel: " +hotel.getNama());
        System.out.println("Nomor Kamar: " +nomor_kamar);
        System.out.println("Tersedia: " +isAvailable);
        
        System.out.println("Harga: " +dailyTariff);
   
        System.out.println("Status Kamar: " +status_kamar);
        System.out.println("Status layanan selesai: " +getTipeKamar());
    }

    
}