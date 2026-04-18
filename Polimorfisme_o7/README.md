# Polimorfisme (07)

Folder ini menjelaskan polimorfisme dalam Java, di mana objek dari subclass dapat diperlakukan sebagai objek superclass, dan method yang sama dapat memiliki implementasi berbeda.

## File dalam Folder:
- `Hewan.java`: Mendefinisikan hierarki kelas: `Hewan` sebagai superclass, `Herbivora` dan `Carnivora` sebagai subclass, dan `kelinci` sebagai subclass dari `Herbivora`. Setiap kelas mengoverride method `suara()`.
- `HewanPolimor.java`: Kelas utama yang mendemonstrasikan polimorfisme dengan membuat objek berbagai jenis hewan dan memanggil method `suara()`.

## Cara Menjalankan:
1. Pastikan Anda berada di direktori folder ini.
2. Compile semua file Java:
   ```
   javac -d . *.java
   ```
3. Jalankan program:
   ```
   java -cp . Polimorfisme_o7.HewanPolimor
   ```

Output yang diharapkan:
```
suara hewan
suara herbivora
suara carnivora
suara kelinci
```