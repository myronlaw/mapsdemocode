package com.mysandbox;

import java.util.Scanner;


public class FlightControllerCLI {


    // TODO: Create flight, status HashMap

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        // TODO: Add flight, status entries


        while (choice != 8) {
            printMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addFlight(scanner);
                    break;
                case 2:
                    getFlight(scanner);
                    break;
                case 3:
                    checkFlightExists(scanner);
                    break;
                case 4:
                    removeFlight(scanner);
                    break;
                case 5:
                    listAllFlightNumbers();
                    break;
                case 6:
                    listAllFlights();
                    break;
                case 7:
                    getFlightStatus(scanner);
                    break;
                case 8:
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private void printMenu() {
        System.out.println("Flight Controller Menu:");
        System.out.println("1. Add Flight");
        System.out.println("2. Get Flight");
        System.out.println("3. Check if Flight Exists");
        System.out.println("4. Remove Flight");
        System.out.println("5. List All Flight Numbers");
        System.out.println("6. List All Flights");
        System.out.println("7. Get Flight Status");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
    }

    private void addFlight(Scanner scanner) {
        System.out.print("Enter flight number: ");
        String flightNumber = scanner.nextLine();
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();
        System.out.print("Enter departure time: ");
        String departureTime = scanner.nextLine();
        //TODO: Capture flight info
        System.out.print("Enter flight status: ");
        String status = scanner.nextLine();
        //TODO: Capture status info
        System.out.println("Flight added successfully.");
    }

    private void getFlight(Scanner scanner) {
        System.out.print("Enter flight number: ");
        String flightNumber = scanner.nextLine();
        //TODO: Check if flightNumber exists, print details if found.

    }

    private void checkFlightExists(Scanner scanner) {
        System.out.print("Enter flight number: ");
        String flightNumber = scanner.nextLine();
        //TODO: Check if flightNumber exists, print 'flight exists' if found.
    }

    private void removeFlight(Scanner scanner) {
        System.out.print("Enter flight number: ");
        String flightNumber = scanner.nextLine();
        //TODO: remove flight.
    }

    private void listAllFlightNumbers() {
        System.out.println("All flight numbers:");
        //TODO: print all keys.

    }

    private void listAllFlights() {
        System.out.println("All flights:");
        //TODO: print all entries.

    }

    private void getFlightStatus(Scanner scanner) {
        System.out.print("Enter flight number: ");
        String flightNumber = scanner.nextLine();
        //TODO: Print flight status info if found.
    }

    public static void main(String[] args) {
        FlightControllerCLI app = new FlightControllerCLI();
        app.run();
    }


}