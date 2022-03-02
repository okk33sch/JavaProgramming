package day48_Collections.tasks;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(50, "Isabella");
        hashMap.put(null, null);

        System.out.println("hashMap = " + hashMap);


        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(50, "Isabella");
        linkedHashMap.put(null, null);

        System.out.println("linkedHashMap = " + linkedHashMap);


        Map<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(50, "Isabella");
        //hashtable.put(null, null); // it does not accept null key neither key nor value

        System.out.println("hashtable = " + hashtable);


        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(50, "Isabella");
        //hashtable.put(null, null); // it does not accept null key neither key nor value

        System.out.println("treeMap = " + treeMap);


    }
}
