package jhotel;
/**
 * Enumeration class StatusKamar - write a description of the enum class here
 *
 * @author Muhammad Aris Rizaldi
 * @version (version number or date here)
 */
public enum StatusKamar
{
    BOOKED("Booked"),PROCESSED("Processed"),VACANT("Vacant");
    
    private final String status;
    

    StatusKamar(String status)
    {
        this.status=status;
    }

    public String toString()
    {
        return this.status;
    }
}
