package br.dazo.person;

import java.util.List;

public class PersonDao {

    static List<PersonEntity> persons =  List.of(
            new PersonEntity("Davison", 35, "001", SexType.MALE),
            new PersonEntity("Davison", 35, "001", SexType.MALE),
            new PersonEntity("Fernando", 35, "002", SexType.MALE),
            new PersonEntity("Fernando", 35, "002", SexType.MALE),
            new PersonEntity("Graziele", 34, "003", SexType.FEMALE),
            new PersonEntity("Graziele", 34, "003", SexType.FEMALE),
            new PersonEntity("Joana", 34, "004", SexType.FEMALE),
            new PersonEntity("Joana", 34, "004", SexType.FEMALE),
            new PersonEntity("Joao", 15, "005", SexType.MALE),
            new PersonEntity("Joao", 15, "005", SexType.MALE),
            new PersonEntity("Fred", 15, "006", SexType.MALE),
            new PersonEntity("Fred", 15, "006", SexType.MALE),
            new PersonEntity("Maxuel", 18, "007", SexType.MALE),
            new PersonEntity("Maxuel", 18, "007", SexType.MALE),
            new PersonEntity("Caio", 18, "008", SexType.MALE),
            new PersonEntity("Caio", 18, "008", SexType.MALE),
            new PersonEntity("Maria", 10, "009", SexType.FEMALE),
            new PersonEntity("Maria", 10, "009", SexType.FEMALE),
            new PersonEntity("Joaquina", 10, "010", SexType.FEMALE),
            new PersonEntity("Joaquina", 10, "010", SexType.FEMALE)
    );

    public static List<PersonEntity> getAllPersons(){
        return persons;
    }

}
