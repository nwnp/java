public class MethodOverloading {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        float c = 4.9f;
        float d = 43.43f;

        System.out.println(add(a, b));
        System.out.println(add(c, d));
        System.out.println(add(a, b, a));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
