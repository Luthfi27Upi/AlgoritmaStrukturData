import java.util.Scanner;
public class ArrayObects17 {
    public int panjang;
    public int lebar;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Panjang Array : ");
        int panjangArray = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[panjangArray];

        for (int i=0; i<3; i++)
        {
            ppArray[i] = new PersegiPanjang() ;
            System.out.println("Persegi Panjang ke-" +i);
            System.out.print("Masukkan Panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar : ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i=0; i<3; i++)
        {
            System.out.println("Persegi panjang ke-" +i);
            System.out.println("Panjang: " +ppArray[i].panjang+ ", lebar: " +ppArray[i].lebar);
        }
    }
}