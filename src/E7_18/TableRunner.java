package E7_18;

public class TableRunner {
    public static void main(String[] args) {
        Table table = new Table(3, 4);

        table.set(0, 0, 1);
        table.set(0, 1, 2);
        table.set(0, 2, 3);
        table.set(0, 3, 4);
        table.set(1, 0, 5);
        table.set(1, 1, 6);
        table.set(1, 2, 7);
        table.set(1, 3, 8);
        table.set(2, 0, 9);
        table.set(2, 1, 10);
        table.set(2, 2, 11);
        table.set(2, 3, 12);

        int row = 1;
        int column = 2;

        double rowSum = table.sum(row, true);
        double columnSum = table.sum(column, false);

        System.out.println("Sum of row " + row + ": " + rowSum);
        System.out.println("sum of column " + column + ": " + columnSum);
    }
}
