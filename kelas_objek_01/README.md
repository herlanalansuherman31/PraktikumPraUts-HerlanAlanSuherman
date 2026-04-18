# Kelas dan Objek (01)

Folder ini berisi contoh dasar penggunaan kelas dan objek dalam bahasa pemrograman Java. Konsep ini merupakan fondasi dari pemrograman berorientasi objek (OOP).

## File dalam Folder:
- `Motor.java`: Mendefinisikan kelas `Motor` dengan atribut `warna` dan `merk`, konstruktor, dan method `tampilkanInfo()`.
- `MotorBeraksi.java`: Kelas utama yang membuat objek `Motor` dan menampilkan informasinya.

## Cara Menjalankan:
1. Pastikan Anda berada di direktori folder ini.
2. Compile semua file Java:
   ```
   javac -d . *.java
   ```
3. Jalankan program:
   ```
   java -cp . kelas_objek_01.MotorBeraksi
   ```

Output yang diharapkan:
```
Warna: Merah
Merk: Honda
```