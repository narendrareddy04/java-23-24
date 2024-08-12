package Operators;

public class Logical {
    public static void main(String[] args) {
        int x = 3, y = 7;
        int a = 4, b = 8;
        boolean result1 = x > y & a > b;
        boolean result2 = x < y | a > b;
        boolean result3 = x < y ^ a < b;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}