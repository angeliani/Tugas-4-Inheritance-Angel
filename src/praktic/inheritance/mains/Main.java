package praktic.inheritance.mains;

import praktic.inheritance.transportation.Bus;
import praktic.inheritance.transportation.Taxi;
import praktic.inheritance.transportation.Train;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------------------------------");
        System.out.println("Nama    : Angeliani Junitaviana Herman");
        System.out.println("NIM     : 245150700111021");
        System.out.println("Kelas   : Teknologi Informasi - C");
        System.out.println("------------------------------------------------------");
        System.out.println();

        // membuat objek kendaraan
        Bus bus = new Bus("Bus TransJakarta", 50, "Terminal A - Terminal B", 5);
        Train train = new Train("Kereta Commuter Line", 200, "Stasiun Kota - Stasiun Pusat");
        Taxi taxi = new Taxi("Taksi BlueBird", 4, "Bandara - Hotel", 10);

        // simulasi perjalanan Bus
        bus.startJourney();
        bus.boardPassengers(100); 
        System.out.println("Total penumpang: " + bus.currentPassengers);
        System.out.println("Total pemberhentian: " + bus.stops);
        System.out.println("Tarif per halte: Rp " + 2000);
        System.out.println("Total tarif perjalanan bus: Rp " + bus.calculateFare());
        bus.endJourney();
        bus.dropPassengers(50);

        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println();

        // simulasi perjalanan Kereta
        train.startJourney();
        train.boardPassengers(1500);
        System.out.println("Total penumpang: " + train.currentPassengers);
        System.out.println("Tarif tetap per penumpang: Rp " + 10000);
        System.out.println("Total tarif perjalanan kereta: Rp " + train.calculateFare());
        train.endJourney();
        train.dropPassengers(200);

        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println(); 

        // simulasi perjalanan Taksi
        taxi.startJourney();
        taxi.boardPassengers(30);
        System.out.println("Total penumpang: " + taxi.currentPassengers);
        System.out.println("Total jarak rute: " + taxi.routeDistance + " km");
        System.out.println("Tarif per km: Rp " + 5000);
        System.out.println("Total tarif perjalanan taksi: Rp " + taxi.calculateFare());
        taxi.endJourney();
        taxi.dropPassengers(4);
    }
}