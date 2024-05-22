package FormulaOne;

public class DoubleLinkedList {
    Node head;
    Node tail;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    public void add(String[] data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void printDrivers() {
        System.out.println("===================================================================================");
        System.out.printf("| %-5s | %-20s | %-30s | %-15s | %n", "ID", "Nama Driver", "Nama Team", "Domisili");
        System.out.println("===================================================================================");
        Node current = head;
        while (current != null) {
            System.out.printf("| %-5s | %-20s | %-30s | %-15s | %n", current.data[0], current.data[1], current.data[2], current.data[3]);
            current = current.next;
        }
        System.out.println("===================================================================================");
    }

    public void printDriversWithPoints() {
        System.out.println("=====================================================");
        System.out.printf("| %-5s | %-5s | %-20s | %-10s | %n", "Rank", "ID", "Nama Driver", "Points");
        System.out.println("=====================================================");
        Node current = head;
        int rank = 1;
        while (current != null) {
            System.out.printf("| %-5d | %-5s | %-20s | %-10s | %n", rank, current.data[0], current.data[1], current.data[4]);
            current = current.next;
            rank++;
        }
        System.out.println("=====================================================");
    }

    public void printTeams() {
        System.out.println("=====================================================================================================");
        System.out.printf("| %-30s | %-30s | %-30s | %n", "Nama Team", "Nama Driver 1", "Nama Driver 2");
        System.out.println("=====================================================================================================");
        Node current = head;
        while (current != null) {
            System.out.printf("| %-30s | %-30s | %-30s | %n", current.data[0], current.data[1], current.data[2]);
            current = current.next;
        }
        System.out.println("=====================================================================================================");
    }

    public Node getHead() {
        return head;
    }

    public void sortDriversByPoints() {
        if (head == null || head.next == null) {
            return;
        }

        Node current = head;
        while (current != null) {
            Node max = current;
            Node index = current.next;
            while (index != null) {
                if (Integer.parseInt(max.data[4]) < Integer.parseInt(index.data[4])) {
                    max = index;
                }
                index = index.next;
            }
            String[] temp = current.data;
            current.data = max.data;
            max.data = temp;
            current = current.next;
        }
    }

    public void sortTeamsByPoints() {
        if (head == null || head.next == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            Node max = current;
            Node index = current.next;
            while (index != null) {
                if (Integer.parseInt(max.data[3]) < Integer.parseInt(index.data[3])) {
                    max = index;
                }
                index = index.next;
            }
            String[] temp = current.data;
            current.data = max.data;
            max.data = temp;
            current = current.next;
        }
    }

    public int getTeamPoint(DoubleLinkedList driversList, String driverName) {
        Node current = driversList.getHead();
        while (current != null) {
            if (current.data[1].equals(driverName)) {
                return Integer.parseInt(current.data[4]);
            }
            current = current.next;
        }
        return 0;
    }
}