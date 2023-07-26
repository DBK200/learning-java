/**********************
 *                    *
 *  Date: 20.07.2023  *
 *                    *
 **********************/

/*

   == Challenge ==
   Use LinkedList functionality, to create a list of places, ordered by distance from the starting point.
   Use a ListIterator, to move, both backwards and forwards, through this ordered itinerary of places.
   First, create a type that has a town or place name, and a field for storing the distance from the start.
   Sydney should be the first element in your list.
   In addition, you'll create an interactive program with the following menu item options:

   Available actions (select word or letter):
   (F)orward
   (B)ackwards
   (L)ist Places
   (M)enu
   (Q)uit

*/

package com.sessions.session7;

import java.util.*;

public class LinkedListChallenge {
    public static void main(String[] args) {
        // Different declaration using {var} keyword
        // var townLinkedList = new LinkedList<Town>();
        LinkedList<Town> llTowns = new LinkedList<>();
        llTowns.add(new Town("Sydney", 0));
        llTowns.add(new Town("Adelaide", 1374));
        llTowns.add(new Town("Alice Springs", 2771));
        llTowns.add(new Town("Brisbane", 917));
        llTowns.add(new Town("Darwin", 3972));
        llTowns.add(new Town("Melbourne", 917));
        llTowns.add(new Town("Perth", 3923));

        // Sorts the list, first by distance, then by town name
        llTowns.sort(new Compare());

        ListIterator<Town> iterator = llTowns.listIterator();

        Scanner sc = new Scanner(System.in);
        String sMenu = "\nSelect action:\n(F)orward\n(B)ackward\n(L)ist Places\n(M)enu\n(Q)uit\n";

        int iIndex = 0;

        System.out.println(sMenu);
        while (true) {
            String sInput = sc.nextLine().toUpperCase();

            // Quit
            if (sInput.startsWith("Q")) break;

                // Menu printing
            else if (sInput.startsWith("M"))
                System.out.println(sMenu);

                // List printing
            else if (sInput.startsWith("L"))
                printList(llTowns);

                // Moving forward
            else if (sInput.startsWith("F")) {
                if (iterator.hasNext()) {
                    if (iterator.nextIndex() == iIndex) {
                        iterator.next();
                        iIndex = iterator.nextIndex();
                    }
                    iIndex = iterator.nextIndex();
                    System.out.println("Current item is: [" + iterator.next().toString() + "]"
                            + ((iterator.hasNext()) ? "" : ".\nYou're at the end of the list!"));
                }
                else
                    System.out.println("You're at the end of the list!");
            }

            // Moving backward
            else if (sInput.startsWith("B")) {
                if (iterator.hasPrevious()){
                    if (iterator.previousIndex() == iIndex) {
                        iterator.previous();
                        iIndex = iterator.previousIndex();
                    }
                    iIndex = iterator.previousIndex();
                    System.out.println("Current item is: [" + iterator.previous().toString() + "]"
                            + ((iterator.hasPrevious()) ? "" : ".\nYou're at the beginning of the list!"));
                }
                else
                    System.out.println("You're at the beginning of the list!");
            }
        }

    }

    private static void printList(LinkedList<Town> llTowns) {

        System.out.println("List content is: ");

        StringBuilder sbPrintOut = new StringBuilder("[");

        for(Town element: llTowns){
            sbPrintOut.append(element.toString()).append(", ");
        }
        sbPrintOut.delete(sbPrintOut.length()-2, sbPrintOut.length()).append("]");
        System.out.println(sbPrintOut);
    }

}

class Town {
    private String name;
    private int distance;

    public Town(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return name + " (" + distance + ")";
    }
}

class Compare implements Comparator<Town> {
    @Override
    public int compare(Town tFirst, Town tSecond) {

        // 1st level comparison by [distance] in ascending order
        int iDistanceCompare;
        if ( tSecond.getDistance() - tFirst.getDistance() == 0 ) iDistanceCompare = 0;
        else if ( tSecond.getDistance() - tFirst.getDistance() < 0 ) iDistanceCompare = 1;
        else iDistanceCompare = -1;

        // [name] comparison in ascending order
        int iNameCompare = tFirst.getName().compareTo(tSecond.getName());

        // 2nd level comparison
        return (iDistanceCompare == 0) ? iNameCompare : iDistanceCompare;
    }
}