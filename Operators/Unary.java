package Operators;

public class Unary {
    public static void main(String[] args) {
        int a = 3;
        int b = a++;
        int c = 7;
        int d = ++c;
        int e = 4;
        int f = e--;
        int g = 8;
        int h = --g;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}