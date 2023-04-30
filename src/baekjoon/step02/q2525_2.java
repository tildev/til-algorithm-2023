package baekjoon.step02;

import java.io.*;
import java.time.LocalTime;
import java.util.StringTokenizer;

/**
 * LocalTime 을 사용
 * 
 * @author : tildev
 * @date : 2023-04-30
 */
public class q2525_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String now = br.readLine();
        long time = Long.parseLong(br.readLine());

        StringTokenizer st = new StringTokenizer(now, " ");
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        LocalTime localTime = LocalTime.of(hour, min);
        localTime = localTime.plusMinutes(time);

        bw.write(String.valueOf(localTime.getHour()));
        bw.write(" ");
        bw.write(String.valueOf(localTime.getMinute()));
        bw.flush();
        bw.close();
    }
}
