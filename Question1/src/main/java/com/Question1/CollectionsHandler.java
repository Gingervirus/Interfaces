package com.Question1;

import java.util.*;

/**
 * Created by Armin on 2016-03-13.
 */
public class CollectionsHandler {
    public static void main( String[] args )
    {
        System.out.println("Using List to add an array to it:");
        String[] things = {"apple", "bob", "band", "scram", "man", "bob"};
        List<String> list = Arrays.asList(things);

        System.out.printf("%s ", list);
        System.out.println();
        System.out.println("Using Set to remove duplicates:");


        Set<String> set1 = new HashSet<String>(list);
        System.out.printf("%s ", set1);

        System.out.println("\nAdded the list to a map and added a type");
        Map<String, String> map = new HashMap();
        map.put(list.get(0), "fruit");
        map.put(list.get(1), "fruit");
        map.put(list.get(2), "name");
        map.put(list.get(3), "band");
        map.put(list.get(4), "flee");
        map.put(list.get(5), "male");
        System.out.println(map);
        System.out.println("if the map contains a apple it would display true:");
        if (map.containsKey("apple"))
        {
            System.out.println("true");
        }


    }
}
