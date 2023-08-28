package homework_1;

class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int nums[] = new int[4];
        nums[5] = 10;

    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 1;
        int b = 0;
        int c = a / b;

    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String a = "hello";
        int b = Integer.parseInt(a + 3);

    }
}

