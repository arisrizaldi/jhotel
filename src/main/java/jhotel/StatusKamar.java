package jhotel;
/**
 * Ini adalah kelas tipe enum yang menyediakan status kamar.
 * @author Muhammad Aris Rizaldi
 * @version 20-5-2K18
 * @since April 2018
 */
public enum StatusKamar
{
    BOOKED("Booked"),
    PROCESSED("Processed"),
    VACANT("Vacant");
    
    private String status;
    /**
     *@param status adalah parameter yang menyimpan status kamar
     */
    StatusKamar(String status){
    this.status=status;
    }
    
    public String toString(){
        return status;
    
    }
}
