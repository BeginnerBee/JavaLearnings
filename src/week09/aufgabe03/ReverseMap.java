package week09.aufgabe03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ReverseMap<L, R> {

    Map<R, L> reverseMap = new HashMap<>();
    Map<L, R> regularMap = new HashMap<>();

    public static void main(String[] args) {
        ReverseMap<Integer, String> rm = new ReverseMap<>();
        rm.put(1, "A");
        rm.put(2, "B");
        rm.put(3, "C");
        rm.put(4, "C");

        System.out.println(rm.getLeft("A"));
        System.out.println(rm.getRight(1));

        System.out.println(rm.leftValues());
        System.out.println(rm.rightValues());

        System.out.println(rm.size());

    }

    public void put(L left, R right) {
        reverseMap.put(right, left);
        regularMap.put(left, right);
    }

    public R getRight(L left) {
        return regularMap.get(left);
    }

    public L getLeft(R right) {
        return reverseMap.get(right);
    }

    public Collection<L> leftValues() {
        return regularMap.keySet();
    }

    public Collection<R> rightValues() {
        return reverseMap.keySet();
    }

    public int size() {
        return reverseMap.size();
    }

    public void clear() {
        reverseMap.clear();
        regularMap.clear();
    }

}
