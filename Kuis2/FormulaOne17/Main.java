package FormulaOne17;

import java.util.Scanner;

public class Main {
    static DoubleLinkedList dataPembalap = new DoubleLinkedList();
    static DoubleLinkedList dataTeam = new DoubleLinkedList();
    static String[][] jadwalPertandingan;
    static int[][] points = new int[20][24];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        dataPembalapDanTim();
        dataJadwalPertandingan(new String[][] {
            {"1,", "Bahrain GP,", "Bahrain International Circuit,", "57 putaran,", "3.363 miles"},
            {"2,", "Saudi Arabian GP,", "Jeddah Corniche Circuit,", "50 putaran,", "3.836 miles"},
            {"3,", "Australian GP,", "Albert Park Circuit,", "58 putaran,", "3.280 miles"},
            {"4,", "Japanese GP,", "Suzuka,", "53 putaran,", "3.608 miles"},
            {"5,", "Chinese GP,", "Shanghai International Circuit,", "56 putaran,", "3.387 miles"},
            {"6,", "Miami GP,", "Miami International Autodrome,", "57 putaran,", "3.363 miles"},
            {"7,", "Emilia Romagna GP,", "Autodromo Enzo e Dino Ferrari,", "63 putaran,", "3.050 miles"},
            {"8,", "Monaco GP,", "Circuit de Monte Carlo,", "78 putaran,", "2.074 miles"},
            {"9,", "Canadian GP,", "Circuit Gilles Villeneuve,", "70 putaran,", "2.710 miles"},
            {"10,", "Spanish GP,", "Circuit de Barcelona-Catalunya,", "66 putaran,", "2.894 miles"},
            {"11,", "Austrian GP,", "Red Bull Ring,", "71 putaran,", "2.683 miles"},
            {"12,", "British GP,", "Silverstone Circuit,", "52 putaran,", "3.660 miles"},
            {"13,", "Hungarian GP,", "Hungaroring,", "70 putaran,", "2.722 miles"},
            {"14,", "Belgian GP,", "Spa-Francorchamps,", "44 putaran,", "4.352 miles"},
            {"15,", "Dutch GP,", "Circuit Zandvoort,", "72 putaran,", "2.646 miles"},
            {"16,", "Italian GP,", "Monza Circuit,", "53 putaran,", "3.599 miles"},
            {"17,", "Azerbaijan GP,", "Baku City Circuit,", "51 putaran,", "3.730 miles"},
            {"18,", "Singapore GP,", "Marina Bay Street Circuit,", "62 putaran,", "3.070 miles"},
            {"19,", "United States GP,", "Circuit of the Americas,", "56 putaran,", "3.426 miles"},
            {"20,", "Mexico GP,", "Autodromo Hermanos Rodriguez,", "71 putaran,", "2.674 miles"},
            {"21,", "Brazilian GP,", "Interlagos,", "71 putaran,", "2.677 miles"},
            {"22,", "Las Vegas GP,", "Las Vegas Strip Circuit,", "50 putaran,", "3.853 miles"},
            {"23,", "Qatar GP,", "Losail International Circuit,", "57 putaran,", "3.367 miles"},
            {"24,", "Abu Dhabi GP,", "Yas Marina Circuit,", "58 putaran,", "3.281 miles"},
        });

