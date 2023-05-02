package baekjoon.step00;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/**
 * DFS와 BFS
 *
 * @author : tildev
 * @date : 2023-05-02
 */
public class q1260 {

    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 정점 개수
        int m = Integer.parseInt(st.nextToken()); // 간선 개수
        int v = Integer.parseInt(st.nextToken()); // 시작 정점

        List<Integer>[] arrayList = new ArrayList[n + 1]; // 정점번호는 1 부터이므로

        for (int i = 1; i <= n; i++) {
            arrayList[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int vv1 = Integer.parseInt(st.nextToken());
            int vv2 = Integer.parseInt(st.nextToken());
            arrayList[vv1].add(vv2);
            arrayList[vv2].add(vv1);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(arrayList[i]);
        }

        dFS(arrayList, n, v);
        bw.newLine();
        bFS(arrayList, n, v);

        bw.flush();
        bw.close();
    }

    private static void recursionDFS(List<Integer>[] arrayList, boolean[] visited, int v) throws Exception {
        if (visited[v]) {
            return;
        }

        visited[v] = true;
        bw.write(v + " ");

        for (int vv : arrayList[v]) {
            if (!visited[vv]) {
                recursionDFS(arrayList, visited, vv);
            }
        }
    }

    private static void dFS(List<Integer>[] arrayList, int n, int v) throws Exception {
        boolean[] visited = new boolean[n + 1];
        recursionDFS(arrayList, visited, v);
    }

    private static void bFS(List<Integer>[] arrayList, int n, int v) throws Exception {
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];

        queue.add(v);
        visited[v] = true;

        while (queue.size() > 0) {
            v = queue.poll();
            bw.write(v + " ");

            for (int vv : arrayList[v]) {
                if (!visited[vv]) {
                    queue.add(vv);
                    visited[vv] = true;
                }
            }
        }
    }

}
