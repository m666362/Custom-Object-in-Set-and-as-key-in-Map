package org.richit.using_custom_object_libs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
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
        sort();
        List<Man> items = new ArrayList<>(  );
        doSomethingInteresting(items);

        heading("Programme Ended");
    }

    private static void doSomethingInteresting(List<Man> items) {
        heading( "doSomethingInteresting" );
        items.add( new Man( "Jack" ) );
        items.add( new Man( "Alpha" ) );
        items.add( new Man( "Siemen" ) );
        items.add( new Man( "Jhon" ) );
        Collections.sort( items, new AlphabeticallyComparator());
        for (Man key:items){
            System.out.println(key);
        }
        Collections.sort( items, new StringLengthComparator() );
        for (Man key:items){
            System.out.println(key);
        }

    }


    private static void sort() {
        heading( "sort" );
        List<String> list = new ArrayList<>(  );
        list.add( "Alpha" );
        list.add( "Jhon" );
        list.add( "Benjamin" );
        list.add( "Siemen" );
        Collections.sort( list );   //sort alphabetically
        for (String item:list){
            System.out.println(item);
        }
        heading( "sort again" );
        Collections.sort( list, new StringLengthComparator() );
        for (String item: list){
            System.out.println(item);
        }
        heading( "Alphabetically Comparator" );
        Collections.sort( list, new AlphabeticallyComparator() );
        for (String item:list){
            System.out.println(item);
        }
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