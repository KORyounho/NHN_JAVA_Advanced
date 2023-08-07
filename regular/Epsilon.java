package regular;

public class Epsilon implements Expression{
    public final static Epsilon value  = new Epsilon();

    @Override
    public String toString() {
        return "\u03B5";
    }

    private Epsilon(){};
//    private Epsilon(){}
//
//    public static synchronized Epsilon getInstance(){  //한번만 불러오고 계속 그 값을 사용함. -> ******싱글톤 패턴********* synchronized 사용 안하면, 멀티쓰레드로 문제 발생
//        if(instance == null){
//            instance = new Epsilon();
//        }
//        return instance;    //대체적으로 싱글톤 패턴을 사용하는 것들은 그냥 상수 하나 선언해서 끝내는게 제일 좋음.
//    }
}
