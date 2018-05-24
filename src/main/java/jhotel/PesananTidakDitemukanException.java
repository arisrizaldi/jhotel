package jhotel;
/**
 * @author Muhammad Aris Rizaldi
 * @version 20-5-2K18
 * @exception PesananTidakDitemukanException kelas turunan Exception yang berfungsi untuk menangani
 * bila pesanan yang ingin dihapus tidak ditemukan dalam database Pesanan
 * @since April 2018
 *
 */
public class PesananTidakDitemukanException extends Exception
{
    private Customer pelanggan_error;
    /**
     * Constructor object kelas PesananTidakDitemukanException
     * @param pelanggan_input adalah parameter dengan tipe object dari kelas Customer
     *
     */
    public PesananTidakDitemukanException(Customer pelanggan_input){
        super("Pesanan yang dipesan oleh :");
        pelanggan_error=pelanggan_input;
    }

    public String getPesan(){
        return super.getMessage() + pelanggan_error.getNama() + " tidak ditemukan.";
    }
}
