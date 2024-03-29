import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*************************");
        System.out.println("Masukkan Jumlah Elemen");
        int iJml = sc.nextInt();

        Faktorial[] fk = new Faktorial[iJml];
        for(int i=0; i<iJml; i++){
            fk[i] = new Faktorial();
            System.out.println("Masukkan Nilai Data Ke-" +(i+1)+" : ");
            int iNilai = sc.nextInt();
            fk[i].nilai = iNilai;
        }
        System.out.println("HASIL - BRUTE FORCE");
        for(int i=0; i<iJml; i++){
            System.out.println("Hasil Penghitungan Faktorial Menggunakan Brute Force Adalah" +fk[i].faktoBF(fk[i].nilai));
        }
            System.out.println("HASIL - DIVIDE AND CONQUER");
            for(int i=0; i<iJml; i++){
                System.out.println("Hasil Penghitungan Faktorial Menggunakan Divide And Conquer Adalah" +fk[i].faktoDC(fk[i].nilai));
        }
    }
}