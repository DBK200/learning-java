package com.sessions.session20;

public class Challenge3 {
    public static void main(String[] args) {

        try{
            String invalidInt = "adb";
            int parsedInt = Integer.parseInt(invalidInt);

            int result = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println("division by 0 error " + e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("mismatch error " + e.getMessage());
        }catch (Exception e){
            System.out.println("an exception");
        }
    }
}
