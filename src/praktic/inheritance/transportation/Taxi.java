package praktic.inheritance.transportation;

public class Taxi extends Vehicle {
    // konstanta statis untuk tarif per kilometer
    public static final int FARE_PER_KM = 5000; // tarif per km adalah Rp5000
    public final int routeDistance; // jarak tempuh taksi dalam kilometer

    // konstruktor taksi yang memanggil konstruktor superclass Vehicle
    public Taxi(String name, int capacity, String route, int routeDistance) {
        super(name, capacity, route); // memanggil konstruktor Vehicle
        this.routeDistance = routeDistance;
    }

    // method untuk menghitung tarif taksi berdasarkan jarak tempuh
    public void calculateFare(int routeDistance) {
        int fare = routeDistance * FARE_PER_KM; // tarif per km = Rp5000
        System.out.println("Total tarif perjalanan taksi: Rp " + fare);
    }
}
