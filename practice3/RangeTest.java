package practice3;

public class RangeTest {

    public static void classInvariant() {

        int lowerbound = -2;
        int upperbound = -6;

        Range range = null;
        try {
            range = new Range(lowerbound, upperbound);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void lowerBound() {
        assert true;
    }

    public void upperBound() {
        assert true;
    }
}