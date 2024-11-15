import java.io.*;

public class SumArray {
    public static void main(String[] args) {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        try {
            int size = Integer.parseInt(br.readLine());
            String[] a = br.readLine().split(" ");
            int sum = 0;

            for (int i = 0; i < size; i++)
                sum += Integer.parseInt(a[i]);

            System.out.println(sum);

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}

/*
 * Input:
 * 10
 * 3 -1 -3 5 2 5 0 -1 5 4
 * Output:
 * 19
 */