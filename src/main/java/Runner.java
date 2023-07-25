import java.sql.SQLOutput;
import java.util.Scanner;



public class Runner {
    public static void main(String[] args) {
        Airport airport = new Airport("Gatwick");
        Flight flight1 = new Flight("Bali", "KA29");
        Passenger passenger = new Passenger("Jannah", 0756563421, 123);
        Passenger passenger2 = new Passenger("Rebecca", 5, 456);
        flight1.bookPassengerOntoFlight(passenger);
        flight1.bookPassengerOntoFlight(passenger2);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please add a new flight: Destination");
        String newDestination = scanner.nextLine();
        System.out.println("Please add a new flight: ID");
        String newFlightID = scanner.nextLine();
        Flight flight2 = new Flight(newDestination, newFlightID);
        System.out.println("Added: " + flight2.getDestination() + " " + flight2.getFlightID());

        System.out.println(airport.displayAllFlights());

        System.out.println("Please add a new passenger: Name");
        String newName = scanner.nextLine();
        System.out.println("Please add a new passenger: Phone number");
        String newPhoneNumber = scanner.nextLine();
        int newIntPhoneNumber = Integer.parseInt(newPhoneNumber);
        System.out.println("Please add a new passenger: Unique ID");
        String newUniqueID = scanner.nextLine();
        int newIntUniqueID = Integer.parseInt(newUniqueID);
        Passenger passenger3 = new Passenger(newName, newIntPhoneNumber, newIntUniqueID);
        System.out.println("Added: " + passenger3.getName() + " " + passenger3.getPhoneNumber() + " " + passenger3.getUniqueID());

        System.out.println("Would you like to add this passenger onto the flight to " + flight2.getDestination() + ". Yes or No?");
        String questionAddToFlight = scanner.nextLine();
        if (questionAddToFlight.equals("Yes")) {
            System.out.println("This passenger has booked onto the flight to " + flight2.getDestination());
            flight2.bookPassengerOntoFlight(passenger3);
        } else {
            System.out.println("This passenger has not been booked onto the flight");
        }

        System.out.println("Would you like to cancel the flight to Bali?");
        String answer = scanner.nextLine();
        if (answer.equals("Yes")) {
            airport.cancelFlight(flight1);
        } else {
            System.out.println("this flight has not been cancelled");
        }

        System.out.println("please enter the flightID of the flight you would like to cancel");
        String cancelFlightID = scanner.nextLine();
            for (Flight f : airport.getFlights()) {
                if (cancelFlightID.equals(f.getFlightID())) {
                    airport.cancelFlight(f);
                    System.out.println("flight cancelled");
                } else {
                    System.out.println("Flight not cancelled");

                }

//                   look through the flights in the airport
//            for a flightID in flights
//                    check flight ID matches request to cancel ID
//                    if does = cancel, otherwise = don't cancel
//
            }

            //    change to long


        }
    }

