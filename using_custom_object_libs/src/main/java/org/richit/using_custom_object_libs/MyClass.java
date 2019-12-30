package org.richit.using_custom_object_libs;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MyClass {
    public static String dot = "---------------";
    private static void heading(String programme_heading) {
        System.out.println();
        System.out.println(dot + programme_heading + dot);
        System.out.println();
    }

    public static void main(String[] args) {
        heading("Programme Started");

        hashMap();
        set();
        heading("Programme Ended");
    }

    private static void set() {
        heading( "Set" );
        Set<String> sets = new LinkedHashSet<>();
        sets.add( "Alpha" );
        sets.add( "Benjamin" );
        sets.add( "Tesla" );
        for (String key:sets){
            System.out.println( key );
        }
    }

    private static void hashMap() {
        heading( "hashMap" );
        Map<String, Integer> hashmap = new HashMap<>(  );
        hashmap.put( "Jack", 5 );
        hashmap.put( "Jhon", 3 );
        hashmap.put( "Alpha", 1 );
        hashmap.put( "Tesla", 4 );
        hashmap.put( "Benjamin", 2 );
        hashmap.put( "Alpha", 2 );
        for (String key:hashmap.keySet()){
            System.out.println( key + " : " + hashmap.get( key ));
        }
    }

}
