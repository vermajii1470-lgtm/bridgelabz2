import java.util.Scanner;

public class Problem1_PrimitiveToWrapper {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int primitiveInt = Sc.nextInt();

        Integer wrapperInt = Integer.valueOf(primitiveInt);

        System.out.println("Primitive value: " + primitiveInt);
        System.out.println("Wrapper object value: " + wrapperInt);

        Sc.close();
    }
}
