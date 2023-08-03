package practice3;

import practice.FactorialTest;

public class FractionalTest {
    private FractionalTest(){}
    public static int[] fractional(int numerator, int denomiator){  //생성자
        if(denomiator == 0){
            throw new IllegalArgumentException("분자가 0이야 다시 공부해");
        }
        int[] rep = new int[] { numerator, denomiator};
        return rep;
    }


    public static int numerator(int[] r){ // 게터  배열을 받아서 분자를 내보냄
        normalize(r);
        return r[0];
    }
    public static int denomiator(int[] r){ // 게터  배열을 받아서 분모를 내보냄
        normalize(r);
        return r[1];
    }
    public static void normalize(int[] r){
        int gcd = MathxBas.gcd(numerator(r), denomiator(r));
        r[0] /= gcd;
        r[1] /= gcd;
    }
    public static int[] add(int[] r1,int[] r2){
        return fractional(numerator(r1)*denomiator(r2)+numerator(r2)*denomiator(r1),
                denomiator(r1)*denomiator(r2));
    }
    public static String toString(int []r){
        return "" + numerator(r) + "/" + denomiator(r);
    }

    public boolean equals(int []x, int []y){
        return numerator(x) == numerator(y) && denomiator(x)==denomiator(y);
    }
    public static void main(String[] args) {
        int [][] rs = {fractional(1, 2),
                fractional(2, 4),
                fractional(4, 8),
                fractional(5, 10)};
        for(int[] r : rs) {
            System.out.println(toString(r));
        }
        //System.out.println(toString(add(fractional(1, 2), fractional(4, 8))));
        //FractionalTest.add(add(x, add(x, y), add(y, z)));
        //System.out.println(x == y);
        //System.out.println(add(x,y) == add(z, w));
    }
}