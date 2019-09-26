package com.thoughtworks;


import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    @Test
    void givenPersonInformation_whenAdd_ThenAdded() throws IOException {
        Address address = new Address(" Nagar", "Banglore", "Karnataka", 431415);
        Person person = new Person(01, "damon", "9098909890", address);
        AddressBook addPerson = new AddressBook(person);  // TODO - name addPerson
        assertEquals(true, addPerson.addPerson());
    }

    @Test
    void givenTwoPersonInformation_whenAdd_ThenAdded() throws IOException {
        Address address = new Address(" jaya", "mumbai", "Maharastra", 354353);
        Person person1 = new Person(02, "Stofon", "9098909890", address);
        AddressBook addPerson = new AddressBook(person1);
        assertEquals(true, addPerson.addPerson());
    }

    @Test
    void givenThirdPersonInformation_whenAdd_ThenAdded() throws IOException {
        Address address = new Address(" KarveNagar", "Pune", "Maharastra", 354353);
        Person person = new Person(03, "Bella", "9098909890", address);
        AddressBook addPerson = new AddressBook(person);
        assertEquals(true, addPerson.addPerson());
    }

    @Test
    void givenFourthPersonInformation_whenAdd_ThenAdded() throws IOException {
        Address address = new Address(" Kothrud", "Pune", "Maharastra", 354353);
        Person person = new Person(04, "Khalesi", "9098909890", address);
        AddressBook addPerson = new AddressBook(person);
        assertEquals(true, addPerson.addPerson());
    }
}
