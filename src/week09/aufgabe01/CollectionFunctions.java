package week09.aufgabe01;

import java.util.*;

public class CollectionFunctions {

    public static <T, C extends Collection> List<T> mergeToList(C coll1, C coll2) {
        List<T> list = new ArrayList<>();
        list.addAll(coll1);
        list.addAll(coll2);
        return list;
    }

    public static <T, C extends Collection> Set<T> mergeToSet(C coll1, C coll2) {
        Set<T> set = new HashSet<>();
        set.addAll(coll1);
        set.addAll(coll2);
        return set;
    }

    public static <C extends Collection> void merge(C coll1, C coll2, C targetColl) {
        targetColl.addAll(coll1);
        targetColl.addAll(coll2);
        System.out.println("targetColl = " + targetColl);
    }

    public static <T extends Comparable<T>, C extends Collection<T>> C median(C coll) {
        List<T> median = new ArrayList<>();
        List<T> list = new ArrayList<>();
        list.addAll(coll);
        list.sort((o1, o2) -> o1.compareTo(o2));
        if (list.size() % 2 == 1) {
            median.add(list.get(list.size() / 2));
        } else {
            median.add(list.get(list.size() / 2));
            median.add(list.get(list.size() / 2 + 1));
        }
        return (C) median;
    }

    public static <T extends Comparable<T>, C extends Collection<T>> C largest(C coll, int amount) {
        List<T> largests = new ArrayList<>();
        List<T> list = new ArrayList<>();
        list.addAll(coll);
        list.sort((o1, o2) -> o1.compareTo(o2));
        int size = list.size();
        for (int i = size; i > size - amount; i--) {
            largests.add(list.get(i - 1));
        }
        return (C) largests;
    }

    public static <T extends Comparable<T>, C extends Collection<T>> C smallest(C coll, int amount) {
        List<T> smallest = new ArrayList<>();
        List<T> list = new ArrayList<>();
        list.addAll(coll);
        list.sort((o1, o2) -> o1.compareTo(o2));
        for (int i = 0; i < amount; i++) {
            smallest.add(list.get(i));
        }
        return (C) smallest;
    }

    /**Aufgae02*/
    public static <E, C extends Collection> C merge(C coll1, C coll2) {
        List<E> list = new ArrayList<>();
        list.addAll(coll1);
        list.addAll(coll2);
        return (C)list;
    }


}