        while (true) {
            System.out.println("========================");
            System.out.println("    FORMULA ONE (F1)    ");
            System.out.println("Tahun 2024 - Musim ke-75");
            System.out.println("========================");
            System.out.println("1. Tampilkan Data Pembalap");
            System.out.println("2. Tampilkan Data Tim");
            System.out.println("3. Tampilkan Data Jadwal Pertandingan");
            System.out.println("4. Masukkan Poin Pembalap");
            System.out.println("5. Tampilkan Poin Pembalap");
            System.out.println("6. Tampilkan Poin Tim");
            System.out.println("7. Keluar");
            System.out.println("========================");
            System.out.print("Masukkan Pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    dataPembalap.print();
                    break;
                case 2:
                    dataTeam.print();
                    break;
                case 3:
                    printJadwalPertandingan();
                    break;
                case 4:
                    setRacePoints(scanner);
                    break;
                case 5:
                    dataPembalap.sortDriversByPoints();
                    dataPembalap.print();
                    break;
                case 6:
                    dataTeam.sortTeamsByPoints();
                    dataTeam.print();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    public static void dataPembalapDanTim() {
        String[][] drivers = {
            {"44,", "Lewis Hamilton,", "Mercedes AMG Petronas,", "Inggris,", "0"},
            {"63,", "George Russel,", "Mercedes AMG Petronas,", "Inggris,", "0"},
            {"16,", "Charles Leclerc,", "Scuderia Ferrari,", "Monako,", "0"},
            {"55,", "Carlos Sainz jr,", "Scuderia Ferrari,", "Spanyol,", "0"},
            {"1,", "Max Verstappen,", "Oracle Red Bull Racing,", "Belgia,", "0"},
            {"11,", "Sergio Perez,", "Oracle Red Bull Racing,", "Meksiko,", "0"},
            {"4,", "Lando Norris,", "McLaren F1 Team,", "Belgia,", "0"},
            {"81,", "Oscar Piastri,", "McLaren F1 Team,", "Australia,", "0"},
            {"10,", "Pierre Gasly,", "Alpine F1 Team,", "Prancis,", "0"},
            {"31,", "Esteban Ocon,", "Alpine F1 Team,", "Prancis,", "0"},
            {"20,", "Kevin Magnussen,", "Haas F1 Team,", "Denmark,", "0"},
            {"27,", "Nico Hulkenberg,", "Haas F1 Team,", "Jerman,", "0"},
            {"14,", "Fernando Alonso,", "Aston Martin Racing,", "Spanyol,", "0"},
            {"18,", "Lance Stroll,", "Aston Martin Racing,", "Kanada,", "0"},
            {"3,", "Daniel Ricciardo,", "Visa Cash App RB,", "Australia,", "0"},
            {"22,", "Yuki Tsunoda,", "Visa Cash App RB,", "Jepang,", "0"},
            {"77,", "Valtteri Bottas,", "Stake F1 Team,", "Finlandia,", "0"},
            {"24,", "Zhou Guanyu,", "Stake F1 Team,", "China,", "0"},
            {"2,", "Logan Sargeant,", "Williams Racing,", "Amerika,", "0"},
            {"23,", "Alex Albon,", "Williams Racing,", "Inggris,", "0"},
        };

        String[][] teams = {
            {"Team 1\t: Mercedes AMG Petronas,", "\tDriver : Lewis Hamilton,", "George Russel,", "0"},
            {"Team 2\t: Scuderia Ferrari,", "\t\tDriver : Charles Leclerc,", "Carlos Sainz jr,", "0"},
            {"Team 3\t: Oracle Red Bull Racing,", "\tDriver : Max Verstappen,", "Sergio Perez,", "0"},
            {"Team 4\t: McLaren F1 Team,", "\t\tDriver : Lando Norris,", "Oscar Piastri,", "0"},
            {"Team 5\t: Alpine F1 Team,", "\t\tDriver : Pierre Gasly,", "Esteban Ocon,", "0"},
            {"Team 6\t: Haas F1 Team,", "\t\tDriver : Kevin Magnussen,", "Nico Hulkenberg,", "0"},
            {"Team 7\t: Aston Martin Racing,", "\t\tDriver : Fernando Alonso,", "Lance Stroll,", "0"},
            {"Team 8\t: Visa Cash App RB,", "\t\tDriver : Daniel Ricciardo,", "Yuki Tsunoda,", "0"},
            {"Team 9\t: Stake F1 Team,", "\t\tDriver : Valtteri Bottas,", "Zhou Guanyu,", "0"},
            {"Team 10\t: Williams Racing,", "\t\tDriver : Logan Sargeant,", "Alex Albon,", "0"},
        };

        for (String[] driver : drivers) {
            dataPembalap.add(driver);
        }

        for (String[] team : teams) {
            dataTeam.add(team);
        }
    }

    public static void dataJadwalPertandingan(String[][] jadwal) {
        jadwalPertandingan = new String[jadwal.length][5];
        for (int i = 0; i < jadwal.length; i++) {
            jadwalPertandingan[i] = jadwal[i];
        }
    }

    public static void printJadwalPertandingan() {
        for (String[] race : jadwalPertandingan) {
            for (String detail : race) {
                System.out.print(detail + " ");
            }
            System.out.println();
        }
    }

    public static void setRacePoints(Scanner scanner) {
        for (int i = 0; i < 24; i++) {
            System.out.println("Masukkan poin untuk race ke-" + (i + 1) + ":");
            for (int j = 0; j < 20; j++) {
                System.out.print("Points untuk Driver ke-" + (j + 1) + ": ");
                points[j][i] = scanner.nextInt();
            }
        }

        Node driverNode = dataPembalap.getHead();
        Node teamNode = dataTeam.getHead();
        while (driverNode != null) {
            int totalPoints = 0;
            for (int j = 0; j < 24; j++) {
                totalPoints += points[Integer.parseInt(driverNode.data[0]) - 1][j];
            }
            driverNode.data[4] = String.valueOf(totalPoints);

            Node currentTeamNode = dataTeam.getHead();
            while (currentTeamNode != null) {
                if (currentTeamNode.data[1].equals(driverNode.data[1]) || currentTeamNode.data[2].equals(driverNode.data[1])) {
                    int driver1Points = Integer.parseInt(getDriverPoints(currentTeamNode.data[1]));
                    int driver2Points = Integer.parseInt(getDriverPoints(currentTeamNode.data[2]));
                    currentTeamNode.data[3] = String.valueOf(driver1Points + driver2Points);
                }
                currentTeamNode = currentTeamNode.next;
            }
            driverNode = driverNode.next;
        }
    }

    private static String getDriverPoints(String driverName) {
        Node driverNode = dataPembalap.getHead();
        while (driverNode != null) {
            if (driverNode.data[1].equals(driverName)) {
                return driverNode.data[4];
            }
            driverNode = driverNode.next;
        }
        return "0";
    }
}