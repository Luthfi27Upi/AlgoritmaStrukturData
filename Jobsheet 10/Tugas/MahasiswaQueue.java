package Tugas;

public class MahasiswaQueue {
    Mahasiswa17 front, rear;

    boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int nim, String nama) {
        Mahasiswa17 mhs = new Mahasiswa17(nim, nama, null);
        if (isEmpty()) {
            front = mhs;
            rear = mhs;
        } else {
            rear.next = mhs;
            rear = mhs;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrean masih kosong, tidak dapat dihapus");
        } else if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
    }

    void print() {
        if (!isEmpty()) {
            Mahasiswa17 tmp = front;
            System.out.println("Daftar Antrean : ");
            while (tmp != null) {
                System.out.println("NIM : " + tmp.nim + " Nama : " + tmp.nama);
                tmp = tmp.next;

            }
            System.out.println("");
        } else {
            System.out.println("Antrean Kosong");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa yang paling depan: ");
            System.out.println("NIM: " + front.nim + " | Nama: " + front.nama);
        } else {
            System.out.println("Antrian kosong");
        }
    }
}