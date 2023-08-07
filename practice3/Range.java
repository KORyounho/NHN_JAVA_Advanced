//package practice3;
//
//public final class Range {
//    private int upperBound;
//    private int lowerBound;
//
//    public Range(int lowerBound, int upperBound) {
//        this.upperBound = upperBound;
//        this.lowerBound = lowerBound;
//
//
//    }
//
//    public Range(int upperBound) {
//        this(0, upperBound);
//    }
//
//    private void classInvariant() {
//        if (this.lowerBound > this.upperBound)
//            throw new IllegalArgumentException(
//                    "Range: " + this.lowerBound + " > " + this.upperBound);
//    }
//
//    public int getUpperBound() {
//        return this.upperBound;
//    }
//
//    public int getLowerBound() {
//        return this.lowerBound;
//    }
//
//
//}