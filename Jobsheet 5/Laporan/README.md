# <p align ="center">  LAPORAN PRAKTIKUM V ALGORITMA DAN STRUKTUR DATA </p> 
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

<b>5.11 Percobaan 1 : Bubble Sort</b>

1. Pertama Buat Class <i>Mahasiswa</i><br>
![alt text](image.png)
2. Kemudian Tambahkan Atribut, Konstruktor dan Methode<br>
![-](image-1.png)
3. Setelah itu buat class <i>DaftarMaPres</i><br>
![alt text](image-2.png)
4. Lalu Tambahkan Method <i>Tambah()</i><br>![alt text](image-3.png)
5. Kemudian Tambahkan Method <i>Tampil()</i><br>
![alt text](image-4.png)
6. Lalu Tambahkan Method <i>BubbleSort()</i><br>
![alt text](image-5.png)
7. Setelah itu buat class <i>Main</i><br>
![alt text](image-6.png)
8. Terakhir Tampilkan fungsi <i>BubbleSort</i><br>
![alt text](image-7.png)
9. Dan inilah Outputnya<br>
![alt text](image-8.png)

<b>5.11 Pertanyaan 1</b>

1. Terdapat di method apakah proses bubble sort?
2. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini<br><i>
if(listMhs[j].ipk > listMhs[j-1].ipk){<br>
    Mahasiswa17 tmp = listMhs[j];<br>
    listMhs[j] = listMhs[j-1];<br>
    listMhs[j-1] = tmp;<br>
}<br></i>
Untuk apakah proses tersebut?
3. Perhatikan perulangan di dalam bubbleSort() di bawah ini:<br><i>
for(int i=0; i<listMhs.length-1; i++){<br>
for(int j=1; j<listMhs.length-i; j++){<br></i>
a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j? <br>
b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?<br>
c. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?<br>
d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan 
berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh