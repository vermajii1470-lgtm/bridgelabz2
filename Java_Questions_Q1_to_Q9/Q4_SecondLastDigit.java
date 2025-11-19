public class Q4_SecondLastDigit {

    public static int secondLastDigit(int n) {
        if (n >= -9 && n <= 9) {
            return -1;
        }
        int second = Math.abs((n / 10) % 10);
        return second;
    }

    public static void main(String[] args) {
        System.out.println(secondLastDigit(197));
        System.out.println(secondLastDigit(-197));
        System.out.println(secondLastDigit(7));
    }
}