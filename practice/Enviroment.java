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
        {
            int z = 3; // {(z, 3)}+ r'
            y = 4; // r'' = {(z,3),(y,4)} + r'
            y = x; // 4
            // {y = 4}r''
        }
    }
}
