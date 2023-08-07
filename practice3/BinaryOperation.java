package practice3;

import javax.lang.model.element.Element;

@FunctionalInterface
public interface BinaryOperation<T>{
    public <T> T apply(T x, T y);
}
