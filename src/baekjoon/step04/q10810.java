package baekjoon.step04;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @date : 2023-04-30
 */
public class q10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] basketArr = new int[n];

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int a = i; a <= j; a++) {
                basketArr[a - 1] = k;
            }
        }
        for (int basketNum : basketArr) {
            bw.write(basketNum + " ");
        }
        bw.flush();
        bw.close();
    }
}
