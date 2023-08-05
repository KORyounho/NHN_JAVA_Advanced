package practice3;

public class Multiply<T extends Fractional>{//} implements BinaryOperation{
    public <T> T apply(T x, T y){
        return x*y; // 지금 안되는 이유는, T로써 들어올 클래스가 x+y가 뭔지 모르기 때문임. -> 이래서 람다식을 쓰는거일 수도 일단은 모르니까 keep
    }
}