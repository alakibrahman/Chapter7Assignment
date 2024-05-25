package E7_24;

import java.util.ArrayList;

public class Sequence {
    private ArrayList<Integer> values;

    public Sequence() {
        values = new ArrayList<>();
    }

    public void add(int n) {
        values.add(n);
    }

    public String toString() {
        return values.toString();
    }

    public Sequence merge(Sequence other) {
        Sequence merged = new Sequence();

        int sizeA = values.size();
        int sizeB = other.values.size();
        int maxSize = Math.max(sizeA, sizeB);

        for(int i = 0; i < maxSize; i++) {
            if(i < sizeA) {
                merged.add(other.values.get(i));
            }
        }
        return merged;
    }
}
