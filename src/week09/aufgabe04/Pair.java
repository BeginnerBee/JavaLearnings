package week09.aufgabe04;

public interface Pair<A> extends Cloneable, Comparable<Pair> {
	A getFirst();
	A getSecond();
	Pair clone();
}
