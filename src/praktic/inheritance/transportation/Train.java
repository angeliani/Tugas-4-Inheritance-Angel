package praktic.inheritance.transportation;

// kelas Kereta yang merupakan subclass dari Vehicle
public class Train extends Vehicle {
    // konstruktor kereta yang memanggil konstruktor superclass Vehicle
    public Train(String name, int capacity, String route) {
        super(name, capacity, route);
    }

    // method untuk menghitung tarif kereta berdasarkan tarif tetap per penumpang
    public int calculateFare() {
        return currentPassengers * 10000; // tarif tetap per penumpang = Rp10000
    }
}
