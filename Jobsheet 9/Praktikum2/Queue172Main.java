package Praktikum2;
import java.util.Scanner;
import Praktikum1.Queue17;

public class Queue172Main {
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua atrian");
        System.out.println("5. Cek antrian belakang");
        System.out.println("6. Keluar");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        Scanner fi = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc17.nextInt();

        Queue172 Q = new Queue172(jumlah);

        int pilih = 0;
        do {
            menu();
            pilih = sc17.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("No rekening : ");
                    String norek = fi.nextLine();
                    System.out.print("Nama : ");
                    String nama = fi.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = fi.nextLine();
                    System.out.print("Umur : ");
                    int umur = sc17.nextInt();
                    System.out.print("Saldo : ");
                    int saldo = sc17.nextInt();
                    Nasabah17 nb = new Nasabah17(norek, nama, alamat, umur, saldo);
                    Q.enqueue(nb);
                    break;
                case 2:
                    Nasabah17 data = Q.dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Data yang dikeluarkan : " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.print();
                    break;
                case 5:
                    Q.peekRear();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}