package animals;

class Typing {
    public static void canYouFly( Animal x ) {
        System.out.println( x.type() + (x.canYouFly()? "는(은) 날 수 있어.": "는(은) 못날아.") );
    }
    public static void canYouSwiming( Animal x ) {
        System.out.println( x.type() + (x.canYouSwiming()? "는(은) 수영 할 수 있어.": "는(은) 수영 못 해.") );
    }

    //abstract -> 기능을 그대로 가져오는거 -> 합성(코드 재사용)-> asbtract barrier -> 비둘기(하얀 비둘그, 검정 비둘기)
    //interface -> 클래스를 정의하는거 -> 필수적인 개념 -> 새
}