public class BukuMain17 {
    public static void main(String[] args) {
        Buku17 bk17 = new Buku17();
        bk17.judul = "Solo Leveling";
        bk17.pengarang = "Sung-Jin-Woo";
        bk17.halaman = 198;
        bk17.stok = 13;
        bk17.harga = 71000;

        bk17.TampilInformasi(args);
        bk17.terjual(5);
        bk17.gantiHarga(60000);
        bk17.TampilInformasi(args);
    }
}
