package com.thoughtworks;

public class Person {

    private int id;
    private String name;
    private String mobileNo;
    private Address address;

    Person(int id, String name, String mobileNo, Address address) {
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
        this.address = address;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", address=" + address +
                '}';
    }
}
