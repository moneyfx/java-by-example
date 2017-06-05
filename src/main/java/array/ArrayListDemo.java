package array;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void run(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();

        myList.add("one");
        myList.add("two");
        myList.add("three");
        System.out.println(myList);

        // add in the beginning of the list
        myList.add(0, "zero");
        System.out.println(myList);

        String valueOfElm3 = myList.get(3);
        System.out.println("get value of element position 3 = " + valueOfElm3);

        // use set to replace an existing element
        myList.set(0, "replaced");
        System.out.println(myList);

        //size of the list
        myList.add(myList.size(), String.valueOf(myList.size()));
        System.out.println(myList);

        System.out.println("looping:");
        //loop through the list
        for (String s: myList) {
            System.out.println(s);
        }

    }
}
