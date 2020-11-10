package javaWeek9homework;

import java.util.ArrayList;

public class Answer5ArrayListEmpty {
    public static void main(String[] args) {
        // ArrayList of Integer Type
        ArrayList<Integer> al = new ArrayList<>();
        //Checking whether the list is empty
        System.out.println("Is ArrayList Empty: " + al.isEmpty());

        //Adding Integer Elements
        al.add(1);
        al.add(88);
        al.add(9);
        al.add(17);

        //Again Checking for isEmpty
        System.out.println("Is ArrayList Empty: " + al.isEmpty());

        //Displaying elements of the list
        for (Integer num : al){
            System.out.println(num);
        }
    }
}
