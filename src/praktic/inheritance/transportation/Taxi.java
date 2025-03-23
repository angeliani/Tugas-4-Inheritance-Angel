package praktic.inheritance.transportation;

// kelas Taksi yang merupakan subclass dari Vehicle
public class Taxi extends Vehicle {
    // atribut spesifik untuk taksi
    public final int routeDistance; // jarak tempuh taksi dalam kilometer

    // konstruktor taksi yang memanggil konstruktor superclass Vehicle
    public Taxi(String name, int capacity, String route, int routeDistance) {
        super(name, capacity, route); // memanggil konstruktor Vehicle
        this.routeDistance = routeDistance;
    }

    // method untuk menghitung tarif taksi berdasarkan jarak tempuh
    public int calculateFare() {
        return routeDistance * 5000; // tarif per km = Rp5000
    }
}
