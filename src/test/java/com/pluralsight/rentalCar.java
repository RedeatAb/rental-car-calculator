package com.pluralsight;



import java.util.Scanner;

public class rentalCar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("--Welcome to Redeat's Rental ---");

        String date = askPickUpDate(input);
        int days =daysOfRental(input);
        String toll = tollTag(input);
        String gps = wantGPS(input);
        String roadAssistance =wantRoadAssistance(input);
        int personAge = age(input);

        // basic Car rental

        double costPerDay = 29.99 * days;

        double tollTagCost = 0;
        double gpsCost= 0;
        double roadAssitCost= 0;
        double ageCost = 0;


        if(toll.equals("yes")){
            tollTagCost = 3.95 * days;

        }
        if(gps.equals("yes")){
            gpsCost = 2.95 * days;
        }
        if(roadAssistance.equals("yes")){
            roadAssitCost = 3.95 * days;
        }

        if(personAge < 25){
           ageCost = 0.3 * costPerDay;
        }

        double totalCost= costPerDay + tollTagCost + gpsCost + roadAssitCost + ageCost;





        //display results

        System.out.println("Your Pick up date is " + date);
        System.out.println("The amount of rental days is  " + days);
        System.out.println("Do you want Toll Tag?  " + toll);
        System.out.println("Do you want GPS " + gps);
        System.out.println("Do you want Roadside Assitance ? " + roadAssistance);
        System.out.println("Your age is " + personAge);


        // display Cost Amount

        System.out.println("The Cost perday is: " + costPerDay);
        System.out.println("The  cost with road assitance is " + roadAssitCost);
        System.out.println("The cost with GPS is " + gpsCost);
        System.out.println("The cost with Toll Tag is " + tollTagCost);
        System.out.println("The cost of Rental car under 25 is " + ageCost);
        System.out.printf("The total amount is  $%.2f%n" , totalCost);



    }


    // creating the methods

    public static String askPickUpDate(Scanner input){

        System.out.print("When are you picking up rental?");

        return input.nextLine();
    }
    public static int daysOfRental(Scanner input){

        System.out.print("how many days are you renting? ");

        return input.nextInt();
    }

    // changed to string instead of boolean

    // added toLowercase to handle case senstivity

    public static String tollTag(Scanner input){
        System.out.print("Do you want a toll tag ? (Yes/No) ");

        return input.next().toLowerCase();

    }

    //
    public static String wantGPS (Scanner input) {
        System.out.print("Do you want GPS? (Yes/No) ");
        return input.next().toLowerCase();

    }



    public static String wantRoadAssistance(Scanner input){
        System.out.print("Do you want Roadside assistance? (Yes/No) ");
        return input.next().toLowerCase();

    }

    public  static int age(Scanner input){
        System.out.print("How old are you?" );
        return input.nextInt();
    }
}
