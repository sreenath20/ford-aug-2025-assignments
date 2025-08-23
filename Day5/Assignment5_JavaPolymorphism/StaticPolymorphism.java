public class StaticPolymorphism {

    static class MathOperations {
        public int add(int a, int b) {
            System.out.println("Called add(int, int)");
            return a + b;
        }

        public double add(double a, double b) {
            System.out.println("Called add(double, double)");
            return a + b;
        }

        public int add(int[] arr) {
            System.out.println("Called add(int[])");
            int sum = 0;
            for (int v : arr) sum += v;
            return sum;
        }
    }

    public static void main(String[] args) {
        MathOperations mo = new MathOperations();

        int sumInts = mo.add(3, 4);
        System.out.println("sumInts = " + sumInts);

        double sumDoubles = mo.add(2.5, 4.1);
        System.out.println("sumDoubles = " + sumDoubles);

        int[] arr = {1, 2, 3, 4};
        int sumArray = mo.add(arr);
        System.out.println("sumArray = " + sumArray);


    }
}
