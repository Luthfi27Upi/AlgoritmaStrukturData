import java.util.Scanner;

public class Hotel17Main {
    public static void main(String[] args) {
        Hotel17Service hotelService = new Hotel17Service(5);
        hotelService.tambah(new Hotel17("A", "Jakarta  ", 580000, (byte) 4));
        hotelService.tambah(new Hotel17("B", "Surabaya ", 400000, (byte) 3));
        hotelService.tambah(new Hotel17("C", "Bali     ", 600000, (byte) 5));
        hotelService.tambah(new Hotel17("D", "Malang   ", 450000, (byte) 2));
        hotelService.tambah(new Hotel17("E", "Blitar   ", 750000, (byte) 1));

        Scanner sc17 = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nPilih opsi sorting:");
            System.out.println("1. Harga (dari termurah ke termahal)");
            System.out.println("2. Rating bintang (dari tertinggi ke terendah)");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = sc17.nextInt();

            switch (choice) {
                case 1:
                    // hotelService.bubbleSortHarga();
                    hotelService.selectionSortHarga();
                    hotelService.tampilAll();
                    break;
                case 2:
                    // hotelService.selectionSortRating();
                    hotelService.bubbleSortRating();
                    hotelService.tampilAll();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (choice != 0);

        sc17.close();
    }
}