
/**
 * Write a description of class Pesanan here.
 *
 * @author (Muhammad Aris Rizaldi_1506673643)
 * @version (2018.03.01)
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;

    /**
     * Constructor for objects of class Pesanan
     * @param biaya, pelanggan.
     */
    public Pesanan(double biaya, Customer pelanggan)
    {
        // instance variables
        this.biaya = biaya;
        this.pelanggan = pelanggan;
        
    }

    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai biaya
     * @return biaya.
     */
    public double getBiaya()
    {
        return biaya;
    }
    
    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai pelanggan
     * @return pelanggan.
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    
    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai statusdiproses
     * @return statusdiproses.
     */
    public boolean getStatusDiproses()
    {
        return isDiproses;
    }
    
    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai statusselesai
     * @return statusselesai.
     */
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }
    
    public Room getRoom()
    {
        return kamar;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai biaya
     * @param biaya.
     */
    public void setBiaya(double biaya)
    {
        this.biaya = biaya;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai pelanggan
     * @param baru.
     */
    public void setPelanggan(Customer baru)
    {
        pelanggan = baru;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai statusdiproses
     * @param diproses.
     */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai statusselesai
     * @param diproses.
     */
    public void setStatusSelesai(boolean diproses)
    {
        isSelesai = diproses;
    }
    public void setRoom(Room kamar)
    {
        this.kamar = kamar;
    }

    /**
     * untuk mencetak data
     */
    public void printData()
    {
        System.out.println(biaya);
    }
    
    
    
    
}
