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

1. Buat Class <i>Faktorial</i><br>
![alt text](image.png)
2. Kemudian Tambahkan method <i>faktoBF()</i> nilai<br>
![alt text](image-1.png)
3. Lalu Tambahkan method <i>faktoDC()</i> nilai<br>
![alt text](image-2.png)
4. Setelah semuanya selesai Buatlah Class <i>MainFaktorial</i><br>
![alt text](image-3.png)
5. Kemudian Buat Array of Objek pada fungsi main<br>
![alt text](image-5.png)
6. Terakhir tampilkan method <i>FaktoBF</i> dan <i>FaktoDC</i><br>
![alt text](image-4.png)
7. Maka hasilnya akan seperti ini<br>
![alt text](image-6.png)

<b>4.11 Pertanyaan 1</b>

1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan
perbedaan bagian kode pada penggunaan if dan else!<br><b>
Pada algoritma Divide Conquer terdapat fungsi rekursif yang mengembalikan dirinya sendiri. Pada bagian if merupakan base case dari fungsi rekursif jika parameter bernilai 1. Pada bagian else dilakukan rekursif yang memanggil dirinya sendiri dengan parameter awal dikurangi 1</b>
2. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan
for?Buktikan!<br><b>
Perulangan dapat digantikan dengan menggunakan perulangan while.</b><br>
![alt text](image-24.png)
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !<br><b>
Pada fakto *= i dilakukan operasi assignment dalam iterasi namun pada fakto = n * faktorialDC(n-1) dilakukan proses rekursif</b>

<b>4.2 Percobaan 2 : Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer</b>

1. Buat Class Pangkat<br>
![alt text](image-7.png)
2. Kemudian buat method <i>PangkatBF</i><br>
![alt text](image-8.png)
3. Lalu tambahkan method <i>PangkatDC</i><br>
![alt text](image-9.png)
4. Setelah semuanya selesai Buatlah Class <i>MainPangkat</i><br>
![alt text](image-10.png)
5. Kemudian Buat Array of Objek pada fungsi main<br>
![alt text](image-11.png)
6. Terakhir tampilkan method <i>FaktoBF</i> dan <i>FaktoDC</i><br>
![alt text](image-12.png)
7. Maka hasilnya akan seperti ini<br>
![alt text](image-13.png)

<b>4.21 Pertanyaan 2</b>

1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!<br><b>
Pada method PangkatBF terjadi penghitungan pangkat yang menggunakan algoritma Brute Force dengan menerapkan perhitungan per indeks pada perulangan. Sedangkan pada method PangkatDC menggunakan algoritma Devide Conquer yang membagi tiap bagian pangkat kemudian di hitung per bagian dan pada akhirnya di combine.</b>
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!<br><b>
Terdapat dalam method PangkatDC di bagian rekursif berikut :<br>
if (n % 2 == 1) { return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a); } else { return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));</b>
3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan
konstruktor.<br><b>
Berikut adalah Kode modifikasi nya<br></b>
![alt text](image-25.png)<br>
![alt text](image-26.png)
4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan
switch-case!<br><b>
Berikut adalah Kode Modifikasi nya<br></b>
![alt text](image-27.png)


<b>4.3 Percobaan 3 : Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer</b>

1. Buat class sum<br>
![alt text](image-14.png)
2. Kemudian tambahkan method <i>sumBF</i><br>
![alt text](image-15.png)
3. Lalu tambahkan method <i>sumDC</i><br>
![alt text](image-16.png)
4. Setelah semuanya selesai Buatlah Class MainSum<br>
![alt text](image-17.png)
5. Kemudian Buat Array of Objek pada fungsi main<br>
![alt text](image-18.png)
6. Terakhir tampilkan method sumBF dan sumDC<br>
![alt text](image-19.png)
7. Maka hasilnya akan seperti ini<br>
![alt text](image-20.png)

<b>4.31 Pertanyaan 3</b>
1. Mengapa terdapat formulasi return value berikut?Jelaskan! <i>return lsum+rsum+arr[mid];</i><br><b>
Untuk mencombine hasil penjumlahan sisi kiri (lsum), sisi kanan (rsum) dan bagian tengah (arr[mid]).</b>
2. Kenapa dibutuhkan variable <i>mid</i> pada method <i>TotalDC()?</i><br><b>
Untuk membagi array menjadi dua bagian sama panjang.</b>
3. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja.
Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa
perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan
dengan program!<br><b>
Berikut adalah Kode Modifikasi nya<br>
![alt text](image-28.png)
Dan ini adalah Hasil dari kode program tersebut</b><br>
![alt text](image-29.png)

<b>Latihan JS 4</b>

Tentukan:
1. top_acceleration tertinggi menggunakan Divide and Conquer!
2. top_acceleration terendah menggunakan Divide and Conquer!
3. Rata-rata top_power dari seluruh mobil menggunakan Brute Force!

Berikut adalah kode programnya : 
![alt text](image-21.png)

Berikut adalah kode program main : 
![alt text](image-22.png)

Dan inilah hasil dari kode program tersebut :
![alt text](image-23.png)