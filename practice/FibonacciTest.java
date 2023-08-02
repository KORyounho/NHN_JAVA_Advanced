package practice;

import static practice.Mathx.*; //static import

public class FibonacciTest {
    
    public static void baseCase() {
        if (fibonacci(0) == 0 && fibonacci(1) == 1) {
            return;
        }
        System.out.println("base fail");
        System.exit(1); // exit의 매개변수마다 프로그램을 종료하는 이유는 다 다르지만 모르니까 그냥 1 넣어서 꺼버림.
    }

    public static void recursionCase() {
        
        int[][] answers1 = { { 5, 5 }, { 6, 8 }, { 9, 34 }, { 14, 377 }, { 18, 2584 } };
        for (int[] answer : answers1) {
            if (answer[1] != fibonacci(answer[0])){
                System.out.println("recursion fail");
                System.exit(1);
            }
        }
        return;
        // int[] answers = { 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987 };
        // for(int index = 0; index < answers.length; index++){
        // if(fibonacci(index+2) != answers[index])
        // System.exit(1);
        // }
        // return;
    }

    public static void freeCondition() {
        try{
            fibonacci(-1);
        }
        catch (IllegalArgumentException e){
            return;
        }
        System.exit(1);
    }

    public static void postCondition() {
        try{
            for(int i = 0; i<100; i++){
                fibonacci(i); // 시간이 오래걸림 메모리가 상당히 많아져서 이럴때 필요한게 "메모이제이션"
            }
        }catch(ArithmeticException e){
            return;
        }
        catch(StackOverflowError s){
            System.out.println("fibonacci: n is too big!");
            return;
        }
        System.exit(1);
    }
}
