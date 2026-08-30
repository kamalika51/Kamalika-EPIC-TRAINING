package Training.Patterns;

import java.util.Scanner;

public class LeaderBoard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] ranker = new int[n];

        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {

            int temp = sc.nextInt();

            if (uniqueCount == 0 || temp != ranker[uniqueCount - 1]) {
                ranker[uniqueCount] = temp;
                uniqueCount++;
            }
        }

        
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(ranker[i]);
        }

        int m = sc.nextInt();

        int[] player = new int[m];
        for (int i = 0; i < m; i++) {
            player[i] = sc.nextInt();
        }

        sc.close();
    }
}