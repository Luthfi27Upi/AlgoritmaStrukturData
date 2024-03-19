# <p align ="center">  LAPORAN PRAKTIKUM IV ALGORITMA DAN STRUKTUR DATA </p> 
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

<b>4.1 Percobaan 1 : Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer </b>

1. Buat Class <i>Faktorial</i>
![alt text](image.png)
2. Kemudian Tambahkan method <i>faktoBF()</i> nilai
![alt text](image-1.png)
3. Lalu Tambahkan method <i>faktoDC()</i> nilai
![alt text](image-2.png)
4. Setelah semuanya selesai Buatlah Class <i>MainFaktorial</i>
![alt text](image-3.png)
5. Kemudian Buat Array of Objek pada fungsi main
![alt text](image-5.png)
6. Terakhir tampilkan method <i>FaktoBF</i> dan <i>FaktoDC</i>
![alt text](image-4.png)
7. Maka hasilnya akan seperti ini
![alt text](image-6.png)

<b>4.11 Pertanyaan 1</b>

1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan
perbedaan bagian kode pada penggunaan if dan else!
2. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan
for?Buktikan!
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !

<b>4.2 Percobaan 2 : Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer</b>

1. Buat Class Pangkat
![alt text](image-7.png)
2. Kemudian buat method <i>PangkatBF</i>
![alt text](image-8.png)
3. Lalu tambahkan method <i>PangkatDC</i>
![alt text](image-9.png)
4. Setelah semuanya selesai Buatlah Class <i>MainPangkat</i>
![alt text](image-10.png)
5. Kemudian Buat Array of Objek pada fungsi main
![alt text](image-11.png)
6. Terakhir tampilkan method <i>FaktoBF</i> dan <i>FaktoDC</i>
![alt text](image-12.png)
7. Maka hasilnya akan seperti ini
![alt text](image-13.png)

<b>4.21 Pertanyaan 2</b>

1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan
konstruktor.
4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan
switch-case!

<b>4.3 Percobaan 3 : Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer</b>

1. Buat class sum
![alt text](image-14.png)
2. Kemudian tambahkan method <i>sumBF</i>
![alt text](image-15.png)
3. Lalu tambahkan method <i>sumDC</i>
![alt text](image-16.png)
4. Setelah semuanya selesai Buatlah Class MainSum
![alt text](image-17.png)
5. Kemudian Buat Array of Objek pada fungsi main
![alt text](image-18.png)
6. Terakhir tampilkan method sumBF dan sumDC
![alt text](image-19.png)
7. Maka hasilnya akan seperti ini
![alt text](image-20.png)

<b>4.31 Pertanyaan 3</b>
1. Mengapa terdapat formulasi return value berikut?Jelaskan! <i>return lsum+rsum+arr[mid];</i>
2. Kenapa dibutuhkan variable <i>mid</i> pada method <i>TotalDC()?</i>
3. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja.
Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa
perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan
dengan program!