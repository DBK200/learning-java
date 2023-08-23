package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex17;

public class MovieTest {

    public static void main(String[] args) {

        Movie movie = new Movie("Matrix", "Lana Wachowski", "Keanu Reeves");
        movie.addReview("Give [the Wachowskis] an A for effort and three A's for those effects. The Matrix is a dazzlingly original visual adventure.");
        movie.addReview("Casting the robotic Reeves as the hope of humanity may be this oppressively long, self-satisfied movie's funniest gag, but it doesn't really make the game any fun. It means we get stuck with the least interesting player.");
        movie.addReview("A cyberpunk thriller that's so much fun to watch, it could single-handedly reboot the genre.");

        movie.printReviews();
    }
}
