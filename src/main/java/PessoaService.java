import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PessoaService {

    private static final PersonDao personDao = new PersonDao();

    public static void main(String[] args) {
        List<PersonEntity> persons = personDao.getAllPersons();
        personMinAge(persons);
        personMinAge(List.of());
        personMaxAge(persons);
        personMaxAge(List.of());
        personsFilterAgeGreater(persons, 18);
        agesFilterAgeGreater(persons, 18);
        agesFilterAgeGreater2(persons, 18);
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

    /*
     * Example max
     * Method return the person with max age
     * */
    public static void personMaxAge(List<PersonEntity> persons) {

        System.out.println("Example max: personMaxAge");

        persons.stream()
                .max(Comparator.comparing(PersonEntity::getAge))
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Do not exist any"));

        System.out.println("-------------END-------------");
    }

    /*
     * Example filter
     * Method return the persons with age greater than parameter
     * */
    public static void personsFilterAgeGreater(List<PersonEntity> persons, Integer age) {

        System.out.println("Example filter: personsFilterAgeGreater");

        persons.stream()
                .filter(person -> person.getAge() > age)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("-------------END-------------");
    }

    /*
     * Example filter and map
     * Method return the different ages with age greater than parameter
     * */
    public static void agesFilterAgeGreater(List<PersonEntity> persons, Integer age) {

        System.out.println("Example filter and map: agesFilterAgeGreater");

        persons.stream()
                .filter(person -> person.getAge() > age)
                .map(person -> person.getAge())
                .distinct()
                .forEach(System.out::println);


        System.out.println("-------------END-------------");
    }

    /*
     * Example filter and mapToInt
     * Method return the diferent ages with age greater than parameter
     * */
    public static void agesFilterAgeGreater2(List<PersonEntity> persons, Integer age) {

        System.out.println("Example filter and mapToInt: agesFilterAgeGreater2");

        persons.stream()
                .filter(person -> person.getAge() > age)
                .mapToInt(PersonEntity::getAge)
                .distinct()
                .forEach(System.out::println);

        System.out.println("-------------END-------------");
    }

}
