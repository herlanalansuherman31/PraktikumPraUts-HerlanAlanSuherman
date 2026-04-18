package Polimorfisme_07;
class Hewan {
    void suara() {
        System.out.println("suara hewan");
    }
}
class Herbivora extends Hewan {
    void suara() {
        System.out.println("suara herbivora");
    }
}
class Carnivora extends Hewan {
    void suara() {
        System.out.println("suara carnivora");
    }
}
class kelinci extends Herbivora {
    void suara() {
        System.out.println("suara kelinci");
    }
}