public class Q15_NestedTryCatchPropagation {
    static void methodB(String s) {
        try {
            int x = Integer.parseInt(s); // may throw NumberFormatException
            System.out.println("Parsed: " + x);
            // artificially cause NPE if s is "null"
            if("null".equals(s)) {
                String t = null;
                System.out.println(t.length()); // NullPointerException propagates
            }
        } catch (NumberFormatException e) {
            System.out.println("methodB caught NumberFormatException: " + e.getMessage());
        }
    }

    static void methodA(String s) {
        try {
            methodB(s);
        } catch (NullPointerException e) {
            System.out.println("methodA caught propagated NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        methodA("123");
        methodA("abc");
        methodA("null");
    }
}
