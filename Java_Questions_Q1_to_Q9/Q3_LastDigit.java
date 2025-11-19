public class Q3_LastDigit {

    public static int lastDigit(int n) {
        int digit = Math.abs(n % 10);
        return digit;
    }

    public static void main(String[] args) {
        System.out.println(lastDigit(197));
        System.out.println(lastDigit(-197));
        System.out.println(lastDigit(0));
    }
}