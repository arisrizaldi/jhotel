
/**
 * Write a description of class Hotel here.
 *
 * @author (Muhammad Aris Rizaldi_1506673643)
 * @version (2018.03.01)
 */
public class Hotel
{
    // instance variables - replace the example below with your own
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    /**
     * Constructor for objects of class Hotel
     * @param nama, lokasi, bintang.
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        // instance variables - replace the example below with your own
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
    }
    
    /**
     * Accessor for objects of class Hotel
     * untuk mendapatkan nilai bintang
     * @return bintang.
     */
    public int getBintang()
    {
        return bintang;
    }
    /**
     * Accessor for objects of class Hotel
     * untuk mendapatkan nilai nama
     * @return nama.
     */
    public String getNama()
   {
       return nama;
   }
   
   /**
     * Accessor for objects of class Hotel
     * untuk mendapatkan nilai lokasi
     * @return lokasi.
     */
   public Lokasi getLokasi()
   {
       return lokasi;
    }
   
    /**
     * Mutator for objects of class Hotel
     * untuk menentukan nilai nama
     * @param nama.
     */
    public void setNama(String nama)
   {
       this.nama = nama;
       
    }
    
    /**
     * Mutator for objects of class Hotel
     * untuk menentukan nilai lokasi
     * @param lokasi.
     */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }
    
    /**
     * Mutator for objects of class Hotel
     * untuk menentukan nilai bintang
     * @param bintang.
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }
    /**
     * untuk mencetak data
     */
    public void printData()
    {
        System.out.println("Nama Hotel: "+getNama() + "\nLokasi: "+ lokasi.getDeskripsi() + "\nBintang Hotel: "+getBintang()); 
    }
}