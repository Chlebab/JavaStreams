package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Mark1", 15);
        Person person2 = new Person("Mark2", 30);
        Person person3 = new Person("Mark3", 60);

        people.add(person1);
        people.add(person2);
        people.add(person3);

        List<Person> peopleOver18 = new ArrayList<>();

        peopleOver18 = people.stream()
                .filter((p) -> p.getAge() >= 18);
    }

}