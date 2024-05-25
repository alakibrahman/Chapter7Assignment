package E7_12;

public class SequenceRunner {
    public static void main(String[] args) {
        Sequence seq1 = new Sequence(5);

        seq1.set(0 , 10);
        seq1.set(1 , 20);
        seq1.set(2 , 30);
        seq1.set(3 , 40);
        seq1.set(4 , 50);

        Sequence seq2 = new Sequence(5);

        seq2.set(0 , 10);
        seq2.set(1 , 20);
        seq2.set(2 , 30);
        seq2.set(3 , 40);
        seq2.set(4 , 50);

        System.out.println("Are the sequence equal? " + seq1.equals(seq2));
    }
}
