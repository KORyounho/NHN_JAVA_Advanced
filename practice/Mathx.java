package practice;

public class Mathx {
    private Mathx() {

    }
    public static int fibonacchi(int n){
        if(n==1)
            return 1;
        else if(n==0)
            return 0;
        return fibonacchi(n-1) + fibonacchi(n-2);
    }
}
