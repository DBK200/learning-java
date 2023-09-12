package com.sessions.session17;

import javax.swing.plaf.PanelUI;

public interface Interface{
    boolean comparison(String a1, String a2);

}
 class Exercising2 {
    public static void main(String[] args) {

        String apple1 = "red";
        String apple2 = "green";

        Interface comparison = (a1, a2) -> {
            boolean result= a1.equals(a2);
            return result;
        };
        boolean areEqual = comparison.comparison(apple1, apple2);
        System.out.println(areEqual);
    }

    public boolean equals(String a){
        if(a.equals(this)){
            return true;
        }
        return false;


    }
}
