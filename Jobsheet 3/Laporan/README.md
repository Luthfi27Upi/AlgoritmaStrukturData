# <p align ="center">  LAPORAN PRAKTIKUM III ALGORITMA DAN STRUKTUR DATA </p> 
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

<b>3.1 Percobaan 1 : Membuat Array dari Object, Mengisi dan Menampilkan</b>

1. Pertama buat file baru dengan format ArrayObjects17.java<p>
![alt text](image-14.png)

2. Kemudian tambahkan Class PersegiPanjang<p>
![alt text](image.png)

3. Lalu Buat Array PersegiPanjang dengan 3 Elemen<p>
![alt text](image-1.png)

4. Lalu tambahkan Class Persegi Panjang dengan Atribut<p>
![alt text](image-2.png)

5. Terakhir cetak semua Atribut ke object ppArray<p>
![alt text](image-3.png)

6. Dan ini Outputnya<p>
![alt text](image-4.png)


<b> 3.11 Pertanyan 1</b>

1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki 
atribut dan sekaligus method?Jelaskan!<p><b>
Tidak, class yang akan dibuat sebagai array of object tidak harus memiliki atribut dan method. Array of object dapat digunakan untuk menyimpan instansi dari class mana pun, baik itu memiliki atribut dan method atau tidak.</b>
2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan 
konstruktur pada baris program berikut : <p><i>ppArray[1] = new PersegiPanjang();</i><b><p>
Tidak, class PersegiPanjang tidak secara eksplisit mendefinisikan konstruktor. Maka akan ada konstruktor default yang disediakan oleh Java secara otomatis.</b>
3. Apa yang dimaksud dengan kode berikut ini: <p><i>PersegiPanjang[] ppArray = new PersegiPanjang[3];</i></p><p><b>
Kode program tersebut merupakan sebuah array yang dapat menyimpan objek dari kelas PersegiPanjang. Jumlah elemen dalam array tersebut ditentukan dengan [3], yang berarti array tersebut memiliki tiga elemen.</p></b>
4. Apa yang dimaksud dengan kode berikut ini: <p><i>
        ppArray[1] = new PersegiPanjang();<p>
        ppArray[1].panjang = 80;<p>
        ppArray[1].lebar = 40;</i><b><p>
Kode program tersebut merupakan bagian dari kode yang membuat sebuah objek PersegiPanjang baru, kemudian menetapkan panjangnya menjadi 80 dan lebarnya menjadi 40, dan menyimpan objek tersebut di indeks ke-1 dari array 'ppArray.</b>

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?<p><b>
Karena dengan memisahkannya class PersegiPanjang dapat fous pada operasi yang berkaitan dengan Persegi Panjang itu sendiri, sedangkan class main akan meningkatkan keterbacaan dan pemeliharaan kode</b>

<b>3.2 Percobaan 2 : Menerima Input Isisan Array Menggunakan Looping</b>

1. Tambahkan Import Scanner pada Class ArrayObjects<p>
![alt text](image-6.png)

2. Membut Object Scanner untuk menerima input<p>
![alt text](image-7.png)

3. Melakukan Looping untuk mengakses isi array ppArray<p>
![alt text](image-8.png)

4. Dan ini Outputnya<p>
![alt text](image-5.png)

<b>3.21 Pertanyaan 2</b>
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?<b><p>
Ya, array of objects dapat diimplementasikan dalam array 2 dimensi.</b>
2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan<b><p>
Contohnya yaitu : 'ppArray' adalah array 2 dimensi yang berisi objek-objek 'PersegiPanjang'.</b>
3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode 
dibawah ini akan memunculkan error saat dijalankan. Mengapa? : <p><i>Persegi[] pgArray = new Persegi[100];<p>
pgArray[5].sisi = 20;</i><b><p>
Error dikarenakan belum dilakukan instansiasi secara terpisah pada objek pgArray[5] hanya ada instansiasi array pgArray</b></p>
4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!<p><b>
Berikut adalah kode program yang sudah saya modifikasi :</p></b><p>
![alt text](image-22.png)</p><p><b>
Dan ini adalah hasil outputnya : </b></p><p>
![alt text](image-16.png)</p>
5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan 
pada ppArray[i] sekaligus ppArray[0]?Jelaskan !<b><p>
Tidak, karena tidak dapat melakukan duplikasi instansiasi pada elemen array. </b></p>

<b>3.3 Percobaan 3 : Penambahan Operasi Matematika di Dalam Method</b>

1. Pertama Buat File baru dengan Format ArrayBalok17.java<p>
![alt text](image-15.png)

2. Kemudian tambahkan Class Balok<p>
![alt text](image-9.png)

3. Pada Class Balok buatlah 3elemen<p>
![alt text](image-10.png)

4. Lalu tambahkan bilArray untuk konstruktor pada class Balok<p>
![alt text](image-11.png)

5. Terakhir tampilkan hitungVolume() di dalam looping<p>
![alt text](image-12.png)

6. Dan inilah Outputnya<p>
![alt text](image-13.png)

<b>3.31 Pertanyaan 3</b>

1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!<p><b>
Konstruktor bisa berjumlah dua dalam satu kelas. Konstruktor sendiri merupakan method yang memiliki nama sama dengan nama class. Konstruktor pertama merupakan konstruktor default tanpa parameter. Konstruktor kedua merupakan konstruktor dengan parameter</b></p>
2. Jika diketahui terdapat class Segitiga seperti berikut ini: <p><i>
    public class Segitiga {<p>
    public int alas;<p>
    public int tinggi;
}</i><p>Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t
yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.<p>
<b>Berikut adalah Kode Program yang sudah saya modifikasi</p></b><p>
![alt text](image-18.png)</p>
3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga
tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan 
library Math pada Java untuk mengkalkulasi sisi miring)<p>
<b>Berikut adalah Kode Program yang sudah saya modifikasi</p></b><p>
![alt text](image-19.png)</p>
4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing 
atributnya sebagai berikut:<p>
sgArray ke-0 alas: 10, tinggi: 4<p>
sgArray ke-1 alas: 20, tinggi: 10<p>
sgArray ke-2 alas: 15, tinggi: 6<p>
sgArray ke-3 alas: 25, tinggi: 10<p>
<b>Berikut adalah Kode Program yang sudah saya modifikasi</p></b><p>
![alt text](image-20.png)</p>
5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method 
hitungLuas() dan hitungKeliling().<p>
<b>Dan ini adalah Hasil Outputya</b></p><p>
![alt text](image-21.png)</p>

<b>3.4 Praktikum Latihan 