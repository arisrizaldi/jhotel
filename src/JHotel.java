/**
 * Class Hotel
 *
 * @author Rizky Ramadian Wijaya
 * @version 1/3/2018
 */

import java.util.*;

public class JHotel
{   
    /**
     * Merupakan metode main dari Applikasi JHotel
     * 
     * @param args argumen untuk main
     */
    public static void main(String[] args) {
        try {
            DatabaseCustomer.addCustomer(new Customer("Aris", 1997, 3, 19, "aris@yahoo.com"));
            DatabaseCustomer.addCustomer(new Customer("Harden", 2013, 2, 13, "harden@rocketmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Marion", 2069, 9, 10, "marionjola@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Marion", 2069, 9, 10, "marionjola@gmail.com"));
        }
        catch(PelangganSudahAdaException e){
            System.out.println(">>>SIMULASI PELANGGAN SUDAH ADA SUKSES<<<");
            System.out.println(e.getPesan());
        }

        try {
            Lokasi a = new Lokasi(102, 320, "Asoy dah pokoknya");
            DatabaseHotel.addHotel(new Hotel("Parama Puncak", new Lokasi(69, 69, "Adem mayan"), 3));
            DatabaseHotel.addHotel(new Hotel("Pondok Seulanga", new Lokasi(86, 86, "Enak buat sunset, sunrise kagak"), 2));
            DatabaseHotel.addHotel(new Hotel("Ariza Semangat", a, 4));
            DatabaseHotel.addHotel(new Hotel("Ariza Semangat", a, 4));
        } catch(HotelSudahAdaException e){
            System.out.println(">>>SIMULASI HOTEL SUDAH ADA SUKSES<<<");
            System.out.println(e.getPesan());
        }

        try {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "JH1"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2), "JH2"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3), "JH3"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1), "JH4"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1), "JH4"));

        } catch(RoomSudahAdaException e){
            System.out.println(">>>SIMULASI ROOM SUDAH ADA SUKSES<<<");
            System.out.println(e.getPesan());
        }

        try {
            DatabasePesanan.addPesanan(new Pesanan(3, DatabaseCustomer.getCustomer(1)));
            DatabasePesanan.addPesanan(new Pesanan(5, DatabaseCustomer.getCustomer(2)));
            DatabasePesanan.addPesanan(new Pesanan(7, DatabaseCustomer.getCustomer(3)));
            DatabasePesanan.addPesanan(new Pesanan(7, DatabaseCustomer.getCustomer(3)));
        } catch(PesananSudahAdaException e){
            System.out.println(">>>SIMULASI PESANAN SUDAH ADA SUKSES<<<");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseCustomer.removeCustomer(10);
        } catch(PelangganTidakDitemukanException e){
            System.out.println(">>>SIMULASI PELANGGAN TIDAK DITEMUKAN SUKSES<<<");
            System.out.println(e.getPesan());
        }
        Customer me = new Customer("Aris Ganteng",1945,9,12,"arisganteng@gmail.com");
        Pesanan pesan = new Pesanan(32,me);
        try{
            DatabasePesanan.removePesanan(pesan);
        } catch(PesananTidakDitemukanException e){
            System.out.println(">>>SIMULASI PESANAN TIDAK DITEMUKAN SUKSES<<<");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseHotel.removeHotel(29);
        } catch(HotelTidakDitemukanException e){
            System.out.println(">>>SIMULASI HOTEL TIDAK DITEMUKAN SUKSES<<<");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseRoom.removeRoom(DatabaseHotel.getHotel(2),"NOMOR SATU SEDUNIA");
        } catch(RoomTidakDitemukanException e){
            System.out.println(">>>SIMULASI ROOM TIDAK DITEMUKAN SUKSES<<<");
            System.out.println(e.getPesan());
        }

        System.out.println("===========HASIL==========");

        System.out.println(DatabaseCustomer.getCustomerDatabase());
        System.out.println(DatabaseHotel.getHotelDatabase());
        System.out.println(DatabaseRoom.getRoomDatabase());
        System.out.println(DatabasePesanan.getPesananDatabase());

//            for (Pesanan pesan :
//                    DatabasePesanan.getPesananDatabase()) {
//                System.out.println(pesan);
//            }
//
//            Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(1), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1), "JH1"));
//            Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(2), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1), "JH4"));
//            Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(3), DatabaseRoom.getRoom(DatabaseHotel.getHotel(2), "JH2"));
//
//            for (Pesanan pesan :
//                    DatabasePesanan.getPesananDatabase()) {
//                System.out.println(pesan);
//            }
//
//            Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)));
//            Administrasi.pesananDibatalkan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)));
//            Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)));

//            for (Pesanan pesan :
//                    DatabasePesanan.getPesananDatabase()) {
//                System.out.println(pesan);
//            }

    }
    
    
    /**
     * Constructor dari Class JHotel
     */
    public JHotel(){
    }
}
