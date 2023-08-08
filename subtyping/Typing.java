package subtyping;

abstract class 동물{
    public final String type(){
        return this.getClass().getSimpleName();
    }
    public void 날수있니(){
            System.out.println(this.type() + "는(은) 날 수 없어.");
    }
    //public abstract void 헤엄치니();
}
class 새 extends 동물{
    @Override
    public void 날수있니(){
        System.out.println(this.type() + "는(은) 날 수 있어.");
    }
}
class 박쥐 extends 동물{
    @Override
    public void 날수있니() {
        System.out.println(this.type() + "는(은) 날 수 있어.");
    }
}
class 참새 extends 새{
}
class 펭귄 extends 새{
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

    public static void main(String[] args) {
        동물[] 동물들 = {new 박쥐(),
            new 참새(),
            new 펭귄(),
        };

        for(동물 한마리 : 동물들){
            한마리.날수있니(); // dynamic method binding on actual type -> dynamic dispatch
        }
    }
}
