package jhotel;
/**
 * Ini adalah kelas tipe enum yang menyediakan tipe kamar.
 * @author Muhammad Aris Rizaldi
 * @version 20-5-2K18
 * @since April 2018
 */
public enum TipeKamar
{
    SINGLE("Single"),
    DOUBLE("Double"),
    PREMIUM("Premium");
    
    private String deskripsi;
    /**
     *@param tipe adalah parameter yang menyimpan tipe kamar
     */
    TipeKamar(String tipe){
    this.deskripsi=tipe;
    }
    
    public String toString(){
        return deskripsi;
    
    }
    
}
