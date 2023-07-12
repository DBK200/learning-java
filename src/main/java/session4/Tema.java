package session4;

public class Tema
{
    public static void main(String[] args) {

        //conditional statements
        //if-then

        int x = 3;
        if (x > 1) {
            System.out.println("X este mai mare ca 1");
        }


        //ternary operator - condensed form of an if else that returns a value
        String y = 4 > 1 ? "da" : "nu";


        //if else
//
        int d = 3;
        if (d % 2 == 0) {
            System.out.println("d este par");
        } else {
            System.out.println("d este impar");
        }


        //if else if

        int e = -2;
        if (e > 0) {
            System.out.println("Numarul este pozitiv");
        } else if (e < 0) {
            System.out.println("Numarul este negativ");
        } else {
            System.out.println("Numarul este neutru");
        }


        //switch

        String LunileAnului = "MartieAprilieMai";
        switch (LunileAnului) {
            case "IunieIulieAugust":
                System.out.println("Este anotimpul vara");
                break;
            case "MartieAprilieMai":
                System.out.println("Este anotimpul primavara");
                break;
            case "SeptembrieOctombrieNoiembrie":
                System.out.println("Este anotimpul toamna");
                break;
            case "DecembrieIanuarieFebruarie":
                System.out.println("Este anotimpul iarna");
                break;
            default:
                System.out.println("Ati introdus gresit!");
        }


        //Loop statements

        //arrays

        String[] luna = {"F", "E", "B", "R", "U", "A", "R", "I", "E"};
        System.out.println(luna[3]);

        int[] X = {2, 4, 4, 1, 6};
        System.out.println(X[0]);


//        int[] noNumber={};
//        noNumber[0]=1; < index out of bounds exception

        //for loop

        String[][] Luna = {{"A", "U", "G"},
                {"U", "S", "T"}};
        for (int i = 0; i < Luna.length; i++) {
            for (int j = 0; j < Luna[i].length; j++) {
                System.out.println(Luna[i][j]);
            }
        }

        //for each

        int[] numere = {2, 5, 3, 4, 7, 8, 5, 2};
        for (int numar : numere) {
            System.out.print(numar);
        }
//

        //while

        int c = 2;
        while (c < 10) {
            System.out.println(c);
            c = c + 1;
        }
        System.out.println(" ");
        System.out.println(" ");


        //do-while
        int p = 3;
        do {
            System.out.println(d);
            d++;
        } while (d < 9);


        //flow control

        //return-exits the execution of this method

       /*
       `int b=1;
        if(b<4)
        {
            return;
        }
        System.out.println("salut");
        */


        //break - used to exit a loop or a switch statement

        String[][] Lunaa = {{"A", "U", "G"}, {"U", "S", "T"}};

        for (int i = 0; i < Lunaa.length; i++) {
            for (int j = 0; j < Lunaa[i].length; j++) {
                if (Lunaa[i][j].equals("S")) {
                    System.out.println("Am gasit litera");
                    break;
                }
            }
        }
        System.out.println(" ");


        //continue - breaks an iteration of the loop

        int[] numbers = {5, 1, 8, 3, 6};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                continue;
            System.out.println(numbers[i]);

        }
        System.out.println(" ");


        //labels
        int[][] numeree = {{2, 8, 5, 6}, {2, 7, 5, 4}, {4, 7, 5, 8}};
        System.out.println(numeree.length);
        System.out.println(numeree[0].length);
        System.out.println(numeree[1].length);
        System.out.println(numeree[2].length);
        System.out.println(" ");


        //break with label
        for (int i = 0; i < numeree.length; i++) {
            for (int j = 0; j < numeree[i].length; j++) {
                System.out.println(numeree[i][j]);
                break;
            }
        }
        System.out.println(" ");


        OUTER_LOOP:
        for (int i = 0; i < numeree.length; i++) {
            for (int j = 0; j < numeree[i].length; j++) {
                System.out.println(numeree[i][j]);
                break OUTER_LOOP;
            }
        }
        System.out.println(" ");


        //continue with label

        for (int i = 0; i < numeree.length; i++) {
            for (int j = 0; j < numeree[i].length; j++) {
                if (numeree[i][j] % 3 == 0) {
                    continue;
                }
                System.out.println(numeree[i][j]);
            }
            System.out.println("iteration completed");
        }
    }


    }
