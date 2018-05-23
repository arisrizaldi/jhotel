package jhotel;
/**
 * Ini adalah kelas turunan Exception yang berfungsi untuk menangani
 * apabila room yang ingin dihapus tidak terdapat dalam database.
 * @author Muhammad Aris Rizaldi
 * @version 20-5-2K18
 * @since April 2018
 */
public class RoomTidakDitemukanException extends Exception {
    private Hotel hotel_error;
    private String room_error;
    /**
     * Constructor object kelas RoomTidakDitemukanException
     * @param hotel_input parameter dengan tipe object dari kelas Hotel
     * @param room_input menyimpan nilai nomor kamar yang diinputkan user
     *
     */
    public RoomTidakDitemukanException(Hotel hotel_input,String room_input){
        super("Kamar yang terletak di : ");
        hotel_error=hotel_input;
        room_error=room_input;
    }
    public String getPesan(){
        return super.getMessage()+hotel_error+"dan dengan nomor kamar"+room_error+"tidak ditemukan.";
    }
}
