package Training.Arrays;

import java.util.Scanner;

public class Product {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int product = 1;

        int size = in.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }

        System.out.println(product);
    }
}