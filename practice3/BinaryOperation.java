package practice3;

import javax.lang.model.element.Element;

@FunctionalInterface
public interface BinaryOperation<T> extends Num  {
    public <T> T apply(T x, T y);
}
