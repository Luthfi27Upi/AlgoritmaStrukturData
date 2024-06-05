# <p align ="center">  LAPORAN PRAKTIKUM IX ALGORITMA DAN STRUKTUR DATA </p> 
<br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br>

<hr>
<p align = "center"> Nama  : Luthfi Triaswangga </p>
<p align = "center"> NIM   : 2341720208 </p>
<p align = "center"> Prodi : TEKNIK INFOMATIKA</p>
<p align = "center"> Kelas : 1B </p>
<hr><br>

<b>Praktikum 1 : Single Linked List</b><br>
Kode Program Class Node<br>
    package Praktikum1;

    public class Node17 {
    int data;
    Node17 next;

    Node17() {

    }

    Node17(int nilai, Node17 berikutnya) {
        data = nilai;
        next = berikutnya;
    }
    }

<br>Kode Program SingleLinkedList

    package Praktikum1;

    public class SingleLinkedList17 {
    Node17 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node17 tmp = head;
            System.out.print("Isi Linked List \t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;

            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input) {
        Node17 ndInput = new Node17(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node17 ndInput = new Node17(input, null);
        ndInput.data = input;
        if (!isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node17 ndInput = new Node17(input, null);
        Node17 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int input) {
        Node17 ndInput = new Node17(input, null);
        if (index == -1) {
            addFirst(input);
        } else {
            Node17 temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = new Node17(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
    }

<br>Kode Program Class Main

    package Praktikum1;

    public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList17 singLL = new SingleLinkedList17();
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();
    }
    }

<br> Output Kode Program<br>
![alt text](image.png)<br>

<hr><b>Pertanyaan 1 : Single Linked List<br></b>

1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?<br><b>
Karena belum ada data yang masuk (dilihat dari pengecekan head, dan head bernilai kosong), sehingga data linked list masih kosong dan mencetak peringatan "Linked List Kosong"</b><br>
2. Jelaskan kegunaan variable temp secara umum pada setiap method!<br><b>
Variabel temp digunakan instansiasi ke kelas node atau referensi ke node saat sedang melakukan operasi pada linked list. Variabel ini digunakan untuk melacak posisi saat melakukan iterasi melalui linked list atau saat mencari node tertentu.</b><br>
3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut<br>
`if (temp.next.next == null) { tail = temp.next; }`<br>
<b>Kode ini digunakan untuk memeriksa apakah node yang baru dimasukkan akan menjadi node terakhir dalam linked list setelah penambahan elemen. Jika iya, artinya node baru tersebut akan menjadi tail dari linked list.</b><br>

<hr><b>Praktikum 2</b><br>
Update Kode Program SingleLinkedList<br>

    package Praktikum1;

    public class SingleLinkedList17 {
    Node17 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node17 tmp = head;
            System.out.print("Isi Linked List \t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;

            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input) {
        Node17 ndInput = new Node17(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node17 ndInput = new Node17();
        ndInput.data = input;
        if (!isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node17 ndInput = new Node17(input, null);
        Node17 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int input) {
        Node17 ndInput = new Node17();
        if (index == -1) {
            addFirst(input);
        } else {
            Node17 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node17(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    int getData(int index) {
        Node17 tmp = head;
        for (int i = 0; i < index - 1; i++) {
            tmp = tmp.next;
        }
        return tmp.next.data;
    }

    int indexOf(int key) {
        Node17 tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node17 temp = head;
            while (temp.next == null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp.next;
        }
    }

    void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else {
            Node17 temp = head;
            while (temp != null) {
                if (temp.data == key && temp == head) {
                    removeFirst();
                    break;
                } else if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node17 temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
    }

<br>Update Kode Main<br>

    package Praktikum1;

    public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList17 singLL = new SingleLinkedList17();
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();

        System.out.println("Data pada indeks ke - 1 " + singLL.getData(1));
        System.out.println("Data 3 berada pada indeks ke- " + singLL.indexOf(760));

        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
    }
    }

<br>Update Output Kode Program<br>

![alt text](image-1.png)

<hr>Pertanyaan 2 <br>

1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!<br><b>
Untuk keluar dari perulangan while setelah menemukan nilai yang ditemukan untuk kemudian dihapus.<brr></b>
2. Jelaskan kegunaan kode dibawah pada method remove<br>
`else if (temp.next.data == key) {`<br>
`temp.next = temp.next.next;`<br>
<b>Digunakan untuk menghapus node yang memiliki nilai data yang sama dengan nilai key yang dicari yang kemudian digantikan dengan nilai selanjutnya.<br></b>

<hr><b>Tugas 1</b><br>

1. Implementasikan ilustrasi Linked List Berikut. Gunakan 4 macam penambahan data yang telah
dipelajari sebelumnya untuk menginputkan data.<br>

Kode program : Mahasiswa17, MahasiswaLinkedListed, Main<br>

Output Kode Program :<br>
![alt text](image-2.png)

2. Buatlah implementasi program antrian layanan unit kemahasiswaan sesuai dengan kondisi yang
ditunjukkan pada soal nomor 1! Ketentuan<br>
a. Implementasi antrian menggunakan Queue berbasis Linked List!<br>
b. Program merupakan proyek baru, bukan modifikasi dari soal nomor 1!<br>

Kode Program : MahasiswaQueue, QueueMain<br>

Output Kode Program :<br>

![alt text](image-3.png)<br>
![alt text](image-4.png)<br>
![alt text](image-5.png)<br>