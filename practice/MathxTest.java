package practice;

public class MathxTest {

    private MathxTest() {// 기본 생성자(defalut constructur) ==> "이 조건에 맞는 타입(물체)을 새로 생성"
        // 해당 조건을 요기 안에다가 넣음.
    } // private는 함부로 메인에서 생성할 수 없도록 막음.
      // 생성자를 만드는 단축어 ctor

    public static void fibonacciTest() {
        FibonacciTest.baseCase(); // 종료조건
        FibonacciTest.recursionCase(); // 시작조건
        FibonacciTest.freeCondition(); // require 요구사항.(Design-By-Construction) // 필요조건(input 값 // 매개변수가 옳바른 매개변수 형식인지)
        FibonacciTest.postCondition(); // satisfy 요구사항의 충족사항.(코드가 잘 작성되어져 있는지) // 충분조건(return값)
        //
    }

    public static void main(String[] args) {
        // MathxTest o = new MathxTest(); //private때문에 안됨 MathxTest에서만 생성이 가능하고, 다른
        // 클래스에서는 선언 자체 불가.
        //MathxTest.fibonacciTest();
        //MathxTest.factorialTest();
        //System.out.println(Mathx.factorial(5));
        System.out.println(Mathx.fibonacci(40));
        
    }

    private static void factorialTest() {
        //System.out.println(Mathx.factorial(5));
        FactorialTest.baseCase();
        FactorialTest.recursionCase();
        FactorialTest.preCondition();
        FactorialTest.postCondition();
    }
}
