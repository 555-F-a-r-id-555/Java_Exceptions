package Lesson1_DZ;

import java.util.Arrays;

class Answer4 {
    public int[] divArrays(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return new int[1]; // нулевой массив длины 1 будет означать различие в длине массивов
        } else {
            int[] c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                if (b[i] == 0) throw new RuntimeException("Division by 0");
                else c[i] = a[i] / b[i];
            }
            return c;
        }
    }
}

public class Lesson1_DZ3v2 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
//            a = new int[]{12, 8, 16};
//            b = new int[]{4, 2, 4};
//            a = new int[]{12, 8, 16, 25};
//            b = new int[]{4, 2, 4};
            a = new int[]{12, 8, 16, 25};
            b = new int[]{4, 0, 4, 25};

        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer4 ans = new Answer4();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}
