import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of visits:");

        int n = sc.nextInt();

        int[] ranks = new int[n];

        System.out.println("Enter the ranks:");

        for(int i = 0; i < n; i++) {
            ranks[i] = sc.nextInt();
        }

        int count = 0;

        int minRank = ranks[0];

        for(int i = 1; i < n; i++) {

            if(ranks[i] < minRank) {

                count++;

                minRank = ranks[i];
            }
        }

        System.out.println("Number of ranks cut in the list: " + count);
    }
}
