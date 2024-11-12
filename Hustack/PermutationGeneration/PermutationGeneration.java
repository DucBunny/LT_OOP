import java.io.*;

public class PermutationGeneration {
    static final int MAX = 100;
    static int n;
    static int[] bool = new int[MAX]; // 0: chưa duyệt, 1: đã duyệt
    static int[] a = new int[MAX];

    public static void Try(int k) {
        for (int i = 1; i <= n; i++) {
            if (bool[i] == 0) { // nếu chưa duyệt
                a[k] = i; // gán giá trị cho a[k]
                bool[i] = 1; // đánh dấu đã duyệt

                if (k == n) {
                    for (int j = 1; j <= n; j++)
                        System.out.print(a[j] + " ");

                    System.out.println();
                } else
                    Try(k + 1);

                bool[i] = 0; // trả lại trạng thái ban đầu
            }
        }
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            n = Integer.parseInt(br.readLine());
            Try(1);

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}

/*
 * In hoán vị từ 1 -> n
 * Input
 * 3
 * Output
 * 1 2 3
 * 1 3 2
 * 2 1 3
 * 2 3 1
 * 3 1 2
 * 3 2 1
 */