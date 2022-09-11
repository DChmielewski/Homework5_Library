package org.example;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MovieLibary {
    //TUTAJ ĆWOKU MASZ TO CO MUSISZ DOPISAĆ DALEJ DO POPRAWKI SALARY!!!! MYŚL!ale jutro
    private static List<Movie> movies;
    //  private String movies;

    public MovieLibary() {
    }

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

}




