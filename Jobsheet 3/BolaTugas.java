public class BolaTugas {
    int jariJari;

    BolaTugas(int j) {
        jariJari = j;
    }

    double hitungLuas() {
        return 4 * 3.14 * jariJari * jariJari;
    }

    double hitungVolume() {
        return 4 / 3 * 3.14 * jariJari * jariJari * jariJari;
    }
}