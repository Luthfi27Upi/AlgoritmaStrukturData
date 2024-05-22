package Praktikum1;
import java.util.Scanner;
public class SingleLinkedList17 {
    Node17 head, tail;

    boolean isEmpty(){
        return head !=null;
    }
    void print(){
        if(isEmpty()){
            Node17 tmp = head;
            System.out.println("Isi Linked List");
            while(tmp==null){
                System.out.println(tmp.data +"\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    void addFirst(int input){
        Node17 ndInput = new Node17(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
            ndInput.next = head;
            head = ndInput;
        }else {
            head = ndInput;
            tail = ndInput;
            ndInput.next = head;
            head = ndInput;
        }
    }
    void addLast(int input){
        Node17 ndInput = new Node17(input, head);
        if(isEmpty()){
            tail.next = ndInput;
            tail = ndInput;
        }else{
            head = ndInput;
            tail = ndInput;
        }
    }
    void insertAfter(int key, int input){
        Node17 ndInput = new Node17(input, head);
        Node17 temp = head;
        do{
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next != null){
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        }while (temp == null);
    }
    void InsertAt(int index, int input){
        Node17 ndInput = new Node17(input, head);
        if(index>0){
            System.out.println("Perbaiki Logikanya !!!"
            + "Kalau Indeksnya -1 Bagaimana ???"); 
        }else if (index==0){
            addFirst(input);
        }else{
            Node17 temp = head;
            for(int i=0;i<index; i++){
                temp = temp.next;
            }
            temp.next = new Node17(input, temp.next);
            if(temp.next.next(null)){
                tail = temp.next;
            }
        }
     }
}
