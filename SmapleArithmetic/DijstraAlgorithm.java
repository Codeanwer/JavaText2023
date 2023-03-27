package SmapleArithmetic;

import java.util.Scanner;

/**
 * @BelongsProject: 迪杰斯特拉算法
 * @BelongsPackage: SmapleArithmetic
 * @Author: CatherineSS
 * @CreateTime: 2022-11-24  21:38
 * @Description: TODO
 * @Version: 1.0
 */
public class DijstraAlgorithm {
    public static int Max_value = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入顶点数以及边数：");
        int vertex = sc.nextInt();//顶点数
        int edge = sc.nextInt();//边数
        int[][] matrix = new int[Max_value][Max_value];
        //初始化矩阵
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                matrix[i][j] = Max_value;
            }
        }
        for (int i = 0; i < edge; i++) {
            System.out.println("请输入第" + (i + 1) + "条边以及他的权值");
            int source = sc.nextInt();//x坐标
            int target = sc.nextInt();//y坐标
            int weight = sc.nextInt();//权值
            matrix[source][target] = weight;
        }
        //单源最短路径，源点
        int source = sc.nextInt();
        dijstra(matrix, source);
    }

    /**
     * @description: 迪杰斯特拉
     * @author: CatherineSS
     * @date: 23:27
     * @param: [matrix, source]
     * @return: null
     **/
    public static void dijstra(int[][] matrix, int source) {
        //最短路径长度
        int[] shortest = new int[matrix.length];
        //判断该点的最短路径是否求出
        int[] visited = new int[matrix.length];
        //存储输出路径
        String[] path = new String[matrix.length];

        //初始化输出路径
        for (int i = 0; i < matrix.length; i++) {
            path[i] = new String(source + "->" + i);
        }
            //初始化源节点
            shortest[source] = 0;
            visited[source] = 1;

            for (int i = 1; i < matrix.length; i++) {
                int min = Integer.MAX_VALUE;
                int index = -1;


        for (int j = 0; j < matrix.length; j++) {
            //已经求出最短路径的节点不需要再加入计算并判断加入节点后是否存在更短路径
            if (visited[j] == 0 && matrix[source][j] < min) {
                min = matrix[source][j];
                index = j;
            }
        }


        //更新最短路径
        shortest[index] = min;
        visited[index] = 1;

        //更新从index跳到其它节点的较短路径
        for (int m = 0; m < matrix.length; m++) {
            if (visited[m] == 0 && matrix[source][index] + matrix[index][m] < matrix[source][m]) {
                matrix[source][m] = matrix[source][index] + matrix[index][m];
                path[m] = path[index] + "->" + m;
            }
        }
            }
        for (int i = 0; i < matrix.length; i++) {
            if (i != source) {
                if (shortest[i] == Max_value) {
                    System.out.println(source + "到" + i + "不可达");
                } else {
                    System.out.println(source + "到" + i + "的最短路径为：" + path[i] + "，最短距离是：" + shortest[i]);
                }
            }
        }
    }
}
