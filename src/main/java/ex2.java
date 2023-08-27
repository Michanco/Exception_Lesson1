public class ex2 {
    public static void main(String[] args) {
        int num[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int num2[] = {2, 0, 4, 4, 0, 8};
        int j = 1;
        for (int i = 0; i < num.length; i++) {
            try{
                System.out.println(num[i] + "/" +
                        num2[i] + "=" +
                        num[i] / num2[i]);
            }catch (ArithmeticException exception){
                System.out.println("Division by 0!!!!" + j);
                j ++;
            }catch (ArrayIndexOutOfBoundsException exception){
                System.out.println(" ERROR array length");
            }
        }
    }
}
