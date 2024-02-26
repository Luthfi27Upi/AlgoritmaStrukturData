public class Buku17LatihanMain {
    public static void main(String[] args) {
        Buku17Latihan bk1 = new Buku17Latihan();
        bk1.judul = "Solo Leveling";
        bk1.pengarang = "Sung-Jin-Woo";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku17Latihan bk2 = new Buku17Latihan("One Piece", "Luffy", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku17Latihan bkInnama = new Buku17Latihan("Ghibli", "Luthfi Angga", 100, 50, 73000);
        bkInnama.tampilInformasi();
        bkInnama.terjual(10);
        System.out.println("Harga total : " + bkInnama.hitungHargaTotal());
        System.out.println("Harga diskon : " + bkInnama.hitungDiskon());
        System.out.println("Harga bayar : " + bkInnama.hitungHargaBayar());
    }
}