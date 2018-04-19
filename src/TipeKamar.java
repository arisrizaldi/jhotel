
/**
 * Enumeration class TipeKamar - Membatasi tipe kamar
 *
 * @author Muhammad Aris Rizaldi
 * @version 19/4/2018
 */
public enum TipeKamar
{
    SINGLE("Single"),DOUBLE("Double"),PREMIUM("Premium");
    
    private final String type;
    
    /**
     * Constructor TipeKamar
     * 
     * @param type merupakan tipe kamar dalam string
     */
    TipeKamar(String type)
    {
        this.type=type;
    }
    
    /**
     * toString() - Method pengambilan String
     * 
     * @return type mengembalikkan tipe kamar sebagai string
     */
    public String toString()
    {
        return this.type;
    }
}
