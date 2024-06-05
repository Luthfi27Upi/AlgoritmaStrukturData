package Tugas;

public class NodeF {
    NodeF prev, next;
    int id;
    String judul;
    double rating;

    NodeF(NodeF prev, int id, String judul, double rating, NodeF next) {
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}