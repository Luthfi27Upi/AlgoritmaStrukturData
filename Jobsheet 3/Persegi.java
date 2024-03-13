import java.util.Scanner;

public class Persegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = input.nextDouble();

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
