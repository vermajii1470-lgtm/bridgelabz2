import java.util.Scanner;

public class UppercaseConversion {
    public static String toUpperCaseCustom(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') c = (char)(c - 32);
            result += c;
        }
        return result;
    }
    public static boolean customCompare(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String c1 = toUpperCaseCustom(text);
        String c2 = text.toUpperCase();
        System.out.println(customCompare(c1, c2));
        sc.close();
    }
}