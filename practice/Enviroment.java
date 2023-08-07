package practice;

public class Enviroment {
    public static void main(String[] args) {
        int x = 4; // {(x, 4});
        int y = 5; // {(x, 4), (y, 5)} = r
        y = y+x; // {y+x}{(x, 4), (y, 5)}
        //{5+x}r
        //{5+4}r
        //9r - closure, reduction (evaluation) --> {y = 9}r
        //r' = {(x,4),(y,9)}
        {
            int z = 3; // {(z, 3)}+ r'
            y = 4; // r'' = {(z,3),(y,4)} + r'
            y = x; // 4
            // {y = 4}r''
            //evaluate(c, r) = (c', r')
            //인터프리터 언어 -> 실시간으로 코드 내용을 업데이트
            //컴파일러 언어 -> 모든것을 연산 후 기계어로 되어져있는 코드를 보여줌
        }
    }
}