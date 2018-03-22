
/**
 * Enumeration class TipeKamar - berisi tipe-tipe kamar pada JHotel.
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum TipeKamar
{
    Single("Single"), Double("Double"), Premium("Premium");
    
    private String deskripsi;
    private String tipe;
    
    TipeKamar(String deskripsi)
    {
       this.deskripsi = deskripsi;
    }
    
    public String toString()
    {
        return deskripsi;
    }
}
