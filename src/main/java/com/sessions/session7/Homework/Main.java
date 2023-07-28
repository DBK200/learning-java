package com.sessions.session7.Homework;

public class Main {

    public static void main(String[] args){

//--------------------- Shopping List --------------------------

//        ShoppingList list=new ShoppingList();
//        list.addItemToShoppingList("Mere");
//        list.addItemToShoppingList("Pere");
//        list.addItemToShoppingList("Mere");
//
//        System.out.println("Display list");
//        list.displayList();
//        System.out.println();
//
//        System.out.println("Find item by name");
//        list.findItemInShoppingListByName("Mere");
//        System.out.println();
//
//        System.out.println("Remove item by name");
//        list.removeItemFromShoppingListByName("Mere");
//        System.out.println();
//
//        System.out.println("Display list");
//        list.displayList();
//        System.out.println();
//
//
//        System.out.println("Find item by name  " );
//        list.findItemInShoppingListByName("Pere");
//
//
//        list.addItemToShoppingList("Carrots");
//        list.addItemToShoppingList("Apples");
//        list.addItemToShoppingList("Milk");
//        list.addItemToShoppingList("Bread");
//
//        System.out.println("Display list");
//        list.displayList();
//        System.out.println();
//
//        list.markItemsAsBought("Carrots");
//        list.markItemsAsBought("Pere");
//
//
//        System.out.println("Display list");
//        list.displayList();
//        System.out.println();

//------------------------------------------------------------

//------------------- Christmas Wish List -----------------------------
        WishList wishList=new WishList("Christmas Wish List");
        wishList.addWish("Bike");
        wishList.addWish("Toy");
        wishList.addWish("Flower");
        wishList.addWish("PC");
        wishList.addWish("Guitar");
        wishList.addWish("Candy");
        System.out.println();
        wishList.displayList();
        System.out.println();

        System.out.println("Attempting to add an already added item - \'Toy\' ");
        System.out.println();
        wishList.addWish("Toy");
        System.out.println("-------------------------------------------------");
        System.out.println();


//removeWish method  - Remove an item that exists in array
        System.out.println("Remove an item that exists in array");
        System.out.println();
        wishList.removeWish("Toy");
        System.out.println("-------------------------------------------------");
        System.out.println();

//removeWish method  - Remove an item that does not exists in array
        System.out.println("Remove an item that does not exists in array");
        System.out.println();
        wishList.removeWish("Toy");
        System.out.println("-------------------------------------------------");
        System.out.println();

        System.out.println("Current status of the list");
        System.out.println();
       wishList.displayList();
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();
//----------------------------

//markWishAsImportant method  - marking an existing item as important
        System.out.println("Mark an item as important/favorite");
        System.out.println();
        wishList.markWishAsImportant("Bike");
        System.out.println("-------------------------------------------------");
        System.out.println();

        System.out.println("Current status of the list");
        System.out.println();
        wishList.displayList();
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();
//-------------

//markWishAsImportant method  - marking an item that does not exist as important
        System.out.println("Mark an item that does not exist as important/favorite");
        System.out.println();
        wishList.markWishAsImportant("Milk");
        System.out.println("-------------------------------------------------");
        System.out.println();

        System.out.println("Current status of the list");
        System.out.println();
        wishList.displayList();
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();
//-------------

 //markWishAsImportant method  - marking more items as important
        System.out.println("Mark 2 more items as important/favorite");
        System.out.println();
        wishList.markWishAsImportant("PC");
        wishList.markWishAsImportant("Candy");
        System.out.println("-------------------------------------------------");
        System.out.println();

        System.out.println("Current status of the list");
        System.out.println();
        wishList.displayList();
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();
 //--------

//markWishAsImportant method - trying to mark more than 3 items as important
        System.out.println("Try to add a 4th wish as important");
        System.out.println();
        wishList.markWishAsImportant("Flower");

        System.out.println("-------------------------------------------------");
        System.out.println();

        System.out.println("Current status of the list");
        System.out.println();
        wishList.displayList();
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();
 //--------

//remoteWish method - Remove an item that is marked as important
        System.out.println("Remove an item that is marked as important");
        System.out.println();
        wishList.removeWish("PC");
        System.out.println("-------------------------------------------------");
        System.out.println();

        System.out.println("Current status of the list");
        System.out.println();
        wishList.displayList();
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();


//markWishAsImportant method  - Attempting to add another important item after removing one
        System.out.println("Attempting to add another important item after removing one");
        System.out.println();
        wishList.markWishAsImportant("Flower");

        System.out.println("-------------------------------------------------");
        System.out.println();

        System.out.println("Current status of the list");
        System.out.println();
        wishList.displayList();
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();
//--------

    }
}
