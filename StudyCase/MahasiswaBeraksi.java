package StudyCase;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.println("Informasi Mahasiswa 1:");
        mahasiswa.nama = "Herlan Alan Suherman";
        mahasiswa.nim = "I.2510319";
        mahasiswa.olahraga = "Basket";
        mahasiswa.tampilkanNama();
        mahasiswa.tampilkanNim();
        mahasiswa.tampilkanOlahraga();
        System.out.println("\nInformasi Mahasiswa 2:");
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Grace Ashcroft";
        mahasiswa2.nim = "987654";
        mahasiswa2.olahraga = "Basket";
        mahasiswa2.tampilkanNama();
        mahasiswa2.tampilkanNim();
        mahasiswa2.tampilkanOlahraga();
        System.out.println("\nInformasi Mahasiswa 3:");
        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.nama = "Ada wong";
        mahasiswa3.nim = "456789";
        mahasiswa3.olahraga = "Voli";
        mahasiswa3.tampilkanNama();
        mahasiswa3.tampilkanNim();
        mahasiswa3.tampilkanOlahraga();
    }
}
