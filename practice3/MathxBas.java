package practice3;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class MathxBas {

    static <T> T reduce(BinaryOperator<T> binaryOperation, T init, T... numbers) {
        return reduceIf(x->true, binaryOperation, init, numbers);
    }


    public static <T> T reduceIf(
            Predicate<T> predicate,
            BinaryOperator<T> binaryOperator,
            T init,
            T... numbers) {
        T result = init;
        for (T number : numbers) { // Licskov's Substitution Principle = LSP
            if (predicate.test(number)) {
                result = binaryOperator.apply(result, number);
            }
        }
        return result;

    }

    public static int sum(int n) {
        return n * (n + 1) / 2;
    }

    public static int sum(Range range) {
        return sum(range.getUpperBound()) - sum(range.getLowerBound() - 1);
    }

    public static long gcd(long a, long b){
        long n;
        while(b!=0){
            n = a%b;
            a = b;
            b = n;
        }
        return a;
    }

    // static double sum(double... numbers) {
    // return reduce(new Plus(), 0, numbers);
    // }

    // static double mul(double... numbers) {
    // return reduce(new Multiply(), 1, numbers);
    // }
}

// return reduceIf(x->true , binaryOperation, init, numbers);