package oop;
public class RecordsExample {
  public static void main(String[] args) {

    record Vehicle(String brand, String licensePlate) {}

    Vehicle vehicle = new Vehicle("Mercedes", "UX 1238 A95");

    System.out.println( vehicle.brand() );
    System.out.println( vehicle.licensePlate() );

    System.out.println( vehicle.toString() );
  }
}

// Class names are only accepted if annotation processing is explicitly requested