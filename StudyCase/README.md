# Study Case

Folder ini berisi contoh penerapan konsep OOP dalam skenario nyata, yaitu mengelola data mahasiswa.

## File dalam Folder:
- `Mahasiswa.java`: Kelas `Mahasiswa` dengan atribut `nama`, `nim`, dan `olahraga`, serta method untuk menampilkan masing-masing atribut.
- `MahasiswaBeraksi.java`: Kelas utama yang membuat beberapa objek `Mahasiswa` dan menampilkan informasi mereka.

## Cara Menjalankan:
1. Pastikan Anda berada di direktori folder ini.
2. Compile semua file Java:
   ```
   javac -d . *.java
   ```
3. Jalankan program:
   ```
   java -cp . StudyCase.MahasiswaBeraksi
   ```

Output yang diharapkan:
```
Informasi Mahasiswa 1:
Nama: Herlan Alan Suherman
NIM: I.2510319
Olahraga Favorit: Basket

Informasi Mahasiswa 2:
Nama: Grace Ashcroft
NIM: 987654
Olahraga Favorit: Basket

Informasi Mahasiswa 3:
Nama: Ada wong
NIM: 456789
Olahraga Favorit: Voli
```