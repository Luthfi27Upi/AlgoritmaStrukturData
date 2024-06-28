public class GraphMatriksMain17 {

    public static void main(String[] args) {

        GraphMatriks17 gedung = new GraphMatriks17(4);

        gedung.makeEdge(0, 1, 50);
        gedung.makeEdge(1, 0, 60);
        gedung.makeEdge(1, 2, 70);
        gedung.makeEdge(2, 1, 80);
        gedung.makeEdge(2, 3, 40);
        gedung.makeEdge(3, 0, 90);
        gedung.printGraph();
        System.out.println("Hasil setelah penghapusan edge :");
        gedung.removeEdge(2, 1);
        gedung.printGraph();
        gedung.degree(0);
    }
}