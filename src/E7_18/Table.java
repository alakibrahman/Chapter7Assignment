package E7_18;

public class Table {
    private int[][] values;

    public Table(int rows, int columns) {
        values = new int[rows][columns];
    }

    public void set(int i, int j, int n) {
        values[i][j] = n;
    }

    public int get(int i, int j) {
        return values[i][j];
    }

    public int size() {
        return values.length;
    }

    public double sum(int i, boolean horizontal) {
        double sum = 0;

        if (horizontal) {
            for (int j = 0; j < values[i].length; j++) {
                sum += values[i][j];
            }
        }
        else {
            for (int j = 0; j < values.length; j++) {
                sum += values[j][i];
            }
        }
        return sum;
    }

}
