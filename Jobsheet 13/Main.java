public class Main {
    public static void main(String[] args) {
        // Pembuatan transaksi dan barang secara manual
        TransaksiRental transaksi1 = new TransaksiRental(1, 5, "John Doe", 250000);
        TransaksiRental transaksi2 = new TransaksiRental(2, 3, "Jane Smith", 150000);

        BarangRental barang1 = new BarangRental(2018, 200000, "B1234AB", "Toyota Avanza", "Mobil");
        BarangRental barang2 = new BarangRental(2020, 300000, "B5678CD", "Honda Beat", "Motor");

        // Membuat objek DoubleLinkedList untuk menyimpan transaksi
        DoubleLinkedList transaksiList = new DoubleLinkedList();

        // Menambahkan transaksi ke dalam linked list
        transaksiList.insert(transaksi1);
        transaksiList.insert(transaksi2);

        // Menampilkan seluruh transaksi
        System.out.println("Daftar Transaksi:");
        transaksiList.display();
    }
}
