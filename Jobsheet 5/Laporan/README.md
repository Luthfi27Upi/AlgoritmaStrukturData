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

1. Terdapat di method apakah proses bubble sort?<br><b>
Proses bubble sort terdapat di dalam method bubbleSort().</b>
2. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini<br><i>
if(listMhs[j].ipk > listMhs[j-1].ipk){<br>
    Mahasiswa17 tmp = listMhs[j];<br>
    listMhs[j] = listMhs[j-1];<br>
    listMhs[j-1] = tmp;<br>
}<br></i>
Untuk apakah proses tersebut?<br><b>
Proses tersebut adalah bagian dari algoritma bubble sort yang bertanggung jawab untuk menukar posisi dua elemen dalam array jika kondisi tertentu terpenuhi, yaitu jika elemen ke-j memiliki IPK yang lebih besar dari elemen ke-(j-1). Ini dilakukan untuk mengurutkan elemen dari yang terkecil ke yang terbesar.</b>
3. Perhatikan perulangan di dalam bubbleSort() di bawah ini:<br><i>
for(int i=0; i<listMhs.length-1; i++){<br>
for(int j=1; j<listMhs.length-i; j++){<br></i>
a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j? <br><b>
Perbedaan antara penggunaan perulangan i dan j adalah bahwa perulangan i digunakan untuk mengontrol iterasi melalui seluruh array, sementara perulangan j digunakan untuk membandingkan dan menukar elemen-elemen terkait dalam setiap iterasi i.</b>
b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?<br><b>
Syarat dari perulangan i adalah i < listMhs.length - 1 karena setelah setiap iterasi i, elemen terakhir sudah pasti berada di posisi yang benar setelah berjalannya algoritma bubble sort. Oleh karena itu, tidak perlu membandingkan elemen terakhir di setiap iterasi.</b>
c. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?<br><b>
 Syarat dari perulangan j adalah j < listMhs.length - i karena setiap iterasi i akan mengurangi jumlah elemen yang perlu dibandingkan di setiap iterasi j. Pada awalnya, perulangan j akan membandingkan semua elemen di array, tetapi setiap kali iterasi i berjalan, elemen terakhir dalam array sudah pasti berada di posisi yang benar, sehingga tidak perlu dibandingkan lagi.</b>
d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan 
berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh<br><b>
Jika banyak data di dalam listMhs adalah 50, maka perulangan i akan berlangsung sebanyak 49 kali. Ini karena setiap iterasi i mengurangi jumlah elemen yang harus dibandingkan. Tahap bubble sort yang ditempuh adalah sebanyak 49 tahap, karena setiap iterasi i memindahkan setidaknya satu elemen ke posisi yang benar.</b>

<b>5.2 Percobaan 2 : Selection Sort</b>

1. Tambahkan method <i>SelectionSort</i> secara ascending<br>
![alt text](image-9.png)

2. Kemudian Tambahkan Method Selection Sort di class Main<br>
![alt text](image-10.png)

3. Dan ini adalah hasil outputnya<br>
![alt text](image-11.png)

<b>5.21 Pertanyaan 2</b>

Di dalam method selection sort, terdapat baris program seperti di bawah ini:<br><i>
for(int i=0; i<listMhs.length-1; i++){<br>
    int idxMin = 1;<br>
    for(int j=i+1; j<listMhs.length; j++){<br>
        if(listMhs[j].ipk < listMhs[idxMin].ipk){<br>
        idxMin = j;<br></i>
Untuk apakah proses tersebut, jelaskan!<br><b>
Didalam proses method Selection Sort yaitu salah satu algoritma pengurutan sederhana yang bekerja dengan cara memilih elemen dengan nilai terkecil pada setiap iterasi dan menukar elemen tersebut dengan elemen pada posisi iterasi saat itu. Tujuan dari proses ini adalah untuk menyusun elemen-elemen dalam urutan yang benar secara berurutan.

<b>5.3 Percobaan 3 : Insertion Sort</b>

1. Tambahkan method <i>InsertionSort</i> secara ascending<br>
![alt text](image-12.png)
2. Kemudian Tambahkan Method Insertion Sort di class Main<br>
![alt text](image-13.png)
3. Dan ini adalah hasil outputnya<br>
![alt text](image-14.png)

<b>5.31 Pertanyaan 3</b>

Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting 
dengan cara descending<br><b>
Dibawah ini adalah kode yang sudah saya modifikasi</b>
![alt text](image-15.png)<br><b>
Dan Ini adalah Output dari Kode Modifikasi</b>
![alt text](image-16.png)

<b>Latihan</b>