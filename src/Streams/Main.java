package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Stefan", 23, Gender.MALE);
        Person p2 = new Person("Bugra", 23, Gender.MALE);
        Person p3 = new Person("Tim", 23, Gender.MALE);
        Person p4 = new Person("Arianna", 23, Gender.FEMALE);
        Person p5 = new Person("Yaren", 23, Gender.FEMALE);

        List<Person> persons = List.of(p1, p2, p3, p4, p5);

        persons.stream().forEach(System.out::println);

        System.out.println();
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        List<Person> females = persons.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        // Filter Methode mit einer For-Schleife
        // for (Person person : persons) {
        // if (person.getGender().equals(Gender.FEMALE)) {
        // females.add(person);
        // }
        // }
        females.stream().forEach(System.out::println);

    }

}
