public class LimasTugas {
    int sisiAlas;
    int tinggi;

    LimasTugas(int a, int t) {
        sisiAlas = a;
        tinggi = t;
    }

    double hitungLuas() {
        double sisiMiring = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(sisiAlas / 2, 2));
        return (sisiAlas * sisiAlas) + (4 * (sisiAlas * sisiMiring / 2));
    }

    double hitungVolume() {
        return (sisiAlas * sisiAlas * tinggi / 3);
    }
}