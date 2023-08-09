package practice3;

import practice.FactorialTest;

public class FractionalTest {
    private FractionalTest(){}
    //basecondition

    public static void main(String[] args) {
        Fractional[] rs = {new Fractional(1, 2),
                new Fractional(2, 4),
                new Fractional(4, 8),
                new Fractional(5, 10)};
        for(Fractional r : rs) {
            System.out.println(r);
        }
        Fractional r = rs[0];
        Object e = rs[1];
        r.equals(e);
        //System.out.println(toString(add(fractional(1, 2), fractional(4, 8))));
        //FractionalTest.add(add(x, add(x, y), add(y, z)));
        //System.out.println(x == y);
        //System.out.println(add(x,y) == add(z, w));

        for(Fractional a : rs){
            System.out.println(a);
        }
        System.out.println(MathxBas.<Fractional>reduceIf( x -> true, Fractional::add, rs[0], rs[1], rs[2], rs[3]));

        System.out.println(MathxBas.<String>reduceIf( x -> true, (x,y)-> x+y, "", "a", "b", "c"));
        System.out.println(MathxBas.<String>reduce((x,y)-> x+y, "", "a", "b", "c"));
    }
}