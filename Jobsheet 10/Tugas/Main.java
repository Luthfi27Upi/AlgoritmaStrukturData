package Tugas;

public class Main {
    public static void main(String[] args) {
        MahasiswaLinkedListed mhs = new MahasiswaLinkedListed();
        mhs.print();
        mhs.addFirst(111, "Sigit Rendang");
        mhs.print();
        mhs.addLast(115, "Reza Kecap");
        mhs.print();
        mhs.insertAfter(111, 112, "Farhan Kebab");  
        mhs.print();
        mhs.insertAt(2, 113, "Rusdi");
        mhs.print();
        mhs.insertAfter(113, 114, "Faiz");
        mhs.print();
    }
}