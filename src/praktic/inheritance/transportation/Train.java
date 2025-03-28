package praktic.inheritance.transportation;

public class Train extends Vehicle {
    // konstanta statis untuk tarif tetap per penumpang
    public static final int FIXED_FARE = 10000; // tarif tetap per penumpang adalah Rp10000

    // konstruktor kereta yang memanggil konstruktor superclass Vehicle
    public Train(String name, int capacity, String route) {
        super(name, capacity, route);
    }

    // method untuk menghitung tarif kereta berdasarkan tarif tetap per penumpang
    public void calculateFare() {
        int fare = currentPassengers * FIXED_FARE; // tarif tetap per penumpang = Rp10000
        System.out.println("Total tarif perjalanan kereta: Rp " + fare);
    }
}
