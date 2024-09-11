import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] a = new int[]{1, 2, 3};
        double[] b = {1.57, 7.654, 9.986};
        int[] c = {2, 4, 6};

        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.println(a[i]);
                break;
            }
            System.out.print(a[i] + ", ");
        }

        for (int i = 0; i < b.length; i++) {
            if (i == b.length - 1) {
                System.out.println(b[i]);
                break;
            }
            System.out.print(b[i] + ", ");
        }

        for (int i = 0; i < c.length; i++) {
            if (i == c.length - 1) {
                System.out.println(c[i]);
                break;
            }
            System.out.print(c[i] + ", ");
        }

        for (int i = a.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(a[i]);
                break;
            }
            System.out.print(a[i] + ", ");
        }

        for (int i = b.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(b[i]);
                break;
            }
            System.out.print(b[i] + ", ");
        }

        for (int i = c.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(c[i]);
                break;
            }
            System.out.print(c[i] + ", ");
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1){
                a[i] += 1;
            }
        }
        System.out.print(Arrays.toString(a));
    }
}
