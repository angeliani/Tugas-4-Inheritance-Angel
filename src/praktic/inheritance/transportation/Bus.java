package praktic.inheritance.transportation;

public class Bus extends Vehicle {
    // konstanta statis untuk tarif per halte
    public static final int FARE_PER_STOP = 2000; // tarif per halte adalah Rp2000
    public final int stops; // jumlah pemberhentian bus

    // konstruktor bus yang memanggil konstruktor superclass Vehicle
    public Bus(String name, int capacity, String route, int stops) {
        super(name, capacity, route); // memanggil konstruktor Vehicle
        this.stops = stops;
    }

    // method untuk menghitung tarif bus berdasarkan jumlah pemberhentian
    public void calculateFare(int stops) {
        int fare = currentPassengers * stops * FARE_PER_STOP; // tarif per halte = Rp2000
        System.out.println("Total tarif perjalanan bus: Rp " + fare);
    }
}
