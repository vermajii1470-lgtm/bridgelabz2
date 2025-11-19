public class Q2_IsOdd {

    public static int isOdd(int n) {
        if (n % 2 != 0) {
            return 2;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isOdd(7));
        System.out.println(isOdd(10));
        System.out.println(isOdd(0));
    }
}