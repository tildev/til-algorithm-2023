package baekjoon.step04;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @date : 2023-04-30
 */
public class q10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] basketArr = new int[n];
        for (int i = 0; i < n; i++) {
            basketArr[i] = i + 1;
        }

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int temp;

            temp = basketArr[i-1];
            basketArr[i-1] = basketArr[j-1];
            basketArr[j-1] = temp;
        }
        for (int basketNum : basketArr) {
            bw.write(basketNum + " ");
        }
        bw.flush();
        bw.close();
    }
}
