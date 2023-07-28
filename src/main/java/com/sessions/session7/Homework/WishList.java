package com.sessions.session7.Homework;

import java.util.ArrayList;
import java.util.List;

public class WishList {
//2. Create a wishlist for christmas with ArrayList and print the values

    /******** Instance variables **********/
    private List<String> wishList;
    private String title;
    private int importantWishesCounter;

    //constructor
    public WishList(String title){
        this.title=title;
        this.wishList=new ArrayList<>();
        this.importantWishesCounter=0;
    }

    public void addWish(String wish){
        if(!wishList.contains(wish)){
            this.wishList.add(wish);
        }else{
            System.out.println("You already added "+ wish+ " to the wish list");
        }



    }
    public void removeWish(String wish){
        boolean isRemoved=false;
        //check is wish is important
        int index=wishList.indexOf(wish);
        for(int i=0;i<this.wishList.size();i++){
            if(wishList.get(i).startsWith(wish)){
                isRemoved=this.wishList.remove(wishList.get(i));
                if(i<this.importantWishesCounter){
                    this.importantWishesCounter--;
                    System.out.println("importantWishes: "+this.importantWishesCounter);
                }
            }

        }
        System.out.println(isRemoved? wish+ " has been removed from the wish list": wish+ " was not found in the list");

    }


    /**
     * Adds " - ⭐" to the item and moves it to the top of the list.
     *
     * The list can contain only 3 wishes marked as important.
     *
     * @param wish The item to be marked as important
     */
    public void markWishAsImportant(String wish){
        int index=this.wishList.indexOf(wish);
        if(index==-1){
            System.out.println("The wish - "+ wish+ " - does not exist");
            return;
        }

        if(this.importantWishesCounter<3){ // the limit of important wishes has not yet been reached.

            if(index==this.importantWishesCounter){  //the wish is already at the correct position.
                wishList.set(this.importantWishesCounter,wish+" - ⭐ ");
            }else{
                //swap the items position
                String tempItem=wishList.get(this.importantWishesCounter);
                wishList.set(this.importantWishesCounter,wish+" - ⭐ ");
                wishList.set(index,tempItem);
            }


            this.importantWishesCounter++;
        }else{
            System.out.println("You can only mark 3 wishes as important!");
        }


    }

    public void displayList(){
        System.out.println("*** " + this.title + " ***");
        System.out.println();
       for(String s:this.wishList){
           System.out.println(s);
       }
        System.out.println();
        System.out.println("****************************");


    }


}
