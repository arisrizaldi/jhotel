
/**
 * Enumeration class StatusKamar - berisi status-status kamar pada JHotel.
 *
 * @author (your name here)
 * @version (version number or date here)
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


