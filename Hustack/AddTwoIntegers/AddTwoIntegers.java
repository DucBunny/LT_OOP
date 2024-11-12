import java.io.*;

public class AddTwoIntegers {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String a[] = br.readLine().split(" ");
            String result = "";
            String x = a[0];
            String y = a[1];

            int carry = 0;
            int xLength = x.length() - 1;
            int yLength = y.length() - 1;

            while (xLength >= 0 || yLength >= 0) {
                int sum = carry;
                if (xLength >= 0) {
                    sum += x.charAt(xLength) - '0';
                    xLength--;
                }
                if (yLength >= 0) {
                    sum += y.charAt(yLength) - '0';
                    yLength--;
                }
                carry = sum / 10;
                result = String.valueOf(sum % 10) + result;
            }

            if (carry > 0)
                result = String.valueOf(carry) + result;

            System.out.println(result);

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}

/*
 * Input:
 * 200000000000 200000000000
 * Output:
 * 400000000000
 */