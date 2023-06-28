public class MethodMakeTest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(add(3, 4));
        System.out.println(add2(a));
    }

    // Call by Value
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Call by Reference
    public static int add2(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }
}
