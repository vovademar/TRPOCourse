package src.main.java.v.medvedev;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * @param a - first param
     * @param b - second param
     * @param c - third param
     * @return sum of a, b, c
     */
    public int calculate(int a, int b, int c) {
        return a + b + c;
    }

    /**
     *
     * @param a - first param
     * @param b - second param
     * @return multiply of a, b
     */
    public int calculateMultiply(int a, int b) {
        return a * b;
    }

    /**
     *
     * @param a - param a
     * @param b - param b
     * @return div
     */
    public int calculateDivide(int a, int b) {
        return a / b;
    }

    /**
     *
     * @param str - str to concat to hello world
     * @return - string
     */
    public String printHelloWorld(String str){
        return "Hello World! " + str;
    }
}