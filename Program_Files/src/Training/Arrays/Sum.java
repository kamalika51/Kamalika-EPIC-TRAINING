package Training.Arrays;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int sum = 0;

        int size = in.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println(sum);

    }
}