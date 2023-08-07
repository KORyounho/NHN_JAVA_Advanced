//package practice3;
//
//import java.util.Objects;
//
//// How to design type
//// 1. primitive operation to define a (data) type(set)  -> abstraction data type, where primitives = abstraction barrier
//// 2. combination (combination operation) e.g) add, multiply...
//public class Fractional extends Number{
//    private long numerator;
//    private long denominator;
//    //private int [] rep;
//    private void normalize() {
//        long gcd = MathxBas.gcd(this.numerator, this.denominator);
//        this.numerator = this.numerator / gcd;
//        this.denominator = this.denominator / gcd;
//    }
//
//    public Fractional(long numerator, long denominator) {  //생성자    이친구는 선언을 안해도 불려와야하기에 static으로 남아있어야한다.
//        if (denominator == 0) {
//            throw new IllegalArgumentException("분자가 0이야 다시 공부해");
//        }
//
//
//        //this.rep = new int[] {numerator, denominator};
//        this.numerator = numerator;
//        this.denominator = denominator;
//        normalize();
//        //RangeTest.classInvariant(); 구현하기 과제
//
//    }
//    //-> Fractional.fractional 에서 fractional 메서드를 Fractional로 바꾸면?
//    // Fractional.Fractional // return타입은 크기 2개의 배열
//    // 결국 Fractional.Fractional을 간소화시켜 Fractional 로 호출 시키는 것이 같은 결과를 내놓음.
//
//    //f(a, b, c) -> a.f(b, c)
//    public long getNumerator() { // 게터  배열을 받아서 분자를 내보냄
//        //return rep[0];
//        return this.numerator;
//    }
//
//    public long getDenominator() { // 게터  배열을 받아서 분모를 내보냄
//        //return rep[1];
//        return this.denominator;
//    }
//
//    public Fractional add(Fractional r) {
//        return new Fractional(this.getNumerator() * r.getDenominator() + r.getNumerator() * this.getDenominator(),
//                this.getNumerator() * r.getDenominator());
//    }
//
//    @Override
//    public String toString() {
//        return "" + this.getNumerator() + "/" + this.getDenominator();
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Fractional that = (Fractional) o;
//        return numerator == that.numerator && denominator == that.denominator;
//    }
//
////    @Override
////    public int hashCode() {  //무슨 개소리야 씨발 ㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗ
////        final int prime =  31;
////        int result = 1;
////        result = prime * result + this.getNumerator();
////        result = prime * result + this.getDenominator();
////        return result;
////        //return Objects.hash(numerator, denominator);
////    }
//
//    public boolean equals(Fractional that) {
//        if (this == that)
//            return true;
//        if (that == null)
//            return false;
//        return this.getNumerator() == that.getNumerator() && this.getDenominator() == that.getDenominator();
//    }
//
//    @Override
//    public int intValue() {
//        return (int) this.intValue();
//    }
//
//    @Override
//    public long longValue() {
//        return (long) this.longValue();
//
//    }
//
//    @Override
//    public float floatValue() {
//        return (float) this.doubleValue();
//
//    }
//
//    @Override
//    public double doubleValue() {
//        return (double) this.getNumerator()/ (double) this.getDenominator();
//    }
//}
