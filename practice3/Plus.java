package practice3;

public class Plus implements BinaryOperation<Fractional> {
    public Fractional apply(Fractional x, Fractional y){
        return x.add(y);
    }

    @Override
    public <T> T apply(T x, T y) {
        return x.add(y);
    }
}
