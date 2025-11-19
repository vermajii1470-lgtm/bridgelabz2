public class Q1_IsEven {

    public static int isEven(int n) {
        if (n % 2 == 0) {
            return 2;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isEven(10)); 
        System.out.println(isEven(7));  
        System.out.println(isEven(0));  
    }
}