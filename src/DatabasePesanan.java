import java.util.ArrayList;

/**
 * berisi database pesanan.
 *
 * @author Muhammad Aris Rizaldi_1506673643
 * @version 2018.04.12
 */
public class DatabasePesanan
{
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;

    public static ArrayList<Pesanan> getPesananDatabase()
    {
        return PESANAN_DATABASE;
    }

    public static int getLastPesananId()
    {
        return LAST_PESANAN_ID;
    }

    public static boolean addPesanan(Pesanan baru)
    {
        //Pesanan baru = baru.getStatusAkrif();

        if (baru.getStatusAkrif() == false) {
            PESANAN_DATABASE.add(baru);
            return true;
        }
        else{
            return false;
        }
        //list_pesanan = baru;
        //return false;
    }

    /** 
    *
    */

    /*
    public static boolean removePesanan()
    {   
        list_pesanan = null;
        return false;
    }
    */
    
    /** 
    * Method yang digunakan untuk mengambil data pemesanan.
    * @return Pesanan mengembalikan data pemesanan.
    */

    public static Pesanan getPesanan(int id)
    {
        for(int i=0;i < PESANAN_DATABASE.size();i++){
            if(PESANAN_DATABASE.get(i).getId() == id){
                exist=true;
                break;
            }
        }

        for(id : PESANAN_DATABASE){
            if (id == )
            //return Pesanan;
        }
        return id;
    }
    public static Pesanan getPesanan(Customer cust)
    {
        return list_pesanan;
    }

    /*
    /** 
    * Method yang digunakan untuk mengambil data pesanan dari dalam database.
    * @return String[] mengembalikan data dari database.
    */

    /*
    public static String[] getPesananDatabase()
    {
        return null;
    }
    */

    /** 
    * Method yang digunakan untuk membatalkan pesanan.
    * @param Pesanan pesanan yang dibatalkan.
    */
    
    public static void pesananDibatalkan(Pesanan pesan)
    {
        
    }
}
