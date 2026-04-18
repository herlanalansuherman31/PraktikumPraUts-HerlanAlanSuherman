# Enkapsulasi (05)

Folder ini menunjukkan prinsip enkapsulasi dalam OOP, di mana atribut objek disembunyikan (private) dan diakses melalui getter dan setter methods.

## File dalam Folder:
- `Mahasiswa.java`: Kelas `Mahasiswa` dengan atribut private `nama` dan `sks`, konstruktor, getter dan setter untuk `sks`, dan method `tampilkanInfo()`.
- `Sks.java`: Kelas utama yang mendemonstrasikan penggunaan enkapsulasi dengan mengubah SKS mahasiswa melalui setter.

## Cara Menjalankan:
1. Pastikan Anda berada di direktori folder ini.
2. Compile semua file Java:
   ```
   javac -d . *.java
   ```
3. Jalankan program:
   ```
   java -cp . Enkapsulasi_05.Sks
   ```

Output yang diharapkan:
```
Nama: Herlan Alan Suherman
SKS: 24

Setelah mengubah SKS:
Nama: Herlan Alan Suherman
SKS: 30
```