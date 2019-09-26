package com.thoughtworks;


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


}
