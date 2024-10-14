import java.io.*;

public class B4 {
    public static void main(String[] args) {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        try {
            int n;
            do {
                System.out.println("Nhap n:");
                n = Integer.valueOf(br.readLine());
            } while (n < 3 || n > 8);
            System.out.println();
            int a[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("Nhap phan tu hang " + i + " va cot " + j + ":");
                    a[i][j] = Integer.valueOf(br.readLine());
                }
            }
            System.out.println("Ma tran da nhap vao:");
            for (int i = 0; i < n; i++) {
                System.out.println();
                for (int j = 0; j < n; j++) {
                    System.out.print(" " + a[i][j]);
                }
            }
        } catch (Exception e) {
            System.out.println("Error ");
        }
    }
}