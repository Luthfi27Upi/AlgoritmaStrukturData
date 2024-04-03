public class Gudang17 {
    Barang17[] tumpukan;
    int size;
    int top;

    public Gudang17(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang17[size];
        top = -1;
    }
    public boolean cekPenuh() {
        if (top == size -1) {
            return true;
        }else{
            return false;
        }
    }
    public boolean cekKosong() {
        if(top == -1) {
            return true;
        }else{
            return false;
        }
    }
    public void tambahBarang(Barang17 brg){
        if(!cekPenuh()){
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " +brg.nama+ " Berhasil ditambahkan ke Gudang");
        }else{
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }
    public Barang17 ambilBarang(){
        if(!cekKosong()){
            Barang17 delete = tumpukan[top];
            top--;
            System.out.println("Barang "+delete.nama+" Diambil Dari Gudang.");
            System.out.println("Kode unik dalam Biner : "+konversiDesimalKeBiner(delete.kode));
            return delete;
        }else{
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    public Barang17 lihatBarangTeratas(){
        if(!cekKosong()){
            Barang17 barangTeratas = tumpukan[top];
            System.out.println("Barang Teratas : "+barangTeratas.nama);
            return barangTeratas;
        }else{
            System.out.println("Tumpukan Barang Kosong.");
            return null;
        }
    }
    public void tampilkanBarang(){
        if(!cekKosong()){
            System.out.println("Rincian tumpukan barang di Gudang :");
            for (int i=top; i >=0; i--){
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        }else{
            System.out.println("Tumpukan Barang Kosong.");
        }
    }
    public String konversiDesimalKeBiner(int kode){
        StackKonversi17 stack = new StackKonversi17();
        while (kode>0){
            int sisa = kode % 2;
            stack.push(size);
            kode = kode/2;
        }
        String biner = new String();
        while (!stack.isEmpty()){
            biner += stack.pop();
        }
        return biner;
    }
}