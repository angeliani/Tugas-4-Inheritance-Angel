package praktic.inheritance.transportation;

public class Bus extends Vehicle {
    // atribut spesifik untuk bus
    public final int stops; // jumlah pemberhentian bus

    // konstruktor bus yang memanggil konstruktor superclass Vehicle
    public Bus(String name, int capacity, String route, int stops) {
        super(name, capacity, route); // memanggil konstruktor Vehicle
        this.stops = stops;
    }

    // method untuk menghitung tarif bus berdasarkan jumlah pemberhentian dan jumlah penumpang
    public int calculateFare() {
        return currentPassengers * stops * 2000; // tarif per halte = Rp2000
    }
}