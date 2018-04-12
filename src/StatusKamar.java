
/**
 * Enumeration class StatusKamar - berisi status-status kamar pada JHotel.
 *
 * @author Muhammad Aris Rizaldi_1506673643
 * @version 2018.04.12
 */
public enum StatusKamar
{
    Booked("Booked"), Processed("Processed"), Vacant("Vacant");
    
    private String deskripsi;
    
    StatusKamar(String deskripsi)
    {
        this.deskripsi = deskripsi;
    }
    
    public String toString()
    {
        return deskripsi;
    }
}
