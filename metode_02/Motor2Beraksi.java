package metode_02;

public class Motor2Beraksi {
    public static void main(String[] args) {
        Motor2 motor = new Motor2("hitam", "yamaha");
        motor.tampilkanInfo();

        // Mengubah atribut motor
        motor.setWarna("Biru");
        motor.setMerk("suzuki");
        System.out.println("\nInformasi Motor setelah diubah:");
        motor.tampilkanInfo();
    }
}
