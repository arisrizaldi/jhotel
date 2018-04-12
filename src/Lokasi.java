
/**
 * Class Lokasi berisi tentang data-data Lokasi Hotel.
 *
 * @author Muhammad Aris Rizaldi_1506673643
 * @version 2018.04.12
 */
public class Lokasi
{
    // instance variables
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;
    private String string;

    public Lokasi()
    {
        //
    }
    
    /**
     * Constructor for objects of class Lokasi.
     * 
     * @param x_coord
     * @param y_coord
     * @param deskripsiLokasi
     */
    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi)
    {
        // instance variables
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    }
    
    /**
     * Accessor for objects of class Lokasi
     * untuk mendapatkan nilai X.
     * 
     * @return x_coord
     */
    public float getX()
    {
        return x_coord;
    }
    
    /**
     * Accessor for objects of class Lokasi
     * untuk mendapatkan nilai Y.
     * 
     * @return y_coord
     */
    public float getY()
    {
        return y_coord;
    }
    
    /**
     * Accessor for objects of class Lokasi
     * untuk mendapatkan nilai X.
     * 
     * @return deskripsiLokasi
     */
    public String getDeskripsi()
    {
        return deskripsiLokasi;
    }
    
    /**
     * Mutator for objects of class Lokasi
     * untuk menentukan nilai X.
     * 
     * @param x_coord
     */
    public void setX(float x_coord)
    {
        this.x_coord = x_coord;
    }
    
    /**
     * Mutator for objects of class Lokasi
     * untuk menentukan nilai Y.
     * 
     * @param y_coord
     */
    public void setY(float y_coord)
    {
        this.y_coord = y_coord;
    }
    
    /**
     * Mutator for objects of class Lokasi
     * untuk menentukan nilai deskripsi.
     * 
     * @param deskripsi
     */
    public void setDeskripsi(String deskripsi)
    {
        deskripsiLokasi = deskripsi;
    }
    
    public String toString()
    {
        return"Lokasi"+
              "\nKoordinat X    : " +x_coord+
              "\nKoordinat Y    : " +y_coord+
              "\nDeskripsi      : " +deskripsiLokasi+
              "\n";
    }
}