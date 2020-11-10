package javaWeek9homework;

import java.util.ArrayList;
import java.util.Scanner;

// this program retrieve an element from a given array list
public class Answer4RetrieveElement {
    static int val;
    static int ret;

    public static void main(String[] args) {
        System.out.println("Enter your choice from 0 to 4: ");
        Scanner mySc = new Scanner(System.in);
        val = mySc.nextInt();
        colourName(val);
    }


    public static void colourName(int ret) {
        ArrayList<String> color_list = new ArrayList<String>(5);
        // use add() method to add values in the list
        color_list.add("White");
        color_list.add("Black");
        color_list.add("Red");
        color_list.add("White");
        color_list.add("Yellow");
        String name = color_list.get(ret);
        System.out.println("The color at given index is " + name);
    }
}

