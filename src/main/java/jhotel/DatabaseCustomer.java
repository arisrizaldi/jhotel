package jhotel;
import java.util.ArrayList;

/**
 * Class DatabaseCustomer
 *
 * @author Muhammad Aris Rizaldi
 * @version 19/4/2018
 */
public class DatabaseCustomer
{
    //Bagian disini menunjukan Variabel-variabel pada class
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int LAST_CUSTOMER_ID = 0;
    //Methode bagian sini akan dibenarkan, sampai modul integrasi database dengan java

    public static ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID() {
        return LAST_CUSTOMER_ID;
    }


    /**
     * Merupakan metode yang akan digunakan pada link database
     * dengan customer untuk menambah customer kepada database
     */
    public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if(cust.getID() == baru.getID() || cust.getEmail().equals(baru.getEmail())){
                throw new PelangganSudahAdaException(baru);
            }
        }
        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID = baru.getID();
        return true;
    }

    public static Customer getCustomer(int id){
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if (cust.getID() == id) return cust;
        }
        return null;
    }

    public static Customer getCustomerLogin(String email, String password){

        for (Customer pelanggan : CUSTOMER_DATABASE)
        {
            if (pelanggan.getEmail() == email && pelanggan.getPassword() == password)
            {
                return pelanggan;
            }
        }
        return null;
    }



    /**
     * Merupakan metode yang akan digunakan pada link database
     * dengan customer untuk menghapus customer kepada database
     */
    public static boolean removeCustomer(int id) throws PelangganTidakDitemukanException {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if(cust.getID()==id){
                for (Pesanan pesan :
                        DatabasePesanan.getPesananDatabase()) {
                    if(pesan.getPelanggan().equals(cust)) {
                        try{
                            DatabasePesanan.removePesanan(pesan);
                        }
                        catch(PesananTidakDitemukanException e){

                        }
                    }
                }
                CUSTOMER_DATABASE.remove(cust);
                return true;
            }
        }
        throw new PelangganTidakDitemukanException(id);
    }

}