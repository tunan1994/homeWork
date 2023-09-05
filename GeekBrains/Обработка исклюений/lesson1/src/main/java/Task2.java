public class Task2 {

    /**
     * @apiNote заменить try/catch ArithmeticException на if
     */
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int d = 0;
        if (d != 0) {
            System.out.println("catchedRes = " + intArray[8] / d);
        } else {
            System.out.println("ошибка деления на 0");
        }
    }
}