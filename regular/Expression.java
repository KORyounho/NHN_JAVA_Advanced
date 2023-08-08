package regular;

public interface Expression { //subtyping
    public static final Epsilon EPSILON = Epsilon.value; // Epsilon은 상수. (공집합을 나타내기 위한 것)

    public default Expression or(Expression expression){
        return new Or(this, expression);
    }

    public default Expression then(Expression expression){
        return new Then(this, expression);
    }

    public default Expression star(){
        return new Star(this);
    }

//    public static Expression save(){
//        return new Config();
//    }

    //  public class Epsilon{
    //      public Epsilon(){}  -> 원래는 이게 맞아야 하지만, 공집합을 의미하기에 인터페이스 안에 상수값으로 정의해버림.
    //      private Epsilon(){} 이런식으로 만들면 공집합이 기본적으로 1개가 생성이 되야하는데 생성 할 방법ㅂ이 없음.

    // 이런식으로 해도 됨.
    /*
    public class Epsilon{   -> 이럴 경우, 메인함수에서 Epsilon.value로 값을 꺼내야 함.
        public final static Epsilon value = new Epsilon();
        private Epsilon(){}; // protected도 가능
    }
     */

}
