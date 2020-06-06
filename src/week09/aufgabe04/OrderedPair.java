package week09.aufgabe04;

public class OrderedPair<O> implements Pair {
    private final O first;
    private final O second;

    public OrderedPair(O first, O second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException("null argument");
        }
        this.first = first;
        this.second = second;
    }

    @Override
    public O getFirst() {
        return first;
    }

    @Override
    public O getSecond() {
        return second;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((first == null) ? 0 : first.hashCode());
        result = prime * result + ((second == null) ? 0 : second.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        OrderedPair other = (OrderedPair) obj;
        if (first == null) {
            if (other.first != null) {
                return false;
            }
        } else if (!first.equals(other.first)) {
            return false;
        }
        if (second == null) {
            if (other.second != null) {
                return false;
            }
        } else if (!second.equals(other.second)) {
            return false;
        }
        return true;
    }

    @Override
    public OrderedPair clone() {
        return new OrderedPair(first, second);
    }

    @Override
    public int compareTo(Object obj) {
        OrderedPair o = (OrderedPair) obj;
        if (first.hashCode() > o.getFirst().hashCode())
            return 1;
        else if(first.hashCode() < o.getFirst().hashCode())
            return -1;
        else {
            if (second.hashCode() > o.getSecond().hashCode())
                return 1;
            else if(second.hashCode() < o.getSecond().hashCode())
                return -1;
            else
                return 0;
        }
    }
}
