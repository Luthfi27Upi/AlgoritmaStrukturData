package DoubleLinkedList;

public class DoubleMain {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size " + dll.size());
        System.out.println("=====================================");
        try {
            dll.add(40, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=====================================");
        try {
            System.out.println("Data Awal Pada Linked Lists Adalah : " + dll.getFirst());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Data Akhir Pada Linked Lists Adalah : " + dll.getLast());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Data Indeks Ke-1 Pada Linked Lists Adalah : " + dll.get(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=====================================");
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=====================================");
        try {
            dll.removeFirst();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=====================================");
        try {
            dll.removeLast();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=====================================");
        try {
            dll.remove(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        dll.print();
        System.out.println("Size : " + dll.size());
    }
}