package com.sessions.session2;

public class Myclass {
    public static void main(String[] args) {
        // Java treats a literal integer value as an INTEGER.
        // Every literal value that exceeds [Integer.MAX_VALUE]
        // has to have an L suffix, otherwise an error
        // will be raised. (see below)

//        long lVar = 2_147_483_647_234;
        long lVar = 2_147_483_647_234L;
    }
}
