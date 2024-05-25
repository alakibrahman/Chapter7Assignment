public class E7_10_Runner {
    public static void main(String[] args) {
        E7_10 dataset = new E7_10(5);

        dataset.add(10.5);
        dataset.add(7.2);
        dataset.add(15.0);
        dataset.add(8.9);

        System.out.println("sum: " + dataset.getSum());

        System.out.println("Average: " + dataset.getAverage());

        System.out.println("Maximum: " + dataset.getMaximum());

        System.out.println("Minimum: " + dataset.getMinimum());
    }
}
