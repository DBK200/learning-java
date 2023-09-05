package com.sessions.session16.practice;

public class Generics {
    public static void main(String[] args) {
        Order<String> order = new Order<>(2,"name","aaa");
        System.out.println(order.getItem());
        //String[] arArray = new String[]{"1","2","3"};
        Order<String> arArray[] = new Order[2];
        arArray[0] = order;
        arArray[1] = new Order<>(3,"name1", "bbb");
        printArray(arArray);
    }

    private static <E> void printArray(E[] array) {
        StringBuilder sbResult = new StringBuilder("[");
        int i = 0;
        for (E element: array) {
            sbResult.append(i==0?"":", ").append(element.toString());
            ++i;
        }
        sbResult.append("]");
        System.out.println(sbResult);
    }

}

class Order<T> {
    private int id;
    private String name;
    private T item;

    public Order(int id, String name, T item) {
        this.id = id;
        this.name = name;
        this.item = item;
    }

    public T getItem() {
        return item;
    }
    @Override
    public String toString() {
        return String.format("{ id: %d, name: %s, item: %s}",
                id, name, item);
    }
}
