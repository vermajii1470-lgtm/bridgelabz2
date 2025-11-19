public class Q9_CountEvenOrOdd {

    public static int countEvenOrOdd(int a, int b, int c, int d, int e, String type) {
        int count = 0;

        if (type.compareTo("even") == 0) {
            if (a % 2 == 0) count++;
            if (b % 2 == 0) count++;
            if (c % 2 == 0) count++;
            if (d % 2 == 0) count++;
            if (e % 2 == 0) count++;
        }
        else if (type.compareTo("odd") == 0) {
            if (a % 2 != 0) count++;
            if (b % 2 != 0) count++;
            if (c % 2 != 0) count++;
            if (d % 2 != 0) count++;
            if (e % 2 != 0) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countEvenOrOdd(12, 17, 19, 14, 15, "odd"));
        System.out.println(countEvenOrOdd(12, 17, 19, 14, 15, "even"));
    }
}