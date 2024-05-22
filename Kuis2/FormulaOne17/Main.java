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
            {"1", "Bahrain GP", "Bahrain International Circuit", "57 Laps"},
            {"2", "Saudi Arabian GP", "Jeddah Corniche Circuit", "50 Laps"},
            {"3", "Australian GP", "Albert Park Circuit", "58 Laps"},
            {"4", "Japanese GP", "Suzuka", "53 Laps"},
            {"5", "Chinese GP", "Shanghai International Circuit", "56 Laps"},
            {"6", "Miami GP", "Miami International Autodrome", "57 Laps"},
            {"7", "Emilia Romagna GP", "Autodromo Enzo e Dino Ferrari", "63 Laps"},
        });

        while (true) {
            System.out.println("=====================================");
            System.out.println("|          Luthfi Triaswangga       |");
            System.out.println("|             2341720208            |");
            System.out.println("=====================================");
            System.out.println("|           FORMULA ONE (F1)        |");
            System.out.println("|       Tahun 2024 - Musim ke-75    |");
            System.out.println("=====================================");
            System.out.println("1. Tampilkan Data Drivers");
            System.out.println("2. Tampilkan Data Teams");
            System.out.println("3. Tampilkan Data Schedule");
            System.out.println("4. Masukkan Poin Drivers");
            System.out.println("5. Tampilkan Poin Drivers");
            System.out.println("6. Tampilkan Poin Teams");
            System.out.println("7. Keluar");
            System.out.println("======================================");
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
            {"44,", "Lewis Hamilton,", "Mercedes AMG Petronas,", "Inggris,", "35"},
            {"63,", "George Russel,", "Mercedes AMG Petronas,", "Inggris,", "44"},
            {"16,", "Charles Leclerc,", "Scuderia Ferrari,", "Monako,", "113"},
            {"55,", "Carlos Sainz jr,", "Scuderia Ferrari,", "Spanyol,", "93"},
            {"1,", "Max Verstappen,", "Oracle Red Bull Racing,", "Belgia,", "161"},
            {"11,", "Sergio Perez,", "Oracle Red Bull Racing,", "Meksiko,", "107"},
            {"4,", "Lando Norris,", "McLaren F1 Team,", "Belgia,", "101"},
            {"81,", "Oscar Piastri,", "McLaren F1 Team,", "Australia,", "53"},
            {"10,", "Pierre Gasly,", "Alpine F1 Team,", "Prancis,", "0"},
            {"31,", "Esteban Ocon,", "Alpine F1 Team,", "Prancis,", "1"},
            {"20,", "Kevin Magnussen,", "Haas F1 Team,", "Denmark,", "1"},
            {"27,", "Nico Hulkenberg,", "Haas F1 Team,", "Jerman,", "6"},
            {"14,", "Fernando Alonso,", "Aston Martin Racing,", "Spanyol,", "33"},
            {"18,", "Lance Stroll,", "Aston Martin Racing,", "Kanada,", "11"},
            {"3,", "Daniel Ricciardo,", "Visa Cash App RB,", "Australia,", "5"},
            {"22,", "Yuki Tsunoda,", "Visa Cash App RB,", "Jepang,", "15"},
            {"77,", "Valtteri Bottas,", "Stake F1 Team,", "Finlandia,", "0"},
            {"24,", "Zhou Guanyu,", "Stake F1 Team,", "China,", "0"},
            {"2,", "Logan Sargeant,", "Williams Racing,", "Amerika,", "0"},
            {"23,", "Alexander Albon,", "Williams Racing,", "Inggris,", "0"},
            {"38", "Oliver Bearman", "Scuderia Ferrari", "Inggris", "6"},
        };

        String[][] teams = {
            {"Team 1\t: Mercedes AMG Petronas,", "\tDriver : Lewis Hamilton,", "George Russel,", "79"},
            {"Team 2\t: Scuderia Ferrari,", "\t\tDriver : Charles Leclerc,", "Carlos Sainz jr,", "212"},
            {"Team 3\t: Oracle Red Bull Racing,", "\tDriver : Max Verstappen,", "Sergio Perez,", "268"},
            {"Team 4\t: McLaren F1 Team,", "\t\tDriver : Lando Norris,", "Oscar Piastri,", "154"},
            {"Team 5\t: Alpine F1 Team,", "\t\tDriver : Pierre Gasly,", "Esteban Ocon,", "1"},
            {"Team 6\t: Haas F1 Team,", "\t\tDriver : Kevin Magnussen,", "Nico Hulkenberg,", "7"},
            {"Team 7\t: Aston Martin Racing,", "\t\tDriver : Fernando Alonso,", "Lance Stroll,", "44"},
            {"Team 8\t: Visa Cash App RB,", "\t\tDriver : Daniel Ricciardo,", "Yuki Tsunoda,", "20"},
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
        System.out.println("==============================================================================");
        System.out.printf("| %-5s | %-20s | %-30s | %-10s | %n", "No", "Grand Prix", "Circuit", "Laps");
        System.out.println("==============================================================================");
        for (String[] race : jadwalPertandingan) {
            System.out.printf("| %-5s | %-20s | %-30s | %-10s | %n", race[0], race[1], race[2], race[3]);
        }
        System.out.println("==============================================================================");
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