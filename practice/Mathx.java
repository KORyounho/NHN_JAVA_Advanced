package practice;

public class Mathx {
    public int [] temp;
    private Mathx() {

    }

    //precondition -> 함수를 실행 하기 이전에 제일 먼저 해야하는 검사
    // public static int fibonacci(int n) {
    //     if(n<0)
    //         throw new IllegalArgumentException("fibonacci: n<0");
    //     if (n == 1)
    //         return 1;
    //     else if (n == 0)
    //         return 0;
    //     // 계산이 끝나는 지점 (n==1), (n==0) --> basecase
    //     return Math.addExact(fibonacci(n - 1), fibonacci(n - 2));
    //     // 일반 식 recursioncase
    // }
    public static int fibonacci(int n){
        if(n<0){
            throw new IllegalArgumentException(); 
        }
        int first = 0;
        int second = 1;
        int result = 0;
        if(n==0){
            return first;
        }
        if(n==1){
            return second;
        }
        for(int i = 1; i<n; i++){
            result = first+second;

            first = second;
            second = result;
        }
        return result;
    }
    // 3-> 2 -> 1 -> 
    /*
     * 피보나치의 점화식 ->
     * F(1) = 1
     * F(0) = 0
     * if(n!=1 && n!=0) F(n) = F(n-1)+F(n-2)
     */
    
     public static int factorial(int n){
        if(n<0){
            throw new IllegalArgumentException("factorial: n<0");
        }
        if(n==0){
            return 1;
        }
        return Math.multiplyExact(n,factorial(n-1));
     }
}
