package week09.aufgabe01;

import java.time.LocalDate;
import java.util.*;

public class Test {
    private static final List<Integer> INTEGER_LIST = Arrays.asList(1, -3, 22, 7, 43, 212, -87, 12, 6, 99, -65, 2162, 0, -1, -3, 7, 12);
    private static final int MEDIAN_INTEGER = 7;
    private static final List<Integer> LARGEST_3_INTEGERS = Arrays.asList(2162, 212, 99);
    private static final List<Integer> SMALLEST_3_INTEGERS = Arrays.asList(-87, -65, -3);

    private static final List<Person> PEOPLE_LIST = Arrays.asList(
            new Person("Klaus", "Adam", createDate(1978, 4, 13),
                    "Oberseestrasse 14", 8640, "Rapperswil", "Student", "male"),
            new Person("Clara", "Müller", createDate(1978, 4, 13),
                    "Oberseestrasse 14", 8640, "Rapperswil", "Student", "female"),
            new Person("Hans", "Meier", createDate(1980, 1, 2),
                    "Waldweg 2", 8640, "Rapperswil", "Student", "male"),
            new Person("Petra", "Schneider", createDate(1970, 8, 8),
                    "Bahnhofstrasse 1", 8001, "Zürich", "Manager", "female"),
            new Person("Klaus", "Schnell", createDate(1982, 12, 10),
                    "Rütistrasse", 8630, "Rüti", "Engineer", "male"),
            new Person("Peter", "Winter", createDate(1965, 3, 3),
                    "Hinterweg 12", 5000, "Aarau", "Carpenter", "male"),
            new Person("Sandra", "Vogt", createDate(1972, 11, 30),
                    "Altstadtweg 8", 8001, "Zürich", "Banker", "female"),
            new Person("Markus", "Marxer", createDate(1976, 2, 5),
                    "Hauptstrasse 7", 6002, "Luzern", "Baker", "male"),
            new Person("Anna", "Widmer", createDate(1980, 7, 7),
                    "Albisstrasse", 8004, "Zürich", "Teacher", "female"),
            new Person("Hans", "Steiner", createDate(1976, 10, 10),
                    "Seeufer 232", 8640, "Rapperswil", "Student", "male"),
            new Person("Vreni", "Affolter", createDate(1981, 4, 30),
                    "Altstadtweg 17", 4000, "Basel", "Student", "female"),
            new Person("Karl", "Widmer", createDate(1977, 7, 31),
                    "Zentralstrasse 87", 8640, "Rapperswil", "Engineer", "male"),
            new Person("Franz", "Eberhard", createDate(1978, 1, 1),
                    "Hauptstrasse 10", 8640, "Rapperswil", "Student", "male"),
            new Person("Hedi", "Zürcher", createDate(1950, 3, 22),
                    "Bergstrasse 98", 8001, "Zürich", "Retired", "female"),
            new Person("Monika", "Wehrli", createDate(1967, 9, 17),
                    "Stadtweg 1", 5000, "Aarau", "Entrepreneur", "female"),
            new Person("Hans", "Beeler", createDate(1982, 6, 11),
                    "Hauptstrasse 121", 8630, "Rüti", "Student", "male"));

    private static final Person MEDIAN_PERSON = PEOPLE_LIST.get(4);
    private static final Collection<Person> LARGEST_2_PEOPLE = Arrays.asList(PEOPLE_LIST.get(13), PEOPLE_LIST.get(5));
    private static final Collection<Person> SMALLEST_2_PEOPLE = Arrays.asList(PEOPLE_LIST.get(0), PEOPLE_LIST.get(10));

    private static LocalDate createDate(int year, int month, int dayOfMonth) {
        return LocalDate.of(year, month, dayOfMonth);
    }

    public static void main(String[] args) {
        // TODO: Test your generic collection methods using the test data above
        List<Object> list1 = CollectionFunctions.mergeToList(INTEGER_LIST, PEOPLE_LIST);
        System.out.println("Merged list1 = " + list1);
        Set<Object> set1 = CollectionFunctions.mergeToSet(INTEGER_LIST, PEOPLE_LIST);
        System.out.println("Merged set1 = " + set1);
        System.out.println("Size of People List:" + PEOPLE_LIST.size());
        System.out.println("Expected median for people list\t: [" + MEDIAN_PERSON);
        System.out.println("Result median for people list\t: " + CollectionFunctions.median(PEOPLE_LIST));
        System.out.println("Expected median for integer list:[" + MEDIAN_INTEGER + "]");
        System.out.println("Result median for integer list\t:" + CollectionFunctions.median(INTEGER_LIST));
        System.out.println("Expected largest 3 integers: " + LARGEST_3_INTEGERS);
        System.out.println("Result of largest 3 integers:" + CollectionFunctions.largest(INTEGER_LIST, 3));
        System.out.println("Expected smallest 3 integers: " + SMALLEST_3_INTEGERS);
        System.out.println("Result of smallest 3 integers: " + CollectionFunctions.smallest(INTEGER_LIST, 3));

        System.out.println("*******************Aufgabe02*******************************");
        System.out.println(CollectionFunctions.merge(INTEGER_LIST, PEOPLE_LIST));

    }
}
