package E7_23;

public class SequenceRunner {
    public static void main(String[] args) {
        Sequence a = new Sequence();
        a.add(1);
        a.add(4);
        a.add(9);

        Sequence b = new Sequence();
        b.add(16);
        b.add(4);
        b.add(9);
        b.add(11);

        Sequence combined = a.append(b);
        System.out.println("Combined sequence: " + combined);
    }
}
