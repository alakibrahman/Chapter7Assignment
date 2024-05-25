package E7_24;

public class SequenceRunner {
    public static void main(String[] args) {
        Sequence a = new Sequence();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);

        Sequence b = new Sequence();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        Sequence mergedSequence = a.merge(b);
        System.out.println("Merged sequence: " + mergedSequence);
    }
}
