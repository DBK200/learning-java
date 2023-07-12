package com.sessions.session4;

public class MyApp {

    public static void main(String[] args) {

        int x = 0;
        if (x == 0) {
            System.out.println("x are valoarea 0");
        }
        int y = x + 3;
        if (y == 0) {
            System.out.println("y are valoarea 0");
        } else {
            System.out.println("y nu are valoarea 0");
        }

        char letter = 'a';
        switch (letter) {
            case 'a':
                System.out.println("1");
                break;
            case 'b':
                System.out.println("2");
                break;
            default:
                System.out.println("altceva");
        }

        letter = 'b';
        switch (letter) {
            case 'a' -> System.out.println("1");
            case 'b' -> System.out.println("2");
            default -> System.out.println("altceva");
        }

        int z = 567;
        System.out.println("Cifrele lui z sunt:");
        while (z != 0) {
            System.out.println(z%10);
            z = z/10;
        }

        int i = 0;
        do {
            System.out.println("i = " + i++);
        } while (i < 4);

        for(int j = 1; j <= "litere".length(); j++) {
            System.out.println(j + " litere");
        }

        String[] foods = {"ardei", "rosii", "ceapa", "cartofi"};
        for(String food : foods) {
            System.out.println(food);
        }

        int[] listOfNumbers = {3, 6, 5, 24, 65, 56, 89, -1, 1, 4};
        for(int number : listOfNumbers) {
            if (number % 2 == 0) continue;
            if (number == -1) break;
            System.out.println(number);
        }
    }
}
