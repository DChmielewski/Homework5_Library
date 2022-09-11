package org.example;


import java.util.Arrays;
import java.util.List;

public class Actor {

    private String actorName;
    private String actorSurname;

    public Actor(String actorName, String actorSurname) {
        this.actorName = actorName;
        this.actorSurname = actorSurname;

    }

    public String getActorName() {
        return actorName;
    }

    public String getActorSurname() {
        return actorSurname;
    }


    static Actor actor1 = new Actor("Jason", "Statham");
    static Actor actor2 = new Actor("Vinnie", "Jones");
    static Actor actor3 = new Actor("Stephen", "Graham");
    static Actor actor4 = new Actor("Benicio", "del Toro");
    static Actor actor5 = new Actor("Brad", "Pitt");

    private static List<Actor> actors = List.of(actor1, actor2, actor3, actor4, actor5);

    public static void listOfActors() {

        System.out.println(Arrays.toString(actors.toArray()));
    }

    @Override
    public String toString() {
        return this.actorName + " " + this.actorSurname;
    }
}