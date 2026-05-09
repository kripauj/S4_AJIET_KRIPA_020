import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int j = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();

        if (n <= 0 || k <= 0 || j <= 0 || m < 0 || p < 0) {
            System.out.println("INVALID INPUT");
            return;
        }

        int bananaMonkeys = m / k;
        int peanutMonkeys = p / j;

        int bananaRem = m % k;
        int peanutRem = p % j;

        int monkeysDown = bananaMonkeys + peanutMonkeys;

        // One extra monkey for leftovers
        if (bananaRem > 0 || peanutRem > 0) {
            monkeysDown++;
        }

        int monkeysLeft = n - monkeysDown;

        if (monkeysLeft < 0) {
            monkeysLeft = 0;
        }

        System.out.println("Number of Monkeys left on the Tree:" + monkeysLeft);
    }
}
