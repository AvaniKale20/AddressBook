package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    Person person;

    private List<Person> people;

    AddressBook() {
        people = new ArrayList<>();
    }

    public boolean add(Person person) {
        people.add(person);
        return true;

    }

    public List<Person> get() {
        return people;
    }
}
