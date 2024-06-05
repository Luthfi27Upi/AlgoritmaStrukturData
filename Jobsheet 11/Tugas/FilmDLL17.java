package Tugas;

public class FilmDLL17 {
    NodeF head;
    int size;

    public FilmDLL17() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void addFirst(int id, String nama, double rating) {
        if (isEmpty()) {
            head = new NodeF(null, id, nama, rating, null);
        } else {
            NodeF newNode = new NodeF(null, id, nama, rating, head);
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    public void addLast(int id, String nama, double rating) {
        if (isEmpty()) {
            addFirst(id, nama, rating);
        } else {
            NodeF current = head;

            while (current.next != null) {
                current = current.next;
            }

            NodeF newNode = new NodeF(current, id, nama, rating, null);
            current.next = newNode;
            size++;
        }
    }

    public void addAtIndex(int id, String nama, double rating, int index) throws Exception {
        if (isEmpty()) {
            addFirst(id, nama, rating);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas!");
        } else {
            NodeF current = head;
            int i = 0;

            while (i < index) {
                current = current.next;
                i++;
            }

            if (current.prev == null) {
                NodeF newNode = new NodeF(null, id, nama, rating, current);
                current.prev = newNode;
                head = newNode;
            } else {
                NodeF newNode = new NodeF(current.prev, id, nama, rating, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }

        size++;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            NodeF current = head;

            while (current != null) {
                System.out.println("ID : " + current.id);
                System.out.println(" Judul : " + current.judul);
                System.out.println(" Rating : " + current.rating);
                current = current.next;
            }
        } else {
            System.out.println("Linked List Kosong!");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        NodeF current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
        size--;
    }

    public void removeAtIndex(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            NodeF current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }

            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }

            size--;
        }
    }

    public NodeF getFilmById(int key) {
        NodeF current = head;

        while (current != null) {
            if (current.id == key) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    public int getFilmIndexById(int key) {
        NodeF current = head;

        for (int i = 0; current != null; i++) {
            if (current.id == key) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    public void sortFilmDesc() throws Exception {
        NodeF current, previous;
        boolean sorted;

        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat disortir!");
        } else {
            do {
                sorted = true;
                current = head;
                previous = null;

                while (current.next != null) {
                    if (current.rating < current.next.rating) {
                        NodeF temp = current.next;

                        if (previous == null) {
                            head = temp;
                        } else {
                            previous.next = temp;
                        }
                        current.next = temp.next;
                        temp.next = current;

                        sorted = false;
                        previous = temp;

                    } else {
                        previous = current;
                        current = current.next;
                    }
                }
            } while (!sorted);
        }
    }
}