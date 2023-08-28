package homework_1_2;

import java.util.Arrays;

class Answer {
    public int[] subArrays(int[] a, int[] b) {
        // Введите свое решение ниже
        int[] c = new int[1];
        if (a.length == b.length) {
            c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] - b[i];
            }
        }
        else c[0] = 0;
        return c;
    }
}
