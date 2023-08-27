public class ex1 {
    public static void main(String[] args) {
        int nums[] = new int[4];

/*      try {
            System.out.println("message1");
            nums[7] = 10; //тут перескочит на catch если тип ошибки соответствует
            System.out.println("message2");
        }catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("message3");
        }catch (ArithmeticException exception) {
            System.out.println("message4");
        }
        // блоков catch может быть несколько,
        System.out.println("message4");
 */
//        message1
//        message3
//        message4


/*        try {
            System.out.println("message1");
            nums[2] = 10;
            System.out.println("message2"); //закончит выполнение и в catch не пойдёт
        }catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("message3");
        }
        System.out.println("message4");

 */
//        message1
//        message2
//        message4

        try {
            System.out.println("message1");
            nums[7] = 10; //тут перескочит на catch если тип ошибки соответствует
            System.out.println("message2");
        }
//        catch (ArrayIndexOutOfBoundsException exception) {
//            System.out.println("message3");
//        }
        catch (Exception exception) {
            System.out.println("superMessage");
        }
        System.out.println("message5");

        // Exception - родительский класс


    }



}
