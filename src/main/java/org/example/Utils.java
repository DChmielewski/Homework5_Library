package org.example;

import java.util.Scanner;

public class Utils {

    public static void menu() {
        System.out.println(("1 - Enter 2 dates to display the of movies recorded between those dates"));
        System.out.println(("2 - Display all details about random movie"));
        System.out.println(("3 - Enter actors name and surname to display movies he/she/it played in"));
        System.out.println("4 - End program ");
    }

    public static int getNumber() {

        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("This is not a number! Please try again:");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }


}
