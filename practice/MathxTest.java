package practice;

public class MathxTest{
    
    private MathxTest(){// 기본 생성자(defalut constructur) ==> "이 조건에 맞는 타입(물체)을 새로 생성"
        //해당 조건을 요기 안에다가 넣음.
    }   //private는 함부로 메인에서 생성할 수 없도록 막음.
        //생성자를 만드는 단축어 ctor
    public static void main(String[] args) {
        // MathxTest o = new MathxTest(); //private때문에 안됨 MathxTest에서만 생성이 가능하고, 다른 클래스에서는 선언 자체 불가.
        System.out.println(Mathx.fibonacchi(7));
    }
}