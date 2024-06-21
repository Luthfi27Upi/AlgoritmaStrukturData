public class Node {
    TransaksiRental data;
    Node next;
    Node prev;

    public Node(TransaksiRental data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoubleLinkedList {
    private Node head;
    private Node tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insert(TransaksiRental data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            // Tampilkan informasi transaksi atau kendaraan
            System.out.println("Kode Transaksi: " + current.data.kodeTransaksi);
            System.out.println("Nama Peminjam: " + current.data.namaPeminjam);
            System.out.println("Total Biaya: " + current.data.totalBiaya);
            System.out.println("No TNKB: " + current.data.noTNKB);
            System.out.println("Nama Kendaraan: " + current.data.namaKendaraan);
            System.out.println("Jenis Kendaraan: " + current.data.jenisKendaraan);
            System.out.println("-----------------------");

            current = current.next;
        }
    }

    // Metode lain seperti pencarian, pengurutan, dll. bisa ditambahkan jika diperlukan
}
