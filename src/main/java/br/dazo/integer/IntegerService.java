package br.dazo.integer;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntegerService {

    public static void main(String[] args) {

        List<Integer> numbers = generateList1Until20();

        minNumber(4);

        minReduceNumber2();
        maxNumber();
        maxReduceNumber2();
        sumNumber();
        sumReduceNumber2();
        countNumber();
        averageNumber();
        summaryStatisticsNumber();
    }

    /*
     * Example generate boxed
     * Method return a list of number of 1 to 100
     * */
    private static List<Integer> generateList1Until20() {

        System.out.println("Example generate boxed: generateList1Until100");

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
     * Method return min number
     * */
    private static void minNumber() {

        System.out.println("Example min: minNumber");

        Integer number = IntStream
                .rangeClosed(1, 20)
                .boxed()
                .mapToInt( n -> n )
                .min()
                .orElse(-1);

        System.out.println(number);

        System.out.println("-------------END-------------");
    }

    /*
     * Example min
     * Method return min number
     * */
    private static void minReduceNumber2() {

        System.out.println("Example min: minReduceNumber2");

        Integer number = IntStream
                .rangeClosed(1, 20)
                .reduce(Integer::min)
                .orElse(-1);

        System.out.println(number);

        System.out.println("-------------END-------------");
    }

    /*
     * Example max
     * Method return max number
     * */
    private static void maxNumber() {

        System.out.println("Example max: maxNumber");

        Integer number = IntStream
                .rangeClosed(1, 20)
                .boxed()
                .mapToInt( n -> n )
                .max()
                .orElse(-1);

        System.out.println(number);

        System.out.println("-------------END-------------");
    }
    /*
     * Example max
     * Method return max number
     * */
    private static void maxReduceNumber2() {

        System.out.println("Example max: maxNumber2");

        Integer number = IntStream
                .rangeClosed(1, 20)
                .reduce(Integer::max)
                .orElse(-1);

        System.out.println(number);

        System.out.println("-------------END-------------");
    }

    /*
     * Example sum
     * Method return sum number
     * */
    private static void sumNumber() {

        System.out.println("Example sum: sumNumber");

        Integer number = IntStream
                .rangeClosed(1, 20)
                .boxed()
                .mapToInt( n -> n )
                .sum();

        System.out.println(number);

        System.out.println("-------------END-------------");
    }

    /*
     * Example sum
     * Method return sum number
     * */
    private static void sumReduceNumber2() {

        System.out.println("Example sum: sumReduceNumber2");

        Integer number = IntStream
                .rangeClosed(1, 20)
                .reduce(Integer::sum)
                .orElse(-1);

        System.out.println(number);

        System.out.println("-------------END-------------");
    }

    /*
     * Example count
     * Method return count number
     * */
    private static void countNumber() {

        System.out.println("Example count: countNumber");

        Long number = IntStream
                .rangeClosed(1, 20)
                .boxed()
                .mapToInt( n -> n )
                .count();

        System.out.println(number);

        System.out.println("-------------END-------------");
    }

    /*
     * Example average
     * Method return average number
     * */
    private static void averageNumber() {

        System.out.println("Example average: averageNumber");

        Double number = IntStream
                .rangeClosed(1, 20)
                .boxed()
                .mapToInt( n -> n )
                .average()
                .orElse(-1D);

        System.out.println(number);

        System.out.println("-------------END-------------");
    }

    /*
     * Example summaryStatistics
     * Method return summaryStatistics number
     * */
    private static void summaryStatisticsNumber() {

        System.out.println("Example count: summaryStatisticsNumber");

        IntSummaryStatistics statistics = IntStream
                .rangeClosed(1, 20)
                .boxed()
                .mapToInt( n -> n )
                .summaryStatistics();

        System.out.println(statistics);

        System.out.println("-------------END-------------");
    }
}
