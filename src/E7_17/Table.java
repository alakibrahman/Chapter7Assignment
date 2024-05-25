package E7_17;

public class Table {
    private int[][] values;

    public Table(int rows, int columns) {
        values = new int[rows][columns];
    }

    public void set(int i, int j, int n) {
        values[i][j] = n;
    }

    public double neighborAverage(int row, int column) {
        int sum = 0;
        int count = 0;

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for(int dir = 0; dir < 8; dir++) {
            int newRow = row + dx[dir];
            int newColumn = column + dy[dir];

            if(newRow >= 0 && newRow < values.length && newColumn >= 0 && newColumn < values[0].length) {
                sum += values[newRow][newColumn];
                count++;
            }
        }

        return (double) sum / count;
    }
}
