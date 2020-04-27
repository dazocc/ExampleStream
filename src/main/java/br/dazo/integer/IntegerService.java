package br.dazo.integer;

import br.dazo.person.PersonEntity;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntegerService {

    public static void main(String[] args) {

        List<Integer> numbers = generateList1Until100();

//        personMinAge(persons);
    }

    /*
     * Example generate
     * Method return a list of number of 1 to 100
     * */
    private static List<Integer> generateList1Until100() {

        System.out.println("Example generate: generateList1Until100");

        List<Integer> numbers = IntStream
                .rangeClosed(1, 20)
                .boxed()
                .collect(Collectors.toList());

        String numbersString = numbers.stream()
                .map(Object::toString)
                .collect(Collectors.joining(","));

        System.out.println(numbersString);

        return numbers;
    }

    /*
     * Example min
     * Method return the person with min age
     * */
    public static void personMinAge(List<PersonEntity> persons) {

        System.out.println("Example min: personMinAge");

        persons.stream()
                .min(Comparator.comparing(PersonEntity::getAge))
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Do not exist any"));

        System.out.println("-------------END-------------");
    }
}
