package org.richit.using_custom_object_libs;

import java.util.Objects;

public class Person implements Comparable{
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals( name, person.name );
    }

    @Override
    public int hashCode() {
        return Objects.hash( name, id );
    }

    @Override
    public int compareTo(Object o) {
        return this.name.compareTo( o.toString() );
    }
}
