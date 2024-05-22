package FormulaOne17;

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
    public void print() {
        Node current = head;
        while (current != null) {
            for (String s : current.data) {
                System.out.print(s + " ");
            }
            System.out.println();
            current = current.next;
        }
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
                if (Integer.parseInt(max.data[3]) < Integer.parseInt(index.data[3])) {  // comparing team points
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
