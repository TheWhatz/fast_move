package data;

import base.Bike;
import base.Parcel;
import base.Person;
import base.ParcelStatus;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        // your code

        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        
        person[0] = new Person("Chinnawat", "Kaewnongsang");
        person[1] = new Person("Tawan", "Muadmuenwai");
        person[2] = new Person("Tharadon", "Saenmart");
        
        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        
        parcels[0] = new Parcel(10, ParcelStatus.SHIPPING);
        parcels[1] = new Parcel(20, ParcelStatus.READY_TO_SHIP);
        parcels[2] = new Parcel(30, ParcelStatus.DELIVERED);
        parcels[3] = new Parcel(40, ParcelStatus.SHIPPING);
        parcels[4] = new Parcel(10, ParcelStatus.READY_TO_SHIP);
        parcels[5] = new Parcel(20, ParcelStatus.DELIVERED);
        parcels[6] = new Parcel(30, ParcelStatus.SHIPPING);
        parcels[7] = new Parcel(40, ParcelStatus.READY_TO_SHIP);
        parcels[8] = new Parcel(10, ParcelStatus.DELIVERED);
        parcels[9] = new Parcel(20, ParcelStatus.SHIPPING);
        
        return parcels;
    }

    //testing
    public static void main(String[] args) {
        // printBike();
        // printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
