
/**
 * Merupakan subclass room
 *
 * @author Muhammad Aris Rizaldi 1506673643
 * @version 18/04/2018
 */
public class SingleRoom extends Room
{
    // instance variables - replace the example below with your own
    private static TipeKamar TIPE_KAMAR = TipeKamar.SINGLE;

    /**
     * Constructor for objects of class SingleRoom
     */
    public SingleRoom(Hotel hotel,String nomor_kamar,StatusKamar status_kamar) {
        super(hotel, nomor_kamar, status_kamar);
        
    }
    
    /**
     * Method accessor untuk tipe kamar
     * 
     * @return TIPE_KAMAR mengembalikkan tipekamar
     */
    public TipeKamar getTipeKamar(){
        return TIPE_KAMAR;
    }
}
