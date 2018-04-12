
/**
 * Class SingleRoom untuk tipe room single.
 *
 * @author Muhammad Aris Rizaldi_1506673643
 * @version 2018.04.12
 */
public class SingleRoom extends Room
{
    // instance variables - replace the example below with your ow
    private static TipeKamar TIPE_KAMAR = TipeKamar.Single;
    
    public SingleRoom()
    {
        //
    }
    
    /**
     * Constructor for objects of class SingleRoom
     */
    public SingleRoom(Hotel hotel, String nomor_kamar, StatusKamar status_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar, status_kamar);
    }
    
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }
}
