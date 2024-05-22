public class Kuis17 {
    public static void main(String[] args) {
        // Membuat linked list untuk menyimpan klasemen
        DoublyLinkedList standings = new DoublyLinkedList();
        
        // Menambahkan beberapa tim dengan poin awal
        standings.addTeam(new Team("Mercedes", 300));
        standings.addTeam(new Team("Red Bull", 290));
        standings.addTeam(new Team("Ferrari", 250));
        standings.addTeam(new Team("McLaren", 200));
        standings.addTeam(new Team("Alpine", 180));
        
        // Menampilkan klasemen awal
        System.out.println("Klasemen awal:");
        standings.printStandings();
        
        // Mensimulasikan beberapa balapan
        standings.updateTeamPoints("Mercedes", 25);
        standings.updateTeamPoints("Red Bull", 18);
        standings.updateTeamPoints("Ferrari", 15);
        standings.updateTeamPoints("McLaren", 10);
        standings.updateTeamPoints("Alpine", 8);
        
        // Menampilkan klasemen setelah beberapa balapan
        System.out.println("\nKlasemen setelah balapan:");
        standings.printStandings();
    }
}

class Team {
    String name;
    int points;
    Team prev;
    Team next;
    
    public Team(String name, int points) {
        this.name = name;
        this.points = points;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private Team head;
    private Team tail;
    
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }
    
    // Menambahkan tim ke klasemen
    public void addTeam(Team newTeam) {
        if (head == null) {
            head = newTeam;
            tail = newTeam;
        } else {
            Team current = head;
            while (current != null && current.points > newTeam.points) {
                current = current.next;
            }
            
            if (current == null) {
                tail.next = newTeam;
                newTeam.prev = tail;
                tail = newTeam;
            } else if (current == head) {
                newTeam.next = head;
                head.prev = newTeam;
                head = newTeam;
            } else {
                newTeam.next = current;
                newTeam.prev = current.prev;
                current.prev.next = newTeam;
                current.prev = newTeam;
            }
        }
    }
    
    // Mengupdate poin tim
    public void updateTeamPoints(String name, int additionalPoints) {
        Team current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                current.points += additionalPoints;
                
                // Menghapus tim dari posisi saat ini
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                
                // Menambahkan tim kembali ke posisi yang tepat
                addTeam(current);
                break;
            }
            current = current.next;
        }
    }
    
    // Menampilkan klasemen
    public void printStandings() {
        Team current = head;
        while (current != null) {
            System.out.println(current.name + " - " + current.points + " points");
            current = current.next;
        }
    }
}
