# <p align ="center">  LAPORAN PRAKTIKUM VII ALGORITMA DAN STRUKTUR DATA </p> 
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

<b>7.1 Percobaan 1 : Penyimpanan Tumpukan</b>

Kode Program Barang<br>
![alt text](image-1.png)<br>
Kode Program Gudang<br>
![alt text](image-3.png)<br>
Kode Program Utama<br>
![alt text](image-4.png)<br>
Hasil Kode Program<br>
![alt text](image-6.png)<br>
![alt text](image-7.png)<br>

<b>7.11 Pertanyaan 1 : Penyimpanan Tumpukan</b>
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi 
hasil percobaan! Bagian mana saja yang perlu diperbaiki?<br><b>
Jawab : <br>
Pada file Gudang17.java terdapat Kode Program : <br><i>
public Barang17 lihatBarangTeratas(){<br>
if(!isEmpty()){}}</i><br>
Yang sebelumnya isEmpty kita ganti menjadi <i>if(!cekKosong)(){}</i> karena pada Kode File Gudang17 tidak terdapat method isEmpty.</b>
2. Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode 
programnya!
3. Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi 
tersebut dihapus, apa dampaknya?
4. Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat 
barang teratas, serta dapat secara bebas menentukan kapasitas gudang!
5. Commit dan push kode program ke Github

<b>7.2 Percobaan 2 : Konversi Kode Ke Biner</b>

<b>7.21 Pertanyaan 2 : Konversi Kode Ke Biner</b>

1. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), 
bagaimana hasilnya? Jelaskan alasannya!
2. Jelaskan alur kerja dari method konversiDesimalKeBiner

<b>Percobaan 3 : Konversi Iflix Ke Postfix</b>

Kode Program Postfix<br>
![alt text](image-2.png)
<br>
Kode Program PostfixMain<br>
![alt text](image.png)<br>
Hasil Kode Program<br>
![alt text](image-5.png)<br>

<b>Pertanyaan 3 : Konversi Iflix Ke Postfix</b>
1. Pada method derajat, mengapa return value beberapa case bernilai sama? Apabila return 
value diubah dengan nilai berbeda-beda setiap case-nya, apa yang terjadi?
2. Jelaskan alur kerja method konversi!
3. Pada method konversi, apa fungsi dari potongan kode berikut!?<br>
c = Q.charAt();<br><b> 