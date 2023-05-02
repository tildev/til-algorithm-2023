package baekjoon.step00;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

/**
 * 바이러스
 *
 * @author : tildev
 * @date : 2023-05-02
 */
public class q2606 {

    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static final int START_VERTEX = 1;

    public static void main(String[] args) throws Exception {

        int vertexCnt = Integer.parseInt(br.readLine()); // 정점 개수
        int edgeCnt = Integer.parseInt(br.readLine()); // 간선 개수

        List<Integer>[] initList = initList(vertexCnt, edgeCnt);

        boolean[] visited = new boolean[vertexCnt + 1];

        bfs(initList, visited);
        int comCnt = 0;
        for (boolean vi : visited) {
            if (vi) {
                comCnt++;
            }
        }

        bw.write(String.valueOf(comCnt - 1));

        bw.flush();
        bw.close();
    }

    private static void bfs(List<Integer>[] initList, boolean[] visited) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(START_VERTEX);
        visited[START_VERTEX] = true;

        while (queue.size() > 0) {
            int v = queue.poll();
            for (int vv : initList[v]) {
                if (!visited[vv]) {
                    queue.add(vv);
                    visited[vv] = true;
                }
            }
        }

    }

    /**
     * 리스트 세팅
     *
     * @param vCnt int
     * @param eCnt int
     * @return
     * @throws IOException
     */
    private static List<Integer>[] initList(int vCnt, int eCnt) throws IOException {
        List<Integer>[] initList = new ArrayList[vCnt + 1];

        for (int i = 1; i <= vCnt; i++) {
            initList[i] = new ArrayList<>();
        }

        for (int i = 0; i < eCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int vv1 = Integer.parseInt(st.nextToken());
            int vv2 = Integer.parseInt(st.nextToken());
            initList[vv1].add(vv2);
            initList[vv2].add(vv1);
        }

        for (int i = 1; i <= vCnt; i++) {
            Collections.sort(initList[i]);
        }
        return initList;
    }
}
