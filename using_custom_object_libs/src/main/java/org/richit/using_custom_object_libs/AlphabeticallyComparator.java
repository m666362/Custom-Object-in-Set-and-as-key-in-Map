package org.richit.using_custom_object_libs;

import java.util.Comparator;

public class AlphabeticallyComparator implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        return o.toString().compareTo( t1.toString() );
    }
}
