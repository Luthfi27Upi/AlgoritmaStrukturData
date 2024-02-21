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

        Buku17 bk172 = new Buku17("One Piece", "Luffy", 160, 29, 59000);
        bk172.terjual(11);
        bk172.TampilInformasi(args);

        Buku17 bkLuthfi = new Buku17("Ghibli", "Luthfi", 150, 20, 45000);
        bkLuthfi.TampilInformasi(args);

    }
    
}