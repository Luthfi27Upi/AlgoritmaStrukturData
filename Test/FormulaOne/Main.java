package FormulaOne;

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
            System.out.println("|          FORMULA ONE (F1)         |");
            System.out.println("|      Tahun 2024 - Musim ke-75     |");
            System.out.println("=====================================");
            System.out.println("1. Tampilkan Data Pembalap");
            System.out.println("2. Tampilkan Data Tim");
            System.out.println("3. Tampilkan Data Jadwal Pertandingan");
            System.out.println("4. Tampilkan Poin Pembalap");
            System.out.println("5. Tampilkan Poin Tim");
            System.out.println("6. Keluar");
            System.out.println("======================================");
            System.out.print("Masukkan Pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    dataPembalap.printDrivers(); // Print all driver data with table format
                    break;
                case 2:
                    dataTeam.printTeams(); // Print all team data
                    break;
                case 3:
                    printJadwalPertandingan();
                    break;
                case 4:
                    dataPembalap.sortDriversByPoints();
                    dataPembalap.printDriversWithPoints(); // Print driver points table with rank
                    break;
                case 5:
                    dataTeam.sortTeamsByPoints();
                    printTeamPoints();
                    break;
                case 6:
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
            {"44", "Lewis Hamilton", "Mercedes AMG Petronas", "Inggris", "35"},
            {"63", "George Russel", "Mercedes AMG Petronas", "Inggris", "44"},
            {"16", "Charles Leclerc", "Scuderia Ferrari", "Monako", "113"},
            {"55", "Carlos Sainz jr", "Scuderia Ferrari", "Spanyol", "93"},
            {"1", "Max Verstappen", "Oracle Red Bull Racing", "Belgium", "161"},
            {"11", "Sergio Perez", "Oracle Red Bull Racing", "Meksiko", "107"},
            {"4", "Lando Norris", "McLaren F1 Team", "Belgia", "101"},
            {"81", "Oscar Piastri", "McLaren F1 Team", "Australia", "53"},
            {"10", "Pierre Gasly", "Alpine F1 Team", "Prancis", "0"},
            {"31", "Esteban Ocon", "Alpine F1 Team", "Prancis", "1"},
            {"20", "Kevin Magnussen", "Haas F1 Team", "Denmark", "1"},
            {"27", "Nico Hulkenberg", "Haas F1 Team", "Jerman", "6"},
            {"14", "Fernando Alonso", "Aston Martin Racing", "Spanyol", "33"},
            {"18", "Lance Stroll", "Aston Martin Racing", "Kanada", "11"},
            {"3", "Daniel Ricciardo", "Visa Cash App RB", "Australia", "5"},
            {"22", "Yuki Tsunoda", "Visa Cash App RB", "Jepang", "15"},
            {"77", "Valtteri Bottas", "Stake F1 Team", "Finlandia", "0"},
            {"24", "Zhou Guanyu", "Stake F1 Team", "China", "0"},
            {"2", "Logan Sargeant", "Williams Racing", "Amerika", "0"},
            {"23", "Alexander Albon", "Williams Racing", "Inggris", "0"},
            {"38", "Oliver Bearman", "Scuderia Ferrari", "Inggris", "6"},
        };

        String[][] teams = {
            {"Mercedes AMG Petronas", "Lewis Hamilton", "George Russel", "79"},
            {"Scuderia Ferrari", "Charles Leclerc", "Carlos Sainz jr", "212"},
            {"Oracle Red Bull Racing", "Max Verstappen", "Sergio Perez", "268"},
            {"McLaren F1 Team", "Lando Norris", "Oscar Piastri", "154"},
            {"Alpine F1 Team", "Pierre Gasly", "Esteban Ocon", "1"},
            {"Haas F1 Team", "Kevin Magnussen", "Nico Hulkenberg", "7"},
            {"Aston Martin Racing", "Fernando Alonso", "Lance Stroll", "44"},
            {"Visa Cash App RB", "Daniel Ricciardo", "Yuki Tsunoda", "20"},
            {"Stake F1 Team", "Valtteri Bottas", "Zhou Guanyu", "0"},
            {"Williams Racing", "Logan Sargeant", "Alex Albon", "0"},
        };

        for (String[] driver : drivers) {
            dataPembalap.add(driver);
        }

        for (String[] team : teams) {
            dataTeam.add(team);
        }
    }

    public static void dataJadwalPertandingan(String[][] jadwal) {
        jadwalPertandingan = new String[jadwal.length][4];
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

    public static void printTeamPoints() {
        System.out.println("=============================================================");
        System.out.printf("| %-5s | %-30s | %-10as | %n", "Rank", "Nama Team", "Points");
        System.out.println("=============================================================");

        Node teamNode = dataTeam.getHead();
        int rank = 1;
        while (teamNode != null) {
            System.out.printf("| %-5d | %-30s | %-10s | %n", rank, teamNode.data[0], teamNode.data[3]);
            rank++;
            teamNode = teamNode.next;
        }
        System.out.println("=============================================================");
    }
}
