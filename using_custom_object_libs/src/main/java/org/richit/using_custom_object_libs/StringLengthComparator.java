package org.richit.using_custom_object_libs;

import java.util.Comparator;

public class StringLengthComparator implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        if(o.toString().length()>t1.toString().length()){
            return 1;
        }
        else {
            return -1;
        }
    }

}
