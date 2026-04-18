package kelas_objek_01;
public class Motor {
    // atribut
    private String warna;
    private String merk;
    // constructor
    public Motor(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
    }
    //method
    public void tampilkanInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Merk: " + merk);
    }
}