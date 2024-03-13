import java.util.Scanner;

public class KecepatanMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak tempuh mobil (dalam kilometer): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan waktu tempuh mobil (dalam jam): ");
        double waktu = input.nextDouble();

        double kecepatan = hitungKecepatan(jarak, waktu);
        System.out.println("Kecepatan mobil adalah: " + kecepatan + " km/jam");
    }

    public static double hitungKecepatan(double jarak, double waktu) {
        return jarak / waktu;
    }
}
