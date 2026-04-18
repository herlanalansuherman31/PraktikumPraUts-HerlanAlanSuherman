package Pewarisan_06;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Herlan Alan Suherman";
        mahasiswa.umur = 24;
        mahasiswa.nim = "123456";
        mahasiswa.tampilkanNim();

        // Membuat objek Dosen
        Dosen dosen = new Dosen();
        dosen.nama = "Dr. Ahmad";
        dosen.umur = 40;
        dosen.nidn = "987654";
        dosen.tampilkanNidn();
    }
}
