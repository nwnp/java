public class ArrayTest {
    public static void main(String[] args) {
        float[] a = {10.0f, 15.5f, 21.0f, 26.5f, 32.0f};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        float sum = a[0] + a[3];
        System.out.println("result: " + sum);

        char[] b = {'A', 'P', 'P', 'L', 'E'};
        for (int i = 0; i < b.length; i++) {
            b[i] = (char) ((int) b[i] + 32);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
    }
}
