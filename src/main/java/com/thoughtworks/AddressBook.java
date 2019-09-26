package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    Person person;

    private List<Person> people;

    AddressBook() {
        people = new ArrayList<>();
    }

    public void add(Person person) {
        people.add(person);
    }

    public List<Person> get() {
        return people;
    }
}
