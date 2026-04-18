# Pewarisan (Inheritance) (06)

Folder ini mengilustrasikan konsep pewarisan dalam Java, di mana kelas anak mewarisi atribut dan method dari kelas induk.

## File dalam Folder:
- `Orang.java`: Berisi kelas `Orang` sebagai superclass dengan atribut `nama` dan `umur`, serta method `tampilkanInfo()`. Juga mendefinisikan subclass `Mahasiswa` dan `Dosen` yang mewarisi dari `Orang`.
- `Main.java`: Kelas utama yang membuat objek `Mahasiswa` dan `Dosen`, mengatur atributnya, dan memanggil method yang diwarisi.

## Cara Menjalankan:
1. Pastikan Anda berada di direktori folder ini.
2. Compile semua file Java:
   ```
   javac -d . *.java
   ```
3. Jalankan program:
   ```
   java -cp . Pewarisan_06.Main
   ```

Output yang diharapkan:
```
Nama: Herlan Alan Suherman
Umur: 24 tahun
NIM: 123456
Nama: Dr. Ahmad
Umur: 40 tahun
NIDN: 987654
```