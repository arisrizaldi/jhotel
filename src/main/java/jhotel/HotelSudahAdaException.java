package jhotel;
/**
 * @author Muhammad Aris Rizaldi
 * @version 20-5-2K18
 * @exception HotelSudahAdaException kelas turunan Exception yang akan menangani bila hotel yang diinputkan sudah ada
 * @SINCE APRIL 2018
 */
public class HotelSudahAdaException extends Exception{
    private Hotel hotel_error;
    public HotelSudahAdaException(Hotel hotel_input){
        super("Hotel dengan nama : ");
        hotel_error=hotel_input;
    }
    public String getPesan(){
        return super.getMessage() + hotel_error.getNama() +"sudah terdaftar.";
    }
}
