package com.sessions.session16.practice;

public class ToString {
    private int id;
    private String name;
    private String description;

    public ToString(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("[id: %d, name: %s, description: %s]",
                id, name, description);
    }
}

class TestToString {
    public static void main(String[] args) {
        ToString toString = new ToString(23, "laptop", "this is a good laptop");
        String sResult = toString.toString();
        // W/o toString() overridden:
        // com.sessions.session16.practice.ToString@7229724f
        System.out.println(sResult);
    }
}
