package Tugas;

public class NodeV {
    int nomor;
    String nama;
    NodeV prev, next;

    NodeV(NodeV prev, int nomor, String nama, NodeV next) {
        this.nomor = nomor;
        this.nama = nama;
        this.prev = prev;
        this.next = next;
    }
}