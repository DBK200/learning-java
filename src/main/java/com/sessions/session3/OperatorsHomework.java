package com.sessions.session3;

import java.util.Random;

public class OperatorsHomework {

//    private int winningNumber;
//
//    static final int pointsPerWin=25;
//
//    int points;
//    private int lastEnteredNumber;
//
//    /************ Setters *******/
//
//
//
//    /********* Getters ***********/
//
//
//
//
//
//    /******** Methods *********/
//
//
//    /**
//     * @param number Should be between 1 and 10, 1<=number<=10.
//     */
//    public void playGuessNumber(int number){
//        System.out.println();
//        System.out.println(" ------- Guess Number  ------");
//        System.out.println();
//        calculateWinningNumber();
//
//        boolean win= (number  == this.winningNumber) ;
//        this.points+=  win ? pointsPerWin :0;  //ternary operators
//        this.lastEnteredNumber=number;
//
//        String stats=win ? "Won" : "Lost";
//        System.out.println("Winning Number: "+ this.winningNumber);
//        System.out.println(stats + " - Points: "+this.points);
//        System.out.println(" ----------------------------------");
//    }
//
//    public void doubleOrLose()
//    {
//
//        System.out.println("Points at entering: "+this.points);
//        int playedPoints= (this.points < 50) ? this.points : 50; // Max bet 50 points
//
//
//        //max random 26;
//        // random number <= 13 - double points
//        //random number >13 - lose points
//        Random rand=new Random();
//        int randomRiskNumber=   rand.nextInt(27);
//
//        System.out.println("Random: "+ randomRiskNumber);
//        byte x= (byte) (playedPoints+randomRiskNumber);
//
//        x*=2;        //might overflow
//
//        this.points+= x>=0? playedPoints : -playedPoints;
//
//
//        System.out.println("Points at the end: "+ this.points);
//        System.out.println();
//    }
//
//    public void shift(int numberToShift, int shiftBy, boolean shiftRight){
//        //number, shift by, shift direction
//        //e.g. 50, 2 , right
//        //e.g. 50,2,left
//
//        int result= shiftRight ? numberToShift >> shiftBy : numberToShift <<shiftBy;
//
//        String initialNumberInBinary=Integer.toBinaryString(numberToShift);
//        String resultString= Integer.toBinaryString(result);
//        int binaryLength= shiftRight ? initialNumberInBinary.length() : resultString.length();
//        String shiftDirection=shiftRight? ">>" : "<<";
//        String formattedInputBinary=String.format("%"+binaryLength+"s",initialNumberInBinary).replace(' ','0');
//        String formattedOutputBinary=String.format("%"+binaryLength+"s",resultString).replace(' ','0');
//
//        System.out.println("Input:  "+ formattedInputBinary + " "+ shiftDirection+ " "+ shiftBy);
//        System.out.println("Output: " + formattedOutputBinary);
//
//
//        System.out.println();
//
//
//    }
//
//    public void printBitwiseOperationsResult(int a, int b){
//
//        String aBinary=Integer.toBinaryString(a);
//        String bBinary=Integer.toBinaryString(b);
//        System.out.println(aBinary+ " & " +bBinary + " = " + Integer.toBinaryString(a&b));
//        System.out.println(aBinary+ " | " +bBinary + " = " + Integer.toBinaryString(a|b));
//        System.out.println(aBinary+ " ^ " +bBinary + " = " + Integer.toBinaryString(a^b));
//
//    }
//
//
//    /******** Helper Methods *********/
//
//    private void calculateWinningNumber(){
//        /*
//         ((lastEnteredNumber + 100)/ randomNumber - 10) * 2 << randomNumber;
//        */
//
//        Random rand=new Random();
//        int randomNumber = rand.nextInt(6); //  Condition: 0<randomNumber<7;
//        int shiftNumber= 2 << ++randomNumber;    //shift operators
//
//        int result=((this.lastEnteredNumber +72)/randomNumber-8) * (shiftNumber) ;
//
//        this.winningNumber=result%10;
//
//    }
//
//    public static void main(String[] args) {
//
//        OperatorsHomework operators=new OperatorsHomework();
//
//        operators.playGuessNumber(4);
//        operators.playGuessNumber(2);
//        operators.playGuessNumber(6);
//
//        operators.doubleOrLose();
//
////
//        operators.shift(50,2,false);
//        operators.shift(50,2,true);
////
//
//        operators.printBitwiseOperationsResult(15,27);
//
//
//    }
}
