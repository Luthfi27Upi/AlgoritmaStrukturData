public class Buku17Sebelum {
    String judul, pengarang;
    int halaman, stok, harga;

    void TampilInformasi(String[] args) {
        System.out.println("Judul : " +judul);
        System.out.println("Pengarang :" +pengarang);
        System.out.println("Jumlah Halaman :" +halaman);
        System.out.println("Sisa Stok :" +stok);
        System.out.println("Harga : Rp." +harga);
    }
    void terjual(int jml){
        stok -= jml;
    }
    void restock(int jml){
        stok += jml;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    }
}