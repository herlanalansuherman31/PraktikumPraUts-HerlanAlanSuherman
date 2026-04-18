# Konstruktor (04)

Folder ini menjelaskan konsep konstruktor dalam Java, yang digunakan untuk menginisialisasi objek saat dibuat.

## File dalam Folder:
- `MobilBaru.java`: Kelas `MobilBaru` dengan atribut `warna` dan `merk`, konstruktor yang menerima parameter untuk inisialisasi, dan method `tampilkanInfo()`.
- `MObilBaruBeraksi.java`: Kelas utama yang membuat objek `MobilBaru` menggunakan konstruktor dan menampilkan informasinya.

## Cara Menjalankan:
1. Pastikan Anda berada di direktori folder ini.
2. Compile semua file Java:
   ```
   javac -d . *.java
   ```
3. Jalankan program:
   ```
   java -cp . Constructor_04.MObilBaruBeraksi
   ```

Output yang diharapkan:
```
Warna: Putih
Merk: Toyota
```