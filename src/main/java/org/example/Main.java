package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Mark1", 15);
        Person person2 = new Person("Mark2", 30);
        Person person3 = new Person("Mark3", 60);

        people.add(person1);
        people.add(person2);
        people.add(person3);


        List<Person> peopleOver18 = people.stream()
                .filter((p) -> p.getAge() >= 18)
                .collect(Collectors.toList());

        peopleOver18.stream()
                .forEach((person) -> {
                    System.out.println(person.getName() + " : " + person.getAge());
                });

        List<Person> peopleWith2 = people.stream()
                .filter(person -> person.getName().contains("2"))
                .collect(Collectors.toList());

        peopleWith2.stream()
                .forEach(p -> System.out.println(p.getName()));

    }
}