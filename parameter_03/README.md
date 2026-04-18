# Parameter (03)

Folder ini mendemonstrasikan penggunaan parameter dalam method Java, di mana method dapat menerima nilai sebagai input untuk mengubah perilaku objek.

## File dalam Folder:
- `Sepeda.java`: Kelas `Sepeda` dengan atribut `merk` dan `kecepatan`, konstruktor, method `ubahKecepatan(int kecepatanBaru)` yang menggunakan parameter, dan `tampilkanInfo()`.
- `SepedaBeraksi.java`: Kelas utama yang membuat objek `Sepeda` dan mengubah kecepatannya menggunakan parameter.

## Cara Menjalankan:
1. Pastikan Anda berada di direktori folder ini.
2. Compile semua file Java:
   ```
   javac -d . *.java
   ```
3. Jalankan program:
   ```
   java -cp . parameter_03.SepedaBeraksi
   ```

Output yang diharapkan:
```
Merk: Polygon
Kecepatan: 20 km/jam

Informasi Sepeda setelah kecepatan diubah:
Merk: Polygon
Kecepatan: 30 km/jam
```