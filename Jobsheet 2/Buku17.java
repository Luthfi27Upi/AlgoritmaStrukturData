public class Buku17 {
    String judul, pengarang;
    int halaman, stok, harga;

    void TampilInformasi(String[] args) {
        System.out.println("Judul : " +judul);
        System.out.println("Pengarang :" +pengarang);
        System.out.println("Jumlah Halaman :" +halaman);
        System.out.println("Sisa Stok :" +stok);
        System.out.println("Harga : Rp." +harga);
    }
    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            System.out.println(jml + " Buku telah terjual.");
        } else {
            System.out.println("Stok habis. Tidak bisa melakukan penjualan.");
        }
    }
    void restock(int jml){
        stok += jml;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    }

public Buku17() {

}
public Buku17(String jud, String pg, int hal, int stok, int har){
    judul = jud;
    pengarang = pg;
    halaman = hal;
    this.stok = stok;
    harga = har;
}

}