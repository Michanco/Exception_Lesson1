public class ex3 {
    public static void main(String[] args) {
        // Node node = new node(); создание объекта синтаксис
        // ArithmeticException exception = ew ArithmeticException();

        try{
            System.out.println("message1");
            throw new ArithmeticException("MESSAGE"); // принудительный переход в catch
            //System.out.println("message2");
        }catch (ArithmeticException exception){
            System.out.println("message3");
            System.out.println(exception);
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
        System.out.println("message4");
    }
}
