import java.io.*;

public class FindPerimeterAndAreaOfARectangle {
    public static void main(String[] args) {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        try {
            String[] a = br.readLine().split(" ");
            int perimeter = 0;
            int area = 1;

            for (String x : a) {
                perimeter += 2 * Integer.parseInt(x);
                area *= Integer.parseInt(x);
            }

            System.out.println(perimeter + " " + area);

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}

/*
 * Input:
 * 7 12
 * Output:
 * 38 84
 */