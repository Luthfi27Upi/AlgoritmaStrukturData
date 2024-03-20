import java.util.Scanner;
public class Mahasiswa17Main {
    public static void main(String[] args) {
        DaftarMaPres17 list = new DaftarMaPres17();
        Mahasiswa17 m1 = new Mahasiswa17("Nusa", 2017, 25, 3);
        Mahasiswa17 m2 = new Mahasiswa17("Raar", 2012, 19, 4);
        Mahasiswa17 m3 = new Mahasiswa17("Dompu", 2018, 19, 3.5);
        Mahasiswa17 m4 = new Mahasiswa17("Abdul", 2017, 23, 2);
        Mahasiswa17 m5 = new Mahasiswa17("Ummi", 2019, 21, 3.75);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa Sebelum Sorting =");
        list.tampil();

        System.out.println("Data Mahasiswa Setelah Sorting DESC Berdasarkan IPK");
        list.BubbleSort();
        list.tampil();

        System.out.println("Data Mahasiswa Setelah Sorting ASC Berdasarkan IPK");
        list.SelectionSort();
        list.tampil();

        System.out.println("Data Mahasiswa Setelah Sorting ASC Berdasarkan IPK");
        list.InsertionSort();
        list.tampil(); 
    }   
}