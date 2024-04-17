import java.util.Scanner;
public class Kasus17Main {

    public static void main(String[] args) {

        int[] kasus_numbers = {35, 10, 3, 43, 39, 17, 35, 27, 7, 28, 17, 34, 42, 24, 45, 44, 31 };

        Kasus17 kasus = new Kasus17(kasus_numbers);

        System.out.println("+++ UTS Luthfi Triaswangga +++");

        System.out.println("\nData Awal");
        kasus.showAll();
        kasus.search(39);

        System.out.println("\nData Binary Searching Ascending");
        kasus.selectionSortASC();
        kasus.showAll();
        kasus.search(35);

        System.out.println("\nData Binary Searching Descending");
        kasus.selectionSortDESC();
        kasus.showAll();
        kasus.search(43);

        System.out.println("Data Searching Tidak Ada");
        kasus.search(33);
    }
}