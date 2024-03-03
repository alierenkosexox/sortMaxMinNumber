
// Ali Eren KÖSE 04/03/2024 02:43

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int numberPoint;

        int closestMin = Integer.MIN_VALUE;
        int closestMax = Integer.MAX_VALUE;

        System.out.print("Sayı giriniz : ");
        numberPoint = input.nextInt();

        for (int i : list) {
            if (i < numberPoint && i > closestMin) {
                closestMin = i;
            }
            if (i > numberPoint && i < closestMax) {
                closestMax = i;
            }
        }
        System.out.println("Girilen sayıya küçük en yakın sayı : " + closestMin);
        System.out.println("Girilen sayıya büyük en yakın sayı : " + closestMax);

    }
}