public class PelangganTidakDitemukanException extends Exception {

    private Customer pelanggan_error;

    public PelangganTidakDitemukanException (Customer pelanggan_input) {
        super("Data Customer dengan ID: ");
        this.pelanggan_error=pelanggan_input;
    }
    public String getPesan(){
        return super.getMessage() + pelanggan_error + " tidak ditemukan. ";
    }
}