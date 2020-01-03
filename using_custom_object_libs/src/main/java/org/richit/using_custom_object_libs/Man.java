package org.richit.using_custom_object_libs;

import java.util.Objects;

public class Man implements Comparable {

   private String name;

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return name.equals( man.name );
    }

    @Override
    public int hashCode() {
        return Objects.hash( name );
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
