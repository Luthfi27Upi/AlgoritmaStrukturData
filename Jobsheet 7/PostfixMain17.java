import java.util.Scanner;

public class PostfixMain17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan Ekspresi Matematika (Infix) : ");
        Q=sc.nextLine();
        Q=Q.trim();
        Q=Q+ ")";

        int total = Q.length();

        Postfix17 post = new Postfix17(total);
        P = post.konversi(Q);
        System.out.println("Postfix : "+P);
    }
}