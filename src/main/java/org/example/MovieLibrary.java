package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class MovieLibrary {

    static Movie movie1 = new Movie("Snatch", "Comedy", Director.director1, 2002, new ArrayList<>(asList(Actor.actor1, Actor.actor2, Actor.actor3)));
    static Movie movie2 = new Movie("Lock, Stock and Two Smoking Barrels", "Crime", Director.director2, 2005, new ArrayList<>(asList(Actor.actor3, Actor.actor4, Actor.actor5)));
    static Movie movie3 = new Movie("RocknRolla", "Drama", Director.director3, 1992, new ArrayList<>(asList(Actor.actor4, Actor.actor1, Actor.actor2)));
    static Movie movie4 = new Movie("The Gentlemen", "Comedy", Director.director4, 2020, new ArrayList<>(asList(Actor.actor1, Actor.actor5, Actor.actor2)));
    private static List<Movie> movies = List.of(movie1, movie2, movie3, movie4);


    public static void getRandomMovie() {
        System.out.println("Random movie picked for you is: ");
        int randomMovie = new Random().nextInt(movies.size());
        System.out.println(movies.get(randomMovie).toString());
    }

    public static void getMovieByDateRange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Date from: ");
        int dateFrom = scanner.nextInt();
        System.out.println("Date to: ");
        int dateTo = scanner.nextInt();

        for (Movie m : movies) {
            if (dateFrom <= m.getPublishingDate() && dateTo >= m.getPublishingDate()) {
                System.out.println(m.getTitle());

            }

        }


    }

    public static void getMovieByActorNameAndSurname() {
        System.out.println("Please enter the actor's name (list of available actors above) to view their filmography: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Actor name: ");
        String actorName = scanner.nextLine();
        System.out.println("Enter Actor surname: ");
        String actorSurname = scanner.nextLine();
        System.out.println("List of movies: ");
        for (Movie m : movies) {
            for (int i = 0; i < movies.get(i).getActors().size(); i++) {
                if (m.getActors().get(i).getActorName().equals(actorName) && m.getActors().get(i).getActorSurname().equals(actorSurname)) {
                    System.out.println(m.getTitle());
                }

            }

        }
    }

}




