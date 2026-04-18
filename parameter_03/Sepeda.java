package parameter_03;

public class Sepeda {
    //atribut
    private String merk;
    private int kecepatan;
    //constructor
    public Sepeda(String merk, int kecepatan) {
        this.merk = merk;
        this.kecepatan = kecepatan;
    }
    //method
    public void ubahKecepatan(int kecepatanBaru) {
        this.kecepatan = kecepatanBaru;
    }
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}
