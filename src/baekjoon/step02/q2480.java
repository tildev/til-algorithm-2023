package baekjoon.step02;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @date : 2023-04-30
 */
public class q2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input, " ");

        int dupNum = 0, result;
        int numArr[] = new int[3];
        int dupCnt = 1;

        for (int i = 0; i < 3; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numArr);

        for (int i = 0; i < 2; i++) {
            if (numArr[i] == numArr[i + 1]) {
                dupCnt++;
                dupNum = numArr[i];
            }
        }
        if (dupCnt == 3) {
            result = 10000 + dupNum * 1000;
        } else if (dupCnt == 2) {
            result = 1000 + dupNum * 100;
        } else {
            result = numArr[2] * 100;
        }

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
    }
}
