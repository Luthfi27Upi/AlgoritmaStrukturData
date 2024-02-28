import java.util.Scanner;
public class Tugas1Praktikum17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char KODE[] = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char KOTA[][] = {
                { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' }
        };  
        System.out.print("Masukkan kode plat : ");
        char kode = sc.next().toUpperCase().charAt(0);
        int index = 0;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kode) {
                index = i;
            } else {
                System.out.println("Kode tidak tersedia");
            }
        }
        System.out.print("Kota yang anda cari adalah : ");
        for (int i = 0; i < KOTA[index].length; i++) {
            System.out.print(KOTA[index][i]);
        }
    }
}