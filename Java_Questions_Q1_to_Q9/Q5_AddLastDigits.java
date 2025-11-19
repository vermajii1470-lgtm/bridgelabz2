public class Q5_AddLastDigits {

    public static int addLastDigits(int input1, int input2) {
        int d1 = Math.abs(input1 % 10);
        int d2 = Math.abs(input2 % 10);
        return d1 + d2;
    }

    public static void main(String[] args) {
        System.out.println(addLastDigits(267, 154));
        System.out.println(addLastDigits(267, -154));
        System.out.println(addLastDigits(-267, -154));
    }
}