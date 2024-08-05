import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Пример использования Calculator
        System.out.println(Calculator.sum(5, 3.2));
        System.out.println(Calculator.multiply(4, 2.5));
        System.out.println(Calculator.divide(9.0, 3));
        System.out.println(Calculator.subtract(7, 2.5));

        // Пример использования compareArrays
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        Integer[] array3 = {4, 5, 6};
        System.out.println(compareArrays(array1, array2));
        System.out.println(compareArrays(array1, array3));

        // Пример использования Pair
        Pair<String, Integer> pair = new Pair<>("Hello", 100);
        System.out.println(pair);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }

    static class Calculator {
        public static <T extends Number, U extends Number> double sum(T a, U b) {
            return a.doubleValue() + b.doubleValue();
        }

        public static <T extends Number, U extends Number> double multiply(T a, U b) {
            return a.doubleValue() * b.doubleValue();
        }

        public static <T extends Number, U extends Number> double divide(T a, U b) {
            if (b.doubleValue() == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return a.doubleValue() / b.doubleValue();
        }

        public static <T extends Number, U extends Number> double subtract(T a, U b) {
            return a.doubleValue() - b.doubleValue();
        }
    }

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    static class Pair<F, S> {
        private final F first;
        private final S second;

        public Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }

        public F getFirst() {
            return first;
        }

        public S getSecond() {
            return second;
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }
}
