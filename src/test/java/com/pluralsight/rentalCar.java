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









        //display results

        System.out.println("Your Pick up date is " + date);
        System.out.println("The amount of rental days is  " + days);
        System.out.println("Do you want Toll Tag?  " + toll);
        System.out.println("Do you want GPS " + gps);
        System.out.println("Do you want Roadside Assitance ? " + roadAssistance);
        System.out.println("Your age is " + personAge);



    }


    // creating the methods

    public static String askPickUpDate(Scanner input){

        System.out.print("When are you picking up rental?");

        return input.nextLine();
    }
    public static int daysOfRental(Scanner input){

        System.out.print("how many days are you renting? (Yes/No)");

        return input.nextInt();
    }

    public static String tollTag(Scanner input){
        System.out.print("Do you want a toll tag ? ");

        return input.next().toLowerCase();

    }
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
