public class Q6_ExactMultiple {

    public static int isExactMultiple(int number1, int number2) {

        if (number1 == 0 || number2 == 0) {
            return 3;
        }

        if (number1 % number2 == 0) {
            return 2;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isExactMultiple(10, 5));
        System.out.println(isExactMultiple(10, 3));
        System.out.println(isExactMultiple(0, 5));
    }
}