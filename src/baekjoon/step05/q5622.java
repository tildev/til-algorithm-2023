package baekjoon.step05;

import java.io.*;

/**
 * @author : tildev
 * @date : 2023-05-01
 */
public class q5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == 'A' || a == 'B' || a == 'C') {
                sum += 3;
            } else if (a == 'D' || a == 'E' || a == 'F') {
                sum += 4;
            } else if (a == 'G' || a == 'H' || a == 'I') {
                sum += 5;
            } else if (a == 'J' || a == 'K' || a == 'L') {
                sum += 6;
            } else if (a == 'M' || a == 'N' || a == 'O') {
                sum += 7;
            } else if (a == 'P' || a == 'Q' || a == 'R' || a == 'S') {
                sum += 8;
            } else if (a == 'T' || a == 'U' || a == 'V') {
                sum += 9;
            } else {
                sum += 10;
            }
        }
        bw.write(String.valueOf(sum));

        bw.flush();
        bw.close();
    }
}
