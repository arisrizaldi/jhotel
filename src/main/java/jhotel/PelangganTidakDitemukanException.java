package jhotel;
/**
 * @author Muhammad Aris Rizaldi
 * @version 20-5-2K18
 * @exception PelangganTidakDitemukanException exception untuk menangani bila object Customer
 * yang akan dihapus dari DatabaseCustomer tidak ditemukan.
 * @since April 2018
 */
public class PelangganTidakDitemukanException extends Exception {
    private int pelanggan_error;
    public PelangganTidakDitemukanException(int pelanggan_input){
        super("Data Customer dengan ID :");
        pelanggan_error=pelanggan_input;
    }
    public String getPesan(){
        return super.getMessage() + pelanggan_error + "tidak ditemukan";
    }
}
