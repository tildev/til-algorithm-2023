package baekjoon.step03;

import java.util.Scanner;

/**
 * @author : tildev
 * @date : 2023-04-30
 */
public class q10951_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int a = s.nextInt();
            int b = s.nextInt();

            System.out.println(a + b);
        }
    }
}
