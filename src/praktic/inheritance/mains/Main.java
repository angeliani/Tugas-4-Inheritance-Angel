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
        Train train = new Train("Kereta Commuter Line", 200, "Stasiun Kota - Pusat");
        Taxi taxi = new Taxi("Taksi Bluebird", 4, "Bandara - Hotel", 10);

        // simulasi perjalanan Bus
        bus.startJourney();
        bus.boardPassengers(30); 
        bus.boardPassengers(20); 
        System.out.println("Total penumpang: " + bus.currentPassengers);
        System.out.println("Total pemberhentian: " + bus.stops);
        System.out.println("Tarif per halte: Rp " + Bus.FARE_PER_STOP);
        bus.calculateFare(5);
        bus.endJourney();
        bus.dropPassengers(50);

        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println();

        // simulasi perjalanan Kereta
        train.startJourney();
        train.boardPassengers(150);
        System.out.println("Total penumpang: " + train.currentPassengers);
        System.out.println("Tarif tetap per penumpang: Rp " + Train.FIXED_FARE);
        train.calculateFare();
        train.endJourney();
        train.dropPassengers(150);

        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println(); 

        // simulasi perjalanan Taksi
        taxi.startJourney();
        taxi.boardPassengers(3);
        System.out.println("Total penumpang: " + taxi.currentPassengers);
        System.out.println("Total jarak rute: " + taxi.routeDistance + " km");
        System.out.println("Tarif per km: Rp " + Taxi.FARE_PER_KM);
        taxi.calculateFare(10);
        taxi.endJourney();
        taxi.dropPassengers(3);
    }
}
