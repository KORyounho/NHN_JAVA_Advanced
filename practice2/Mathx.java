package practice2;

public class Mathx {

    public static double sum(double number) {
        return (1 + number) * number / 2;
    }

    public static double sum(double x, double y) {
        return sum(x) - sum(y - 1);
    }

    public static double sum(double... numbers) {
        return reduce(new Plus(), 0, numbers);
    }

    public static double multiply(double... numbers) {
        return reduce(new Multiply(), 1, numbers);
    }

    static double reduce(BinaryOperation binaryOperation, double init, double... numbers) {
        double result = init;
        for (double number : numbers) {
            result = binaryOperation.apply(result, number);
        }
        return reduceIf(x->true, binaryOperation, init, numbers);
    }

    public static double reduceIf(Predicate predicate, BinaryOperation binaryOperation, double init,
            double... numbers) {
        double result = init;
        for (double number : numbers) { // Licskov's Substitution Principle = LSP
            if (predicate.apply(number))
                result = binaryOperation.apply(result, number);
        }
        return result;
    }
}