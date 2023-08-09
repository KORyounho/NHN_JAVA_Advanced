package practice3;

import java.util.Iterator;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class MathxBas {

    static <T> T reduce(BinaryOperator<T> binaryOperation, T init, Iterator<T> iterator) {
        return reduceIf(x->true, binaryOperation, init, numbers);
    }

    static  <T> T sum(T... numbers) {
        return reduce(new Plus(), 0, numbers);
    }

    static <T> T mul(T... numbers) {
        return reduce(new Multiply(), 1, numbers);
    }


    public static <T> T reduceIf(
            Predicate<T> predicate,
            BinaryOperator<T> binaryOperator,
            T init,
            T... numbers) {
        T result = init;
        //for (T number : numbers) { // Licskov's Substitution Principle = LSP -> T의 타입이나 서브타입만 가능함.
        //if (predicate.test(number)) {
            //result = binaryOperator.apply(result, number);
        //}

        for(int index = 0; index <numbers.length; index++) { // 이런식으로 작성되면, 배열을 제외한 다른것들은 들어올 수 없음.)
            if (predicate.test(numbers[index])) {
                result = binaryOperator.apply(result, numbers[index]);
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

}

// return reduceIf(x->true , binaryOperation, init, numbers);