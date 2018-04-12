
/**
 * Enumeration class TipeKamar - berisi tipe-tipe kamar pada JHotel.
 *
 * @author Muhammad Aris Rizaldi_1506673643
 * @version 2018.04.12
 */
public enum TipeKamar
{
    Single("Single"), Double("Double"), Premium("Premium");
    
    private String deskripsi;
    
    TipeKamar(String deskripsi)
    {
        this.deskripsi = deskripsi;
    }
    
    public String toString()
    {
        return deskripsi;
    }
}
