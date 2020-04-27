import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonGroupService {

    private static final PersonDao personDao = new PersonDao();

    public static void main(String[] args) {
        List<PersonEntity> persons = personDao.getAllPersons();

        groupBySex(persons);
        groupByComplexType(persons);
        groupByComplexTypeSet(persons);
        groupBySexAverageAge(persons);
        groupBySexSumAge(persons);
        groupBySexMaxAge(persons);
        groupBySexMinAge(persons);
        groupBySexSummarize(persons);
    }

    /*
     * Example Collectors.groupingBy
     * Method return a map separate by sex
     * */
    public static void groupBySex(List<PersonEntity> persons) {

        System.out.println("Example Collectors.groupingBy: groupBySex");

        persons.stream()
                .collect(Collectors.groupingBy(PersonEntity::getSex))
                .forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

        System.out.println("-------------END-------------");
    }

    /*
     * Example Collectors.groupingBy (complexType)
     * Method return a map separate by sex and age
     * */
    public static void groupByComplexType(List<PersonEntity> persons) {

        System.out.println("Example Collectors.groupingBy (complexType): groupByComplexType");

        persons.stream()
                .collect(Collectors.groupingBy(person -> new SexAge(person.getSex(), person.getAge())))
                .forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

        System.out.println("-------------END-------------");
    }

    /*
     * Example Collectors.groupingBy (complexType) (set)
     * Method return a map separate by sex and age and in an set
     * */
    public static void groupByComplexTypeSet(List<PersonEntity> persons) {

        System.out.println("Example Collectors.groupingBy (complexType) (set): groupByComplexTypeSet");

        persons.stream()
                .collect(Collectors.groupingBy(person -> new SexAge(person.getSex(), person.getAge()), Collectors.toSet()))
                .forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

        System.out.println("-------------END-------------");
    }


    /*
     * Example Collectors.groupingBy(Collectors.averagingInt)
     * Method return a map separate by sex and collect the average age
     * */
    public static void groupBySexAverageAge(List<PersonEntity> persons) {

        System.out.println("Example Collectors.groupingBy(Collectors.averagingInt): groupBySexAverageAge");

        persons.stream()
                .collect(Collectors.groupingBy(PersonEntity::getSex, Collectors.averagingInt(PersonEntity::getAge)))
                .forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

        System.out.println("-------------END-------------");
    }

    /*
     * Example Collectors.groupingBy(Collectors.summingInt)
     * Method return a map separate by sex and collect the sum age
     * */
    public static void groupBySexSumAge(List<PersonEntity> persons) {

        System.out.println("Example Collectors.groupingBy: groupBySex");

        persons.stream()
                .collect(Collectors.groupingBy(PersonEntity::getSex, Collectors.summingInt(PersonEntity::getAge)))
                .forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

        System.out.println("-------------END-------------");
    }

    /*
     * Example Collectors.groupingBy(Collectors.maxBy(Comparator.comparingInt))
     * Method return a map separate by sex and collect the max age
     * */
    public static void groupBySexMaxAge(List<PersonEntity> persons) {

        System.out.println("Example Collectors.groupingBy(Collectors.maxBy(Comparator.comparingInt)): groupBySexMaxAge");

        persons.stream()
                .collect(Collectors.groupingBy(
                        PersonEntity::getSex, Collectors.maxBy(
                                Comparator.comparingInt(PersonEntity::getAge))))
                .forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

        System.out.println("-------------END-------------");
    }

    /*
     * Example Collectors.groupingBy(Collectors.minBy(Comparator.comparingInt))
     * Method return a map separate by sex and collect the min age
     * */
    public static void groupBySexMinAge(List<PersonEntity> persons) {

        System.out.println("Example Collectors.groupingBy(Collectors.minBy(Comparator.comparingInt)): groupBySexMinAge");

        persons.stream()
                .collect(Collectors.groupingBy(
                        PersonEntity::getSex, Collectors.minBy(
                                Comparator.comparingInt(PersonEntity::getAge))))
                .forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

        System.out.println("-------------END-------------");
    }

    /*
     * Example Collectors.groupingBy(Collectors.summarizingInt)
     * Method return a map separate by sex and collect the min age
     * */
    public static void groupBySexSummarize(List<PersonEntity> persons) {

        System.out.println("Example Collectors.groupingBy(Collectors.summarizingInt): groupBySexSummarize");

        persons.stream()
                .collect(Collectors.groupingBy(
                        PersonEntity::getSex, Collectors.summarizingInt(PersonEntity::getAge)))
                .forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

        System.out.println("-------------END-------------");
    }
}
