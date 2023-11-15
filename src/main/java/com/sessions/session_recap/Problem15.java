package com.sessions.session_recap;

public class Problem15 {

    //Examine the code below:
    public static void main(String[] args) {
        String path = "C:\\Users\\Admin\\Documents";
        System.out.println(path);
        String folder = path.substring(9, 14);
        System.out.println(path.charAt(2));
        System.out.println(path.charAt(3));
        System.out.println(path.charAt(4));
        System.out.println(folder);
    }
}
/*
What will folder contain?
a) Users
b) Users\
c) \Admin
d) Admin
 */