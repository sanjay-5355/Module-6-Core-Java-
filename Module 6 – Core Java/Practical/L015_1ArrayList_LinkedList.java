package java_lab;


import java.util.ArrayList;
import java.util.LinkedList;

public class L015_1ArrayList_LinkedList {
    public static void main(String[] args) {
        //  ArrayList Example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Mango");

        System.out.println("ArrayList elements:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        //  LinkedList Example
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Car");
        linkedList.add("Bike");
        linkedList.add("Bus");

        System.out.println("\nLinkedList elements:");
        for (String vehicle : linkedList) {
            System.out.println(vehicle);
        }

        //  Some differences
        arrayList.add(1, "Orange"); // inserting at index in ArrayList
        linkedList.addFirst("Train"); // inserting at first in LinkedList

        System.out.println("\nAfter modifications:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}

