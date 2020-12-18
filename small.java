import java.util.*;

public class small {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        while (a < 100) {
            System.out.println("number must be greater than 0, re-enter the number");
            a = sc.nextInt();
            if (a >= 100) {
                break;
            }

        }

        sc.close();
        smallest(a);

    }

    static void smallest(int n) {

        String[] s = Integer.toString(n).split("");
        int[] a = new int[s.length];
        // String c=new String[s.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(s[i]);

        }

        Arrays.sort(a);
        System.out.print(a[0] + "" + a[1]);

    }
}
