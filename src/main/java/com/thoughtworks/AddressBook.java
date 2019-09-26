package com.thoughtworks;

import java.io.*;
import java.util.ArrayList;


public class AddressBook {

    private Person person;


    AddressBook(Person person) {
        this.person = person;
    }

    public boolean addPerson() throws IOException {
        ArrayList<Person> person1 = new ArrayList<>();

        person1.add(person);
        person1.add(person);
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("/Users/avanijayantkale/Desktop/address.txt")));
        writer.write(person1.toString());
        writer.flush();
        return true;

    }


}
