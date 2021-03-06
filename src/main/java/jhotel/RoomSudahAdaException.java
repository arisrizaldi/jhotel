package jhotel;
/**
 * Ini adalah kelas turunan Exeception yang berfungsi untuk menangani
 * apabila object Room yang dibuat sudah ada sebelumnya.
 * @author Muhammad Aris Rizaldi
 * @version 20-5-2K18
 * @since April 2018
 */
public class RoomSudahAdaException extends Exception {
    //instance variable
    private Room room_error;
    /**
     * Constructor object kelas RoomSudahAdaException
     * @param room_input menyimpan nilai nomor_kamar yang dimasukkan user
     *
     */
    public RoomSudahAdaException(Room room_input){
        super("Kamar dengan nomor ruang : ");
        room_error=room_input;
    }
    public String getPesan(){
        return super.getMessage() + room_error.getNomorKamar() + " pada "+room_error.getHotel()+" sudah terdaftar ";
    }
}
