package baekjoon.step11;

import java.io.*;
import java.util.Stack;

/**
 * 스택
 *
 * @author : tildev
 * @date : 2023-05-01
 */
public class q9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        Stack<Integer> stack;

        while (t-- > 0) {
            String s = br.readLine();
            stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(') {
                    stack.add(1);
                } else {
                    if (stack.empty()) {
                        stack.add(1);
                        break;
                    }
                    stack.pop();
                }
            }
            if (stack.empty()) {
                bw.write("YES");
            } else {
                bw.write("NO");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
