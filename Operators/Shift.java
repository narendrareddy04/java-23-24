package Operators;

public class Shift {
    public static void main(String[] args) {
        int num = 5;
        int result = num << 2;
        System.out.println("Left shifted result: " + result);
        num = 20;
        result = num >> 2;
        System.out.println("Right shifted result: " + result);
    }
}