package jhotel;
/**
 * Ini adalah kelas turunan dari kelas Room yaitu menyediakan tipe kamar DoubleRoom
 * @author Muhammad Aris Rizaldi
 * @version 20-5-2K18
 */
public class DoubleRoom extends Room
{
    // instance variables
    private Customer customer2;
    private static final TipeKamar TIPE_KAMAR = TipeKamar.DOUBLE;

    /**
     * Constructor for objects of class DoubleRoom
     */
    public DoubleRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel, nomor_kamar);
    }

    public Customer getCustomer2()
    {
        return customer2;
    }
    
    public TipeKamar getTipeKamar(){
        return TIPE_KAMAR;
    }
    
    public void setCustomer2(Customer customer2)
    {
        this.customer2=customer2;
    }
}
