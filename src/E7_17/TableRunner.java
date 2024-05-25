package E7_17;

public class TableRunner {
    public static void main(String[] args) {
        Table table = new Table(3, 3);
        table.set(0, 0, 1);
        table.set(0, 1, 2);
        table.set(0, 2, 3);
        table.set(1, 0, 4);
        table.set(1, 1, 5);
        table.set(1, 2, 6);
        table.set(2, 0, 7);
        table.set(2, 1, 8);
        table.set(2, 2, 9);

        int row = 1;
        int column = 1;
        double avg = table.neighborAverage(row, column);

        System.out.println("Neigbor average at (" + row + ", " + column + "): " + avg);
    }
}
