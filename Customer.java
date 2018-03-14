
/**
 * Write a description of class Customer here.
 *
 * @author (Muhammad Aris Rizaldi_1506673643)
 * @version (2018.03.01)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    protected int id;
    protected String nama;

    /**
     * Constructor for objects of class Customer.
     * 
     * @param id
     * @param nama
     */
    public Customer(int id, String nama)
    {
        // instance variables - replace the example below with your own
        this.id = id;
        this.nama = nama;
        
    }
    
    /**
     * Accessor for objects of class Customer
     * untuk mendapatkan nilai id
     * @return id.
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * Accessor for objects of class Customer
     * untuk mendapatkan nilai nama
     * @return nama.
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * Mutator for objects of class Customer
     * untuk menentukan nilai id
     * @param id.
     */
    public void setID(int id)
    {
        this.id = id;
    }
    
    /**
     * Mutator for objects of class Customer
     * untuk menentukan nilai nama
     * @param nama.
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    /**
     * untuk mencetak data
     */
    public void printData()
    {
        System.out.printf("\nCustomer\n");
        System.out.println("ID: " +id);
        System.out.println("Nama: " +nama);
    }
    
    

    
    
}
