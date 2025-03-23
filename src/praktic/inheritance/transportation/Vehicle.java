package praktic.inheritance.transportation;

public class Vehicle {
    // atribut-atribut yang dimiliki setiap kendaraan
    public final String name; // nama kendaraan
    public final int capacity; // kapasitas maksimum kendaraan
    public final String route; // rute perjalanan kendaraan
    public int currentPassengers; // jumlah penumpang saat ini

    // konstruktor untuk menginisialisasi atribut kendaraan
    public Vehicle(String name, int capacity, String route) {
        this.name = name;
        this.capacity = capacity;
        this.route = route;
        this.currentPassengers = 0; // set jumlah penumpang awal = 0
    }

    // method untuk memulai perjalanan kendaraan
    public void startJourney() {
        System.out.println(name + " memulai perjalanan di " + route);
    }

    // method untuk menghentikan perjalanan kendaraan
    public void endJourney() {
        System.out.println(name + " mencapai tujuan akhir dan berhenti");
    }

    // method untuk menaikkan penumpang
    public void boardPassengers(int passengers) {
        if (currentPassengers + passengers <= capacity) { // ngecek apakah kapasitas masih cukup
            currentPassengers += passengers;
            System.out.println(passengers + " penumpang naik ke dalam " + name);
        } else {
            int exceedingPassengers = (currentPassengers + passengers) - capacity; 
            currentPassengers = capacity;
            System.out.println("Kapasitas penuh! Tidak dapat menaikkan " + exceedingPassengers + " penumpang yang melebihi kapasitas");
        }
    }

    // method untuk menurunkan penumpang
    public void dropPassengers(int passengers) {
        if (currentPassengers >= passengers) { // ngecek apakah ada cukup penumpang untuk turun
            currentPassengers -= passengers;
            System.out.println(passengers + " penumpang turun dari " + name);
        } else {
            System.out.println("Tidak ada cukup penumpang untuk turun");
        }
    }
}