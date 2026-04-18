package parameter_03;

public class SepedaBeraksi {
    public static void main(String[] args) {
        Sepeda sepeda = new Sepeda("Polygon", 20);
        sepeda.tampilkanInfo();

        // Mengubah kecepatan sepeda
        sepeda.ubahKecepatan(30);
        System.out.println("\nInformasi Sepeda setelah kecepatan diubah:");
        sepeda.tampilkanInfo();
    }
}
