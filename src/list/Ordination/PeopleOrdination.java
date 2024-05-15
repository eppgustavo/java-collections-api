package list.Ordination;

import list.Ordination.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PeopleOrdination {

    private List<Person> people;

    public PeopleOrdination() {
        this.people = new ArrayList<>();
    }


    public void addPerson(String name, int age, double height) {
        final Person newPerson = new Person(name, age, height);
        this.people.add(newPerson);
    }

    public List<Person> orderPersonByAge() {
        final List<Person> orderPeopleByAge = new ArrayList<>(people);
        Collections.sort(orderPeopleByAge);

        return orderPeopleByAge;
    }

    public List<Person> orderByHeight () {
        final List<Person> orderPeopleByHeight = new ArrayList<>(people);
        Collections.sort(orderPeopleByHeight, new Person.ComparePeopleByHeight());

        return orderPeopleByHeight;
    }

    public static void main(String[] args) {

        final PeopleOrdination people = new PeopleOrdination();

        Person person1 = new Person("John Doe", 50, 1.70);
        Person person2 = new Person("Jane Doe", 30, 1.87);
        Person person3 = new Person("Jane Doe", 45, 1.90);

        people.addPerson(person1.getName(), person1.getAge(), person1.getHeight());
        people.addPerson(person2.getName(), person2.getAge(), person2.getHeight());
        people.addPerson(person3.getName(), person3.getAge(), person3.getHeight());

        System.out.println(people.orderPersonByAge());
        System.out.println(people.orderByHeight());
    }

}
