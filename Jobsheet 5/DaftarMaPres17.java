public class DaftarMaPres17 {
    Mahasiswa17 listMhs[] = new Mahasiswa17[5];
    int idx;

    void tambah(Mahasiswa17 m){
        if(idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh!!!");
        }
    }
    void tampil(){
        for(Mahasiswa17 m : listMhs){
            m.tampil();
            System.out.println("=========================");
    
        }
    }
    void BubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
             for(int j=1; j<listMhs.length-i; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    Mahasiswa17 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
             }
        }
    }
    void SelectionSort(){
        for(int i=0; i<listMhs.length-1; i++){
            int idxMin = 1;
            for(int j=i+1; j<listMhs.length; j++){
                if(listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
        Mahasiswa17 tmp = listMhs[idxMin];
        listMhs[idxMin] = listMhs[i];
        listMhs[i] = tmp;
        }
    }
    void InsertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa17 temp = listMhs[i];
            int j = i - 1;
            while (j >= 0 && listMhs[j].ipk < temp.ipk) {
                listMhs[j + 1] = listMhs[j];
                j--;
            }
            listMhs[j + 1] = temp;
        }
    }
    
}