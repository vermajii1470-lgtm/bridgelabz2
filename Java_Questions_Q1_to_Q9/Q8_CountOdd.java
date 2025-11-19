public class Q8_CountOdd {

    public static int countOdd(int a, int b, int c, int d, int e) {
        int count = 0;

        if (a % 2 != 0) count++;
        if (b % 2 != 0) count++;
        if (c % 2 != 0) count++;
        if (d % 2 != 0) count++;
        if (e % 2 != 0) count++;

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOdd(12, 17, 19, 14, 15));
        System.out.println(countOdd(15, 0, -12, 19, 28));
    }
}