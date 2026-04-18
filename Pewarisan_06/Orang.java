package Pewarisan_06;

public class Orang {
    String nama;
    int umur;
    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}
class Mahasiswa extends Orang {
    String nim;
    void tampilkanNim() {
        super.tampilkanInfo(); // Memanggil method tampilkanInfo() dari kelas Orang untuk menampilkan nama dan umur
        System.out.println("NIM: " + nim);
    }
}
class Dosen extends Orang {
    String nidn;
    void tampilkanNidn() {
        super.tampilkanInfo(); // Memanggil method tampilkanInfo() dari kelas Orang untuk menampilkan nama dan umur
        System.out.println("NIDN: " + nidn);
    } 
}