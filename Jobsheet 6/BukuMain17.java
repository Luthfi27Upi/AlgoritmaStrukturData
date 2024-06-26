import java.util.Scanner;

public class BukuMain17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku17 data = new PencarianBuku17();
        int jumBuku = 5;

        System.out.println("------------------------------------");
        System.out.println("Masukkan data buku Urut dari Kode Buku terkecil");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("------------------------------------");
            System.out.print("Kode Buku     : ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul Buku    : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit  : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang     : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock         : ");   
            int stock = s.nextInt();

            Buku17 m = new Buku17(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("------------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari. ");
        System.out.print("Kode Buku : ");
        String cari = s1.nextLine();
        System.out.println("Menggunakan Sequential Search ");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        Buku17 dataBuku = data.FindBuku(cari);
        dataBuku.tampilDataBuku();

        System.out.println("======================================");
        System.out.println("Menggunakan Binary Search");
        data.bubbleSort();
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}