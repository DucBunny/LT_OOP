import java.io.*;

public class CountAndReplaceCharInString {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int input = Integer.parseInt(br.readLine());
            String s = br.readLine();

            char first = br.readLine().charAt(0);
            char second = br.readLine().charAt(0);
            int count = 0;
            for (int i = 0; i < input; i++)
                if (s.charAt(i) == first)
                    count++;

            System.out.print(count + " " + s.replace(first, second));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
