import java.util.Arrays;
import java.util.Scanner;
public class Kasus17Main {

    public static void main(String[] args) {
        int[] numbers = {35, 10, 3, 43, 39, 17, 35, 27, 7, 28, 17, 34, 42, 24, 45, 44, 31};

        Kasus17 data = new Kasus17(numbers);

        System.out.println("Data Awal :");
        System.out.println(Arrays.toString(data.getNumbers()));

        Kasus17List.selectionSortAscending(data.getNumbers());
        System.out.println("Ascending:");
        for (int number : data.getNumbers()) {
            System.out.print(number + " ");
        }
        Kasus17List.selectionSortAscending(data.getNumbers());
        int target = 24;
        int index = Kasus17List.binarySearch(data.getNumbers(), target);

        if (index != -1) {
            System.out.print("Angka " + target + " ditemukan pada indeks " + index);
        } else {
            System.out.println("Angka " + target + " tidak ditemukan");
        }

        Kasus17List.selectionSortDescending(data.getNumbers());
        System.out.println("\nDescending:");
        for (int number : data.getNumbers()) {
            System.out.print(number + " ");
        }
        Kasus17List.selectionSortDescending(data.getNumbers());
        int trgt = 41;
        int indx = Kasus17List.binarySearch(data.getNumbers(), trgt);

        if (indx != -1) {
            System.out.println("Angka " + trgt + " ditemukan pada indeks " + indx);
        } else {
            System.out.println("Angka " + trgt + " tidak ditemukan");
        }
    }
}