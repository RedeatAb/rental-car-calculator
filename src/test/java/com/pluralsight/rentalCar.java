package com.pluralsight;



import java.util.Scanner;

public class rentalCar {

    public static void main(String[] args) {

        // Create one Scanner for all questions
        Scanner input = new Scanner(System.in);

        System.out.println("-- Welcome to Car Rental Company --");

        // 1. Ask for pickup date
        String date = askPickupDate(input);

        // 2. Ask for number of rental days
        int days = rentalDays(input);

        // 3. Ask about electronic toll tag
        boolean tollTag = askTollTag(input);

        // 4. Ask about GPS
        boolean gps = askGPS(input);

        // 5. Ask about roadside assistance
        boolean roadside = askRoadside(input);

        // 6. Ask for current age
        int age = askAge(input);


        // A. Calculate basic rental cost
        double basicRental = days * 29.99;


        // B. Calculate options cost
        double optionsCost = 0;

        if (tollTag) {
            optionsCost = optionsCost + (days * 3.95);
        }

        if (gps) {
            optionsCost = optionsCost + (days * 2.95);
        }

        if (roadside) {
            optionsCost = optionsCost + (days * 3.95);
        }


        // C. Calculate underage driver surcharge
        double underageSurcharge = 0;

        if (age < 25) {
            underageSurcharge = basicRental * 0.30;
        }


        // D. Calculate total rental cost
        double totalCost = basicRental + optionsCost + underageSurcharge;


        // Display rental summary
        System.out.println("\n--- Rental Summary ---");

        System.out.println("Pickup Date: " + date);
        System.out.println("Rental Days: " + days);
        System.out.println("Toll Tag: " + tollTag);
        System.out.println("GPS: " + gps);
        System.out.println("Roadside Assistance: " + roadside);
        System.out.println("Age: " + age);


        // Display rental costs
        System.out.println("\n--- Rental Cost Summary ---");

        System.out.printf("Basic Rental: $%.2f%n", basicRental);
        System.out.printf("Options Cost: $%.2f%n", optionsCost);
        System.out.printf("Underage Surcharge: $%.2f%n", underageSurcharge);
        System.out.printf("Total Cost: $%.2f%n", totalCost);

        // Close Scanner
        input.close();
    }


    // Method 1: Ask for pickup date
    public static String askPickupDate(Scanner input) {

        System.out.println("When is your pickup date?");

        return input.nextLine();
    }


    // Method 2: Ask for rental days
    public static int rentalDays(Scanner input) {

        System.out.println("How many days are you renting?");

        return input.nextInt();
    }


    // Method 3: Ask about toll tag
    public static boolean askTollTag(Scanner input) {

        System.out.println("Do you want a toll tag? (yes/no)");

        return input.next().equals("yes");
    }


    /// Method 4: Ask about GPS
    public static boolean askGPS(Scanner input) {

        System.out.println("Do you want GPS? (yes/no)");

        return input.next().equals("yes");
    }


    // Method 5: Ask about roadside assistance
    public static boolean askRoadside(Scanner input) {

        System.out.println("Do you want roadside assistance? (yes/no)");

        return input.next().equals("yes");
    }


    // Method 6: Ask for age
    public static int askAge(Scanner input) {

        System.out.println("What is your current age?");

        return input.nextInt();
    }
}
