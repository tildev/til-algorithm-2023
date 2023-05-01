package baekjoon.step11;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 스택
 *
 * @author : tildev
 * @date : 2023-05-01
 */
public class q10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                int value = Integer.parseInt(st.nextToken());
                stack.push(value);
            } else if (command.equals("top")) {
                if (stack.empty()) {
                    bw.write("-1");
                } else {
                    bw.write(String.valueOf(stack.peek()));
                }
                bw.newLine();
            } else if (command.equals("size")) {
                bw.write(String.valueOf(stack.size()));
                bw.newLine();
            } else if (command.equals("empty")) {
                if (stack.empty()) {
                    bw.write("1");
                } else {
                    bw.write("0");
                }
                bw.newLine();
            } else if (command.equals("pop")) {
                if (stack.empty()) {
                    bw.write("-1");
                } else {
                    bw.write(String.valueOf(stack.pop()));
                }
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}
