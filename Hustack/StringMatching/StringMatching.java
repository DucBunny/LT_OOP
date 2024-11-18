import java.io.*;

public class StringMatching {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int length1 = Integer.parseInt(br.readLine());
            String s1 = br.readLine();
            int length2 = Integer.parseInt(br.readLine());
            String s2 = br.readLine();

            for (int i = 0; i < length1 - length2 + 1; i++)
                if (s1.substring(i, i + length2).equals(s2))
                    System.out.print(i + " ");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
