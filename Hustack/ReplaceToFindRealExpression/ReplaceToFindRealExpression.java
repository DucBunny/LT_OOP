
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplaceToFindRealExpression {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(br.readLine());
            String[] strInput = br.readLine().split(" ");
            int[] input = new int[count];
            for (int i = 0; i < count; i++)
                input[i] = Integer.parseInt(strInput[i]);

            Try(input, 0, "");
        } catch (IOException | NumberFormatException e) {
            System.out.println(e);
        }
    }

    public static boolean check(int input[]) {
        int check = 0;
        for (int x : input) {
            if (x == 1)
                check++;
            else if (x == 2)
                check--;

            if (check < 0)
                return false;
        }
        return check == 0;
    }

    public static void Try(int input[], int i, String result) {
        if (i == input.length) {
            if (check(input))
                System.out.print(result + " ");
            return;
        }

        if (input[i] == 0) {
            input[i] = 1;
            Try(input, i + 1, result + "1");
            input[i] = 2;
            Try(input, i + 1, result + "2");
            input[i] = 0;
        } else
            Try(input, i + 1, result + input[i]);
    }
}
