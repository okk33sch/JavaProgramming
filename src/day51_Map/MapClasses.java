package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        //  key      value
        Map<Integer, String  > hashMap = new HashMap<>(); // key can't duplicate value can // key can be null value can be null as well
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Isabella");
        hashMap.put(5, "Ahmet");
        hashMap.put(6, "Ahmet");
        hashMap.put(7, "Ahmet");
        hashMap.put(8, "Ahmet");
        hashMap.put(null, null);
        hashMap.put(31, null);
        //hashMap.put(null, "Emre");
        hashMap.put(null, "Hulya");


        System.out.println("hashMap = " + hashMap);

        //System.out.println(hashMap.get());


        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // key can be null but only 1 key can be null
        linkedHashMap.put(10, "Arthur");                            // value can be null multiple times
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Ahmet");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(null, "Hulya");
        linkedHashMap.put(15, null);
        linkedHashMap.put(null, null);


        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<Integer, String > treeMap = new TreeMap<>(); // Key can not be null, value can be null and duplicated
        treeMap.put(10, "Arthur");                       // order is smallest to largest
        treeMap.put(20, "George");                       // if use null as a key get NullPointerException
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");
        treeMap.put(5,"Isabella");
        //treeMap.put(null, "Hulya");
        treeMap.put(7, null);

        System.out.println("treeMap = " + treeMap);
        

        Map<Integer, String > hashtable = new Hashtable<>(); // Key and value both cannot be null
        hashtable.put(10, "Arthur");                         // NullPointerException
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Ahmet");
        hashtable.put(5,"Isabella");
        //hashtable.put(null, "Hulya");
        //hashtable.put(6, null);


        System.out.println("hashtable = " + hashtable);

        //Map<Integer, String > hashMap1 = new HashMap<>(10, "Arthur", 20, "George", 3, "Jack", 40, "Emma", 5, "Isabella");



    }
}
/*
browser  chrome
url  
username  cydeo
password  cydeo123
 */
