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
        Set<Person> sets = new LinkedHashSet<>();
        sets.add( new Person( "Jhon", 3 ));
        sets.add( new Person( "Jack", 3 ));
        sets.add( new Person( "Alpha", 3 ));
        for (Person key:sets){
            System.out.println( key );
        }
    }

    private static void hashMap() {
        heading( "hashMap" );
        Map<Person, Integer> hashmap = new HashMap<>(  );
        hashmap.put( new Person( "Jhon", 3 ),  5 );
        hashmap.put( new Person( "Jack", 3 ), 3 );
        hashmap.put( new Person( "Alpha", 3 ), 1 );
        hashmap.put( new Person( "Tesla", 3 ), 4 );
        hashmap.put( new Person( "Benjamin", 3 ), 2 );
        hashmap.put( new Person( "Alpha", 3 ), 2 );
        for (Person key:hashmap.keySet()){
            System.out.println( key + " : " + hashmap.get( key ));
        }
    }

}
