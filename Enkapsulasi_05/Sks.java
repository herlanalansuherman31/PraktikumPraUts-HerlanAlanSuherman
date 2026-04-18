package Enkapsulasi_05;

public class Sks {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Herlan Alan Suherman", 24);
        mahasiswa.tampilkanInfo();

        // Mengubah SKS menggunakan setter
        mahasiswa.setsks(30);
        System.out.println("\nSetelah mengubah SKS:");
        mahasiswa.tampilkanInfo();
    }
}
