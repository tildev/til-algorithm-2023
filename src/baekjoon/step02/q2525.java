package baekjoon.step02;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @date : 2023-04-30
 */
public class q2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String now = br.readLine();
        int time = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(now, " ");
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        min += time;
        hour += (min / 60);
        min = min % 60;

        if (hour > 23) {
            hour -= 24;
        }

        bw.write(String.valueOf(hour));
        bw.write(" ");
        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }
}
