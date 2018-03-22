import java.util.*;
import java.util.regex.*;
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
    protected String email;
    protected Date dob;
    static Calendar cal;
    

    /**
     * Constructor for objects of class Customer.
     * 
     * @param id
     * @param nama
     */
    public Customer(int id, String nama, int tanggal, int bulan, int tahun)
    {
        // instance variables - replace the example below with your own
        this.id = id;
        this.nama = nama;
        this.dob = new GregorianCalendar(tahun,bulan,tanggal).getTime();
    }
    public Customer(int id, String nama, Date dob)
    {
        // instance variables - replace the example below with your own
        this.id = id;
        this.nama = nama;
        this.dob = dob;
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
    public String getEmail()
    {
        return email;
    }
    
    public Date getDOB()
    {
        return dob;
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
    
    public void setEmail(String email){
        Pattern p;
        Matcher m;
        String emailPattern="^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        p=Pattern.compile(emailPattern);
        m=p.matcher(email);
        if(m.matches())
        this.email=email;
        else {
        System.out.println("Terjadi eror!");
        this.email=null;}
    }
    /**
     * untuk mencetak data
     */
    //public void printData()
    //{
        //System.out.printf("\nCustomer\n");
        //System.out.println("ID: " +id);
        //System.out.println("Nama: " +nama);
    //}
    
    

    
    
}
