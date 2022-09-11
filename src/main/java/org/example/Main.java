package org.example;

import static org.example.Actor.listOfActors;
import static org.example.MovieLibrary.*;
import static org.example.Utils.getNumber;
import static org.example.Utils.menu;

public class Main {
    public static void main(String[] args) {

        while (true) {
            menu();
            switch (getNumber()) {
                case 1 -> getMovieByDateRange();
                case 2 -> getRandomMovie();
                case 3 -> {
                    listOfActors();
                    getMovieByActorNameAndSurname();
                }
                case 4 -> System.exit(0);
                default -> System.out.println("Choose number from menu list: ");
            }


        }
    }
}
