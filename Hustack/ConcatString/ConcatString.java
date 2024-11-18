import java.io.*;

public class ConcatString {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int length1 = Integer.parseInt(br.readLine());
            String s1 = br.readLine();
            int length2 = Integer.parseInt(br.readLine());
            String s2 = br.readLine();
            int k = Integer.parseInt(br.readLine());
            int t = Integer.parseInt(br.readLine());

            StringBuilder str = new StringBuilder();
            while (k-- > 0)
                str.append(s1);
            while (t-- > 0)
                str.append(s2);

            System.out.println(str);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
