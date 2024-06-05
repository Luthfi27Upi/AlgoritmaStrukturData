package Tugas;

public class Mahasiswa17 {
    int nim;
    String nama;
    Mahasiswa17 next;

    Mahasiswa17() {

    }

    Mahasiswa17(int nim, String nama, Mahasiswa17 berikutnya) {
        this.nim = nim;
        this.nama = nama;
        next = berikutnya;
    }
}