import java.util.Scanner;

public class MainPangkat17 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("Masukkan Jumlah Elemen Yang Dihitung");
        int Elemen = sc.nextInt();

        Pangkat17[] png = new Pangkat17[Elemen];
        for(int i=0; i<Elemen; i++){
            png[i] = new Pangkat17();
            System.out.println("Masukkan Nilai Yang Hendak Dipangkatkan ");
            png[i].nilai = sc.nextInt();    
            System.out.println("Masukkan Nilai Pemangkat : ");
            png[i].pangkat = sc.nextInt();
        }
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for(int i=0; i<Elemen; i++){
            System.out.println("Hasil Dari " + png[i].nilai+ " Pangkat "
                                             + png[i].pangkat+ " Adalah "
                                             + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for(int i=0; i<Elemen; i++){
            System.out.println("Hasil Dari " + png[i].nilai+ " Pangkat "
                                             + png[i].pangkat+ " Adalah "
                                             + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}