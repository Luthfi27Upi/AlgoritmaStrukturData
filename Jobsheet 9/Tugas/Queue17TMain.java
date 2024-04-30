package Tugas;
import java.util.Scanner;

public class Queue17TMain {
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua atrian");
        System.out.println("5. Cek antrian belakang");
        System.out.println("6. Cari posisi pembeli");
        System.out.println("7. Keluar");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        Scanner fi = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc17.nextInt();

        Queue17T Q = new Queue17T(jumlah);

        int pilih = 0;
        do {
            menu();
            pilih = sc17.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = fi.nextLine();
                    System.out.print("No HP : ");
                    int noHP = sc17.nextInt();
                    Pembeli17 nb = new Pembeli17(nama, noHP);
                    Q.enqueue(nb);
                    break;
                case 2:
                    Pembeli17 data = Q.dequeue();
                    if (!"".equals(data.nama) && data.noHP != 0) {
                        System.out.println("Data yang dikeluarkan : " + data.nama + " " + data.noHP);
                    }
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.daftarPembeli();
                    break;
                case 5:
                    Q.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan nama pembeli yang ingin dicari : ");
                    String cariNama = fi.nextLine();
                    Q.peekPosition(cariNama);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}