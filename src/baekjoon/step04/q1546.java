package baekjoon.step04;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @date : 2023-04-30
 */
public class q1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double max = 0;
        double[] grade = new double[n];
        for (int i = 0; i < n; i++) {
            grade[i] = Double.parseDouble(st.nextToken());
            if (max < grade[i]) {
                max = grade[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (grade[i] / max * 100);
        }

        bw.write(String.valueOf(sum / n));

        br.readLine();

        bw.flush();
        bw.close();
    }
}
