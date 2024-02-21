# <p align ="center">  LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p> 
<br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="50%"> </p>

<br>


<p align = "center"> Nama  : Luthfi Triaswangga </p>
<p align = "center"> NIM   : 2341720208 </p>
<p align = "center"> Prodi : TEKNIK INFOMATIKA</p>
<p align = "center"> Kelas : 1B </p>
<br><br>
<b>2.1 Percobaan 1 : Deklarasi Class, Atribut, dan Method</b>

1. Pertama buat file dengan format Buku17.java

    ![alt text](image.png)

2. Kemudian tambahkan Class Buku dengan Atribut

    ![alt text](image-1.png)

3. Lalu tambahkan Class Buku dengan Method

    ![alt text](image-2.png)

4. Maka hasilnya akan seperti ini

    ![alt text](image-3.png)

    <br>

<b>2.11 Pertanyaan 1</b>

1. Sebutkan dua karakteristik Class atau Object!<p>
<b>Encapsulation (Enkapsulasi): Enkapsulasi adalah konsep yang mengacu pada pembungkusan (wrapping) data dan metode (methods) yang bekerja pada data ke dalam satu unit tunggal, yaitu kelas, dan Inheritance (Warisan): Warisan adalah konsep di mana sebuah kelas dapat mewarisi sifat-sifat (data dan metode) dari kelas lain.</p></b>

2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class
Buku? Sebutkan apa saja atributnya!
<b><p>Ada lima Atribut : </p>
* String judul
* String pengarang
* int halaman
* int stok
* int harga</b>

3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
<b><p>Ada empat Method :</p>
* TampilInformasi(string[] args)
* terjual(int jml)
* restock(int jml)
* gantiHarga(int hrg)</b>

4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut
sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!
<b><p>Berikut adalah hasil kode program yang sudah saya modifikasi </p></b>
![alt text](image-8.png)
![alt text](image-9.png)

5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int<p><b> Karena parameter tersebut digunakan untuk menentukan jumlah buku yang akan ditambahkan ke dalam stok buku. Dengan menggunakan parameter ini, pengguna dapat menentukan jumlah buku yang ingin ditambahkan saat melakukan operasi restock.</b></p>

6. Commit dan push kode program ke Github<p>
![alt text](image-7.png)</p>
<br>

<b>2.2 Percobaan 2 : Instansi Object, serta mengakses Atribut dan Method</b>

1. Pertama buat file dengan format BukuMain17.java

    ![alt text](image-4.png)

2. Kemudian tambahkan struktur data dan fungsi main() lalu tambahkan Atribut dan Method di dalamnya

    ![alt text](image-5.png)

3. Lalu jalankan programnya

    ![alt text](image-6.png)
4. Terakhir Commit dan Push ke GitHub

    ![alt text](image-7.png)
<br><br>

<b>2.21 Pertanyaan 2</b>

1. Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi!
Apa nama object yang dihasilkan?<p>
<b>Nama objek yang dihasilkan adalah <i>bk17</i></b>

2. Bagaimana cara mengakses atribut dan method dari suatu objek?<p>
<b> untuk mengakses method dari suatu objek penggunaan kedua aksi tersebut sudah diperlihatkan. Misalnya, untuk mengakses atribut judul buku dari objek bk17, Anda menggunakan bk17.judul, dan untuk memanggil method TampilInformasi() dari objek bk17, Anda menggunakan bk17.TampilInformasi(args).</p></b>

3. Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?<p>
<b>Karena pemanggilan method TampilInformasi() pertama dan kedua mungkin berbeda karena ada perubahan yang dilakukan pada objek bk17 di antara dua pemanggilan tersebut.</p></b>

<br>
<b>2.3 Percobaan 3 : Membuat Konstruktor</b>

1. Buka kembali Class Buku17 lalu tambahkan dua buah Konstruktor<p>![alt text](image-10.png)</p>

2. Kemudian buka kembali Class BukuMain17 lalu buat object bernama bk172 <p>
![alt text](image-11.png)</p>
3. Maka hasilnya akan seperti dibawah ini<p>
![alt text](image-12.png)
4. Push dan Commit ke GitHub<p>
![alt text](image-7.png)

<b>2.32 Pertanyaan 3 </b>
1. Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk
mendeklarasikan konstruktor berparameter!<p>
![alt text](image-10.png)</p>
2. Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut?<p><b><i>
Buku17 bk172 = new Buku17("One Piece", "Luffy", 160, 29, 59000);</b></p></i>
3. Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana
hasilnya? Jelaskan mengapa hasilnya demikian!<p>
<b>Maka yang terjadi akan error</p>
![alt text](image-14.png)<p>Karena setelah menghapus konstruktor default, Anda harus secara eksplisit menyediakan konstruktor lain jika ingin membuat objek dari kelas tersebut.</b></p>
4. Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses
secara berurutan? Jelaskan alasannya!<p>
<b>Tidak, Method di dalam Class Buku17 tidak harus diakses secara berurutan setelah melakukan instansiasi objek.</p><p>Karena dalam pemrograman Java, urutan pemanggilan method tidak mempengaruhi hasil dari eksekusi program, kecuali ada ketergantungan antara method tersebut yang membutuhkan urutan tertentu.</b></p>
5. Buat object baru dengan nama buku NamaMahasiswa menggunakan konstruktor
berparameter dari class Buku!<p>
<b><i>Buku17 bkLuthfi = new Buku17("Ghibli", "Luthfi", 150, 20, 45000);</p><p></i>
Lalu jika ingin menampilkan objek tersebut bisa dipanggil dengan menggunakan bkLuthfi.TampilInformasi();
6. Commit dan Push ke GitHub<p>
![alt text](image-15.png)</p>