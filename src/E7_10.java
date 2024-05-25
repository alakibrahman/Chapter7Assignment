public class E7_10 {
    private double[] values;
    private int size;

    private int maximumNumberOfValues;

    public E7_10(int maximumNumberOfValues) {
        this.maximumNumberOfValues = maximumNumberOfValues;

        this.values = new double[maximumNumberOfValues];

        this.size = 0;
    }

    public void add(double value) {
        if(size < maximumNumberOfValues) {
            values[size] = value;
            size++;
        }

        else {
            System.out.println("Dataset is full.cannot add more values. ");
        }
    }

    public double getSum() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += values[i];
        }
        return sum;
    }

    public double getAverage() {
        if(size == 0) {
            return 0;
        }
        return getSum() / size;
    }

    public double getMaximum() {
        if(size == 0) {
            return 0;
        }
        double max = values[0];
        for(int i = 1; i < size; i++) {
            if(values[i]>max) {
                max = values[i];
            }
        }
        return max;
    }

    public double getMinimum() {
        if(size == 0) {
            return 0;
        }
        double min = values[0];
        for(int i = 1; i < 10; i++) {
            if(values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }
}
