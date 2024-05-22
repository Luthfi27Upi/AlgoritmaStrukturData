package Praktikum1;

public class SLIMain17 {
    public static void main(String[] args) {
        SingleLinkedList17 singLL = new SingleLinkedList17();

        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 900);
        singLL.print();
        singLL.InsertAt(3, 833);
        singLL.print();
    }
}
