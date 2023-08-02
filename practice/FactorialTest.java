package practice;

public class FactorialTest {
    // basecase
    // recursioncase
    // preCondition
    // postCondition

    public static void baseCase() {
        if (Mathx.factorial(0) != 1) {
            System.exit(1);
        }
        return;
        // 이렇게 쓸 수 있음. assert Mathx.factorial(n) == 1;
        // 다음 수식이 false면, assertions error를 return 한다.
    }

    public static void recursionCase() {
        // int []answers = {2, 6, 24, 120, 720, 5040};
        // for(int n = 0; n<answers.length; n++){
        // if(Mathx.factorial(n+2) != answers[n]){
        // System.exit(1);
        // }
        // }
        // return;
        int[][] answers = { { 1, 1 }, { 2, 2 }, { 3, 6 }, { 4, 24 }, { 5, 120 } };
        for (int[] answer : answers) {
            if (Mathx.factorial(answer[0]) != answer[1]) {
                System.exit(1);
            }
        }
        return;
    }

    public static void preCondition() {
        try {
            Mathx.factorial(-1);
        } catch (IllegalArgumentException e) {
            return;
        }
        System.out.println("pre fail");
        System.exit(1);
    }

    public static void postCondition() {
        try {
            Mathx.factorial(Integer.MAX_VALUE-1);
        } catch (ArithmeticException e) {
            System.out.println("Factorial Out Of Int Range");
            return;
        } catch (StackOverflowError e) {
            System.out.println("Factorial Was BufferedOverFlow");
            return;
        } catch(NegativeArraySizeException e){
            System.out.println("Most large number is MAX_VALUE-1, But This Number Is MAX_VALUE");
            return;
        }
        System.out.println("post fail");
        System.exit(1);
    }
}
