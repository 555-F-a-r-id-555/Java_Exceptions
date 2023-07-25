package Lesson2_DZ;

public class Test01 {
    public static void main(String[] args) {
        float d = 0;
        float b = 0;
        System.out.println("1/0 = " + 1 / d); // 1/0 = Infinity
        System.out.println("Infinity - Infinity : " + (1 / b - 1 / d)); // Infinity - Infinity : NaN
        System.out.println("Infinity / Infinity : " + (1 / b) / (1 / d)); // Infinity / Infinity : NaN
        System.out.println("Infinity * Infinity : " + (1 / b) * (1 / d)); // Infinity * Infinity : NaN
        float c = 1.9f;
        Object infinity = c / 0;
        Object infinity2 = 1 / d;
        System.out.println(infinity != infinity2); // true
    }
}
