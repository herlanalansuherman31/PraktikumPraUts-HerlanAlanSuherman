package Enkapsulasi_05;
public class Mahasiswa {
    // atribut
    private String nama;
    private int sks;
    // constructor
    public Mahasiswa(String nama, int sks) {
        this.nama = nama;
        this.sks = sks;
    }
    // method
    public void setsks(int sks) {
        this.sks = sks;
    }
    public int getsks() {
        return sks;
    }
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
    }
}
