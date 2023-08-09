package subtyping;

interface Flyable{
}
interface Swimable{
}
final class 비행기 implements Flyable{
}
class flyableBat extends 박쥐 implements Flyable{

}
final class 헤엄치고나르는펭귄 extends 펭귄 implements Swimable, Flyable{

}

//interface 동물 {
//    private boolean flyable; // 상태를 나타내는 코드 -> 이걸 사용하려면 class로 구현해야함. -> abstract class 동물
//    public default String type() {
//        return Typing.type(this);
//    }
//
//    public default boolean 날수있니() { // 상태를 변경하는 코드
//        return flyable;
//    }
//}
abstract class 동물 {
    private boolean flyable; // 상태를 나타내는 코드 -> 이걸 사용하려면 class로 구현해야함. -> abstract class 동물
    동물(boolean flyable){
        this.flyable = flyable;
    }
    public  String type() {
        return Typing.type(this);
    }

    public  boolean 날수있니() { // 상태를 변경하는 코드
        return flyable;
    }
}


abstract class 새 extends 동물{

    public 새(boolean flyable){
        super(flyable=true);
    }
}

class 박쥐 extends 동물{
    박쥐(){
        super(true);
    }

}
class 참새 extends 새{

    public 참새(boolean flyable) {
        super(flyable);
    }
}
class 펭귄 extends 새 {
    펭귄(){
        super(false);
    }
}


public class Typing {
//    public static void 날수있니( 동물 x ) {
//        RTTI (runtime type identification)으로 고치기
//        if( x instanceof 박쥐)
//            System.out.println("박쥐는(은) 날 수 있어.");
//        else if(x instanceof 펭귄)
//            System.out.println("펭귄는(은) 날 수 없어.");
//        else if(x instanceof 참새)
//            System.out.println("참새는(은) 날 수 있어.");
//        else
//            throw new RuntimeException("해당 내용 없음");
//    }
    public static String type(Object thing){
        return thing.getClass().getSimpleName();
    }
    public static void 날수있니(동물 x){
        System.out.println(Typing.type(x) + (x.날수있니() ? "는(은) 날 수 있어." : "는(은) 날 수 없어."));
    }
    public static void 날수있니(Flyable thing){
        System.out.println(Typing.type(thing) + "는(은) 날 수 있어.");
    }
    public static void main(String[] args) {
        Flyable[] 날것들 = {
                new 비행기()
        };

        Swimable s = new 헤엄치고나르는펭귄();

        for(Flyable 날것 : 날것들){
            Typing.날수있니(날것); // dynamic method binding on actual type -> dynamic dispatch
        }
    }
}
