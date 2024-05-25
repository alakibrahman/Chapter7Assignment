package E7_23;

import java.util.ArrayList;

public class Sequence {
    private ArrayList<Integer> values;

    public Sequence() {
        values = new ArrayList<Integer>();
    }

    public void add(int n) {
        values.add(n);
    }

    public String toString() {
        return values.toString();
    }

    public Sequence append(Sequence other) {
        Sequence result = new Sequence();

        result.values.addAll(this.values);

        result.values.addAll(other.values);

        return result;
    }
}
