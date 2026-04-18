# Metode (02)

Folder ini menjelaskan konsep metode dalam Java, termasuk penggunaan setter methods untuk mengubah nilai atribut objek.

## File dalam Folder:
- `Motor2.java`: Kelas `Motor2` dengan atribut `warna` dan `merk`, konstruktor, setter methods (`setWarna`, `setMerk`), dan method `tampilkanInfo()`.
- `Motor2Beraksi.java`: Kelas utama yang mendemonstrasikan penggunaan setter untuk mengubah atribut motor.

## Cara Menjalankan:
1. Pastikan Anda berada di direktori folder ini.
2. Compile semua file Java:
   ```
   javac -d . *.java
   ```
3. Jalankan program:
   ```
   java -cp . metode_02.Motor2Beraksi
   ```

Output yang diharapkan:
```
Warna: hitam
Merk: yamaha

Informasi Motor setelah diubah:
Warna: Biru
Merk: suzuki
```