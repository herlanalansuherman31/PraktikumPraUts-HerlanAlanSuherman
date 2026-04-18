package Polimorfisme_o7;

public class HewanPolimor {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Herbivora();
        Hewan hewan3 = new Carnivora();
        Hewan hewan4 = new kelinci();
        hewan1.suara();
        hewan2.suara();
        hewan3.suara();
        hewan4.suara();
    }
}
