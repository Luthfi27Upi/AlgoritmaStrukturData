import java.util.Scanner;

public class Persegi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int keliliing;
         int sisii;

        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = sc.nextDouble();

        double luas = hitungLuas(sisi);
        double keliling = hitungKeliling(sisi);

        System.out.println("Luas persegi: " + luas);
        System.out.println("Keliling persegi: " + keliling);
    }

    public static double hitungLuas(double sisi) {
        return sisi * sisi;
    }

    public static double hitungKeliling(double sisi) {
        return 4 * sisi;
    }
}
