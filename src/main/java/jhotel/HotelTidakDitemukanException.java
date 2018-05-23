package jhotel;
/**
 * @author Muhammad Aris Rizaldi
 * @version 20-5-2K18
 * @exception HotelTidakDitemukanException kelas yang berfungsi untuk menangani bila
 * hotel yang akan dihapus dari databasse tidak ditemukan
 * @since April 2018
 */
public class HotelTidakDitemukanException extends Exception {
    private int hotel_error;
    public HotelTidakDitemukanException(int hotel_input){
        super("Hotel dengan ID : ");
        hotel_error=hotel_input;
    }
    public String getPesan(){
        return super.getMessage() + hotel_error + " tidak ditemukan.";
    }
}
