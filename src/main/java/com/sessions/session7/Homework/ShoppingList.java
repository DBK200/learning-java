package com.sessions.session7.Homework;

//1. Create a shopping list with Array and print the values
public class ShoppingList {

    private int lengthOfList;
    private String[] list;



    public ShoppingList(){
        this.lengthOfList=0;
        this.list=new String[0];

    }

    /**
     * It adds an item (String) to the shoppingList array.
     * @param itemName The item to be added.
     */
    public void addItemToShoppingList(String itemName){
        this.lengthOfList++;
        String[] tempList=new String[lengthOfList]; //create a new array with updated length
        if(this.list!=null && this.list.length>0){   //copy items only if list exists and it contains items
            System.arraycopy(list, 0, tempList, 0, list.length);

        }
        tempList[lengthOfList-1]=itemName; // add the new item in the temp list
        list=tempList;             //change reference of list to tempList


    }

    /**
     * Removes and item by its name.If no item is found, it prints a message to the console.
     *
     * It finds the index in the array associated with the itemName.
     * Removes the item by calling removeItemByPosition method if the index/position is found.
     *
     *
     * @param itemName The name of the item to be removed from the list
     */
    public void removeItemFromShoppingListByName(String itemName){
        int itemPosition=findItem(itemName);
        if(itemPosition!=-1){
            removeItemByPosition(itemPosition);
        }else{
            System.out.println("There is no item named " + itemName);
        }

    }

    /**
     * Finds an item in the shoppingList array.
     *
     * If the item is found it is printed to the console.
     * If the item is not found it prints a "No item found" message to the console.
     * @param itemName
     */
    public void findItemInShoppingListByName(String itemName){
        int position=findItem(itemName);
        if(position==-1){
            System.out.println("No item found");
        }else{
            System.out.println((position+1)+". "+ list[position]);
        }




    }

    /**
     * It moves the item already bought to the bottom of the list and marks them with "- already bought"
     * @param itemName String Item bought.
     */

    public void markItemsAsBought(String itemName){
        int position=findItem(itemName);
        String itemBought=list[position];
        for(int i=position;i<list.length-1;i++){
            list[i]=list[i+1];

        }
        list[list.length-1]=itemBought+ " - already bought";

    }

    /**
     * Prints the list to the console
     */
    public void displayList(){
        for(int i=0;i<list.length;i++){
            System.out.println((i+1)+". "+ list[i]);
        }
        System.out.println();
    }

    /**
     * Finds the position(index) of an item in the array.
     * @param itemName  The name of the item to be found
     * @return int  The position in the array of given itemName, or -1 if the item is not found.
     */
    private int findItem(String itemName){
        int itemPosition=-1;
        for(int i=0;i<list.length;i++){
            if(list[i].equals(itemName)){
                itemPosition=i;
                break;
            }
        }
       return itemPosition;
    }


    /**
     * Removes an item at given position from the shopping list (list) and returns the removed item.
     * If position does not exist in the current array,
     * it prints a message to the console and exists the method.
     * @param position The array index of the item(String) to be removed
     * @return String The removed item
     */
    private String removeItemByPosition(int position){
        if(position<0 || position>=this.lengthOfList){
            System.out.println("Position does not exist");
            return null;
        }

            this.lengthOfList--;
            String removedItem=list[position];
            String[] tempArray=new String[this.lengthOfList];
            for(int i=0;i<list.length;i++){

                if(i<position){
                    tempArray[i]=list[i];
                }else if(i>position){
                    tempArray[i-1]=list[i];
                }
            }
            list=tempArray;
           return removedItem;


    }





}


