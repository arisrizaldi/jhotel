
/**
 * Enumeration class TipeKamar - Membatasi tipe kamar
 *
 * @author Muhammad Aris Rizaldi
 * @version 19/4/2018
 */
public enum StatusKamar
{
    BOOKED("Booked"),PROCESSED("Processed"),VACANT("Vacant");
    
    private final String status;
    
    /**
     * Constructor StatusKamar
     * 
     * @param type merupakan status dalam string
     */
    StatusKamar(String status) {
        this.status=status;
    }
    
    /**
     * toString() - Method pengambilan String
     * 
     * @return type mengembalikkan status kamar sebagai string
     */
    public String toString() {
        return this.status;
    }
}
