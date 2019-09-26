package com.thoughtworks;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    @Test
    void givenPerson_whenAdd_ThenAdded() throws IOException {
        Address address = new Address(" Nagar", "Banglore", "Karnataka", 431415);
        Person person = new Person(01, "damon", "9098909890", address);

        AddressBook addressBook = new AddressBook();  // TODO - name addPerson

        assertEquals(true, addressBook.add(person));
    }

    @Test
    void givenNoPersonWasAdded_WhenRetrieveAddressBookContent_ThenItShouldNotReturnAnyPerson() {
        AddressBook addressBook = new AddressBook();

        Assertions.assertTrue(addressBook.get().isEmpty());
    }

    @Test
    void givenAddedPerson_WhenRetrieveFromAddressBook_ThenItShouldReturnThatPerson() {
        Address address = new Address(" MgRoad", "pune", "Maharashtra", 431415);
        Person person = new Person(02, "Stafon", "9098909890", address);
        AddressBook addressBook = new AddressBook();

        addressBook.add(person);

        Assertions.assertEquals(1, addressBook.get().size());


    }

    @Test
    void givenWeAddTwoPerson_WhenRetrieveFromAddressBook_ThenReturnTwoPeople() {
        Address address = new Address(" karave", "pune", "Maharashtra", 431415);
        Person Bella = new Person(02, "Bella", "9098909890", address);
        Address address1 = new Address(" Kothrud", "pune", "Maharashtra", 431415);
        Person Khalesi = new Person(02, "Khalesi", "9098909890", address);
        AddressBook addressBook = new AddressBook();

        addressBook.add(Bella);
        addressBook.add(Khalesi);

        Assertions.assertEquals(2, addressBook.get().size());

    }
}
