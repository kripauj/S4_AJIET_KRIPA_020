import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = 10; 
        int K = 5;  
        int candiesAvailable = N;

        int order = sc.nextInt();

        if(order > candiesAvailable || order <= 0) {
            System.out.println("INVALID INPUT");
        }
        else {

            candiesAvailable = candiesAvailable - order;

            System.out.println("Number of Candies Sold: " + order);

            if(candiesAvailable <= K) {
                candiesAvailable = N;
            }

            System.out.println("Number of Candies available: " + candiesAvailable);
        }
    }
}
