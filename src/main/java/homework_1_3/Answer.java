package homework_1_3;

class Answer {
    public int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int[] c = new int[1];
        if (a.length == b.length) {
            c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                try {
                    c[i] = a[i] / b[i];
                }catch (ArithmeticException e){
                    System.out.println("Div by zero in " + i);
                }
            }
        }
        else c[0] = 0;
        return c;
    }
}